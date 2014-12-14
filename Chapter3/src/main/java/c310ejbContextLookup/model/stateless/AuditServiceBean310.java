package c310ejbContextLookup.model.stateless;

import javax.ejb.Stateless;

@Stateless
public class AuditServiceBean310 implements AuditService310 {
    public void audit() {
        System.out.println("Audit performed.");
    }
}

