package c312setterInjection.model.stateless;

import javax.ejb.Stateless;

@Stateless
public class AuditServiceBean312 implements AuditService312 {
    public void audit() {
        System.out.println("Audit performed.");
    }
}

