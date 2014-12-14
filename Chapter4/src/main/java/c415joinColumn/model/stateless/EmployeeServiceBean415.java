package c415joinColumn.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c415joinColumn.model.Department415;
import c415joinColumn.model.Employee415;

@Stateless
public class EmployeeServiceBean415 implements EmployeeService415 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee415 createEmployee(String name, long salary) {
        Employee415 emp = new Employee415();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee415 setEmployeeDepartment(int empId, int deptId) {
        Employee415 emp = em.find(Employee415.class, empId);
        Department415 dept = em.find(Department415.class, deptId);
        emp.setDepartment(dept);
        return emp;
    }

    public Collection<Employee415> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee415 e");
        return (Collection<Employee415>) query.getResultList();
    }
}
