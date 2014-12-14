package c406lobMapping.model.stateless;

import c406lobMapping.model.Employee406;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EmployeeServiceBean406 implements EmployeeService406 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee406 createEmployee(int id, String name, long salary, byte[] pic) {
        Employee406 emp = new Employee406();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setPicture(pic);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee406> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee406 e");
        return (Collection<Employee406>) query.getResultList();
    }
}
