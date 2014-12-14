package c404customTableSchema.model.stateless;

import c404customTableSchema.model.Employee404;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EmployeeServiceBean404 implements EmployeeService404 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee404 createEmployee(int id, String name, long salary) {
        Employee404 emp = new Employee404();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee404> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee404 e");
        return (Collection<Employee404>) query.getResultList();
    }
}
