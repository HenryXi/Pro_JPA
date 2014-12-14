package c405customColumnMapping.model.stateless;

import c405customColumnMapping.model.Employee405;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EmployeeServiceBean405 implements EmployeeService405 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee405 createEmployee(int id, String name, long salary, String comments) {
        Employee405 emp = new Employee405();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setComments(comments);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee405> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee405 e");
        return (Collection<Employee405>) query.getResultList();
    }
}
