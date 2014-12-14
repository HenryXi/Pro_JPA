package c311fieldInjection.model.stateless;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DepartmentServiceBean311 implements DepartmentService311 {
    @EJB AuditService311 audit;

    public void performAudit() {
        audit.audit();
    }
    
    // ...
}

