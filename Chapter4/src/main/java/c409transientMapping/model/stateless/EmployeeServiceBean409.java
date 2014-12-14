package c409transientMapping.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c409transientMapping.model.Employee409;

@Stateless
public class EmployeeServiceBean409 implements EmployeeService409 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee409 createEmployee(int id, String name, long salary) {
        Employee409 emp = new Employee409();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee409> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee409 e");
        return (Collection<Employee409>) query.getResultList();
    }
}
