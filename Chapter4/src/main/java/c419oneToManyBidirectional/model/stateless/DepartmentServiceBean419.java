package c419oneToManyBidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c419oneToManyBidirectional.model.Department419;

@Stateless
public class DepartmentServiceBean419 implements DepartmentService419 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Department419 createDepartment(String name) {
        Department419 dept = new Department419();
        dept.setName(name);
        em.persist(dept);
        
        return dept;
    }

    public Collection<Department419> findAllDepartments() {
        Query query = em.createQuery("SELECT d FROM Department419 d");
        return (Collection<Department419>) query.getResultList();
    }
}
