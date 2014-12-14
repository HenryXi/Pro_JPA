package c414manyToOne.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c414manyToOne.model.Department414;

@Stateless
public class DepartmentServiceBean414 implements DepartmentService414 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Department414 createDepartment(String name) {
        Department414 dept = new Department414();
        dept.setName(name);
        em.persist(dept);
        
        return dept;
    }

    public Collection<Department414> findAllDepartments() {
        Query query = em.createQuery("SELECT d FROM Department414 d");
        return (Collection<Department414>) query.getResultList();
    }
}
