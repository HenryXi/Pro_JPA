package c422manyToManyJoinTable.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c422manyToManyJoinTable.model.Employee422;
import c422manyToManyJoinTable.model.Project422;

@Stateless
public class EmployeeServiceBean422 implements EmployeeService422 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee422 createEmployee(String name, long salary) {
        Employee422 emp = new Employee422();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee422 addEmployeeProject(int empId, int projId) {
        Employee422 emp = em.find(Employee422.class, empId);
        Project422 proj = em.find(Project422.class, projId);
        proj.addEmployee(emp);
        return emp;
    }

    public Collection<Employee422> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee422 e");
        return (Collection<Employee422>) query.getResultList();
    }
}
