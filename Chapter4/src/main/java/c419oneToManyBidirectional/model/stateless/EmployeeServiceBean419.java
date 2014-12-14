package c419oneToManyBidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c419oneToManyBidirectional.model.Department419;
import c419oneToManyBidirectional.model.Employee419;

@Stateless
public class EmployeeServiceBean419 implements EmployeeService419 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee419 createEmployee(String name, long salary) {
        Employee419 emp = new Employee419();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee419 setEmployeeDepartment(int empId, int deptId) {
        Employee419 emp = em.find(Employee419.class, empId);
        Department419 dept = em.find(Department419.class, deptId);
        dept.addEmployee(emp);
        return emp;
    }

    public Collection<Employee419> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee419 e");
        return (Collection<Employee419>) query.getResultList();
    }
}
