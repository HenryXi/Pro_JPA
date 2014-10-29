package c307mdbExample.model.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.TextMessage;

// use of mappedName is vendor specific.  In this case, it is used
// to specify the JNDI location of the JMS Queue to use.
// WARNING:
// this deom need config JMS in glassfish like below:
// connection factory: name -> factory ; type -> Queue
// destination       : name -> destinationQueue; type -> Queue
@MessageDriven(
    mappedName="destinationQueue",
    activationConfig = {
        @ActivationConfigProperty(propertyName="destinationType",
                                  propertyValue="javax.jms.Queue"),
        @ActivationConfigProperty(propertyName="messageSelector",
                                  propertyValue="RECIPIENT='ReportProcessor'")
})
public class ReportProcessorBean implements javax.jms.MessageListener {
    public void onMessage(javax.jms.Message message) {
        try {
            System.out.println("Processing message: " + ((TextMessage) message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
