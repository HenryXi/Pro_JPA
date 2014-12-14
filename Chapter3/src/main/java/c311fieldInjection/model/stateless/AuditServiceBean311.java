package c311fieldInjection.model.stateless;

import javax.ejb.Stateless;

@Stateless
public class AuditServiceBean311 implements AuditService311 {
    public void audit() {
        System.out.println("Audit performed.");
    }
}

