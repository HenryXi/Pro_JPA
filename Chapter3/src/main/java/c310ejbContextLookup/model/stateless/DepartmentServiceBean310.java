package c310ejbContextLookup.model.stateless;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
@EJB(name="audit310", beanInterface=AuditService310.class)
public class DepartmentServiceBean310 implements DepartmentService310 {
    // use of resource dependency injection is covered later in the chapter
    @Resource SessionContext context;
    AuditService310 audit;

    public void setSessionContext(SessionContext context) {
        this.context = context;
    }
    
    @PostConstruct
    public void init() {
        audit = (AuditService310) context.lookup("audit310");
    }

    public void performAudit() {
        audit.audit();
    }
    
    // ...
}

