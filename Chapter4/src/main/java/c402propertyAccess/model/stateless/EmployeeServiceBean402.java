package c402propertyAccess.model.stateless;

import c402propertyAccess.model.Employee402;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EmployeeServiceBean402 implements EmployeeService402 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee402 createEmployee(int id, String name, long salary) {
        Employee402 emp = new Employee402();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee402> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee402 e");
        return (Collection<Employee402>) query.getResultList();
    }
}
