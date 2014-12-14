package c415joinColumn.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c415joinColumn.model.Department415;

@Stateless
public class DepartmentServiceBean415 implements DepartmentService415 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Department415 createDepartment(String name) {
        Department415 dept = new Department415();
        dept.setName(name);
        em.persist(dept);
        
        return dept;
    }

    public Collection<Department415> findAllDepartments() {
        Query query = em.createQuery("SELECT d FROM Department415 d");
        return (Collection<Department415>) query.getResultList();
    }
}
