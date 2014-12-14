package c410autoIdGeneration.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c410autoIdGeneration.model.Employee410;

@Stateless
public class EmployeeServiceBean410 implements EmployeeService410 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee410 createEmployee(String name, long salary) {
        Employee410 emp = new Employee410();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee410> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee410 e");
        return (Collection<Employee410>) query.getResultList();
    }
}
