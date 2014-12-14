package c413dbIdentityIdGeneration.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c413dbIdentityIdGeneration.model.Employee413;

@Stateless
public class EmployeeServiceBean413 implements EmployeeService413 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee413 createEmployee(String name, long salary) {
        Employee413 emp = new Employee413();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee413> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee413 e");
        return (Collection<Employee413>) query.getResultList();
    }
}
