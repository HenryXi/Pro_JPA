package c403mixedAccess.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c403mixedAccess.model.Employee403;
@Stateless
public class EmployeeServiceBean403 implements EmployeeService403 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee403 createEmployee(int id, String name, long salary) {
        Employee403 emp = new Employee403();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee403> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee403 e");
        return (Collection<Employee403>) query.getResultList();
    }
}
