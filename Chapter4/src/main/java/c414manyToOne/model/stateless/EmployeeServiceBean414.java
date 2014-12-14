package c414manyToOne.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c414manyToOne.model.Department414;
import c414manyToOne.model.Employee414;

@Stateless
public class EmployeeServiceBean414 implements EmployeeService414 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee414 createEmployee(String name, long salary) {
        Employee414 emp = new Employee414();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee414 setEmployeeDepartment(int empId, int deptId) {
        Employee414 emp = em.find(Employee414.class, empId);
        Department414 dept = em.find(Department414.class, deptId);
        emp.setDepartment(dept);
        return emp;
    }

    public Collection<Employee414> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee414 e");
        return (Collection<Employee414>) query.getResultList();
    }
}
