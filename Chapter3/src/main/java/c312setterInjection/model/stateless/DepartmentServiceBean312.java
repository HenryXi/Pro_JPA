package c312setterInjection.model.stateless;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DepartmentServiceBean312 implements DepartmentService312 {
    private AuditService312 audit;

    @EJB
    public void setAuditService(AuditService312 audit) {
        this.audit = audit;
    }

    public void performAudit() {
        audit.audit();
    }
    
    // ...
}

