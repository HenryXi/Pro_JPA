package c420oneToManyTargetEntity.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c420oneToManyTargetEntity.model.Department420;
import c420oneToManyTargetEntity.model.Employee420;

@Stateless
public class EmployeeServiceBean420 implements EmployeeService420 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee420 createEmployee(String name, long salary) {
        Employee420 emp = new Employee420();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee420 setEmployeeDepartment(int empId, int deptId) {
        Employee420 emp = em.find(Employee420.class, empId);
        Department420 dept = em.find(Department420.class, deptId);
        dept.addEmployee(emp);
        return emp;
    }

    public Collection<Employee420> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee420 e");
        return (Collection<Employee420>) query.getResultList();
    }
}
