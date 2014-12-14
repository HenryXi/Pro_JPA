package c417oneToOneBidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c417oneToOneBidirectional.model.Employee417;
import c417oneToOneBidirectional.model.ParkingSpace417;

@Stateless
public class EmployeeServiceBean417 implements EmployeeService417 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee417 createEmployee(String name, long salary) {
        Employee417 emp = new Employee417();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee417 setEmployeeParkingSpace(int empId, int spaceId) {
        Employee417 emp = em.find(Employee417.class, empId);
        ParkingSpace417 pSpace = em.find(ParkingSpace417.class, spaceId);
        emp.setParkingSpace(pSpace);
        pSpace.setEmployee(emp);
        return emp;
    }

    public Collection<Employee417> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee417 e");
        return (Collection<Employee417>) query.getResultList();
    }
}
