package c421manyToManyBidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c421manyToManyBidirectional.model.Employee421;
import c421manyToManyBidirectional.model.Project421;

@Stateless
public class EmployeeServiceBean421 implements EmployeeService421 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee421 createEmployee(String name, long salary) {
        Employee421 emp = new Employee421();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee421 addEmployeeProject(int empId, int projId) {
        Employee421 emp = em.find(Employee421.class, empId);
        Project421 proj = em.find(Project421.class, projId);
        proj.addEmployee(emp);
        return emp;
    }

    public Collection<Employee421> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee421 e");
        return (Collection<Employee421>) query.getResultList();
    }
}
