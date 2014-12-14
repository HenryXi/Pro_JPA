package c420oneToManyTargetEntity.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c420oneToManyTargetEntity.model.Department420;
@Stateless
public class DepartmentServiceBean420 implements DepartmentService420 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Department420 createDepartment(String name) {
        Department420 dept = new Department420();
        dept.setName(name);
        em.persist(dept);
        
        return dept;
    }

    public Collection<Department420> findAllDepartments() {
        Query query = em.createQuery("SELECT d FROM Department420 d");
        return (Collection<Department420>) query.getResultList();
    }
}
