package c412sequenceIdGeneration.model.stateless;

import c412sequenceIdGeneration.model.Employee412;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EmployeeServiceBean412 implements EmployeeService412 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee412 createEmployee(String name, long salary) {
        Employee412 emp = new Employee412();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee412> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee412 e");
        return (Collection<Employee412>) query.getResultList();
    }
}
