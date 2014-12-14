package c416oneToOneUnidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c416oneToOneUnidirectional.model.Employee416;
import c416oneToOneUnidirectional.model.ParkingSpace416;

@Stateless
public class EmployeeServiceBean416 implements EmployeeService416 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee416 createEmployee(String name, long salary) {
        Employee416 emp = new Employee416();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee416 setEmployeeParkingSpace(int empId, int spaceId) {
        Employee416 emp = em.find(Employee416.class, empId);
        ParkingSpace416 pSpace = em.find(ParkingSpace416.class, spaceId);
        emp.setParkingSpace(pSpace);
        return emp;
    }

    public Collection<Employee416> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee416 e");
        return (Collection<Employee416>) query.getResultList();
    }
}
