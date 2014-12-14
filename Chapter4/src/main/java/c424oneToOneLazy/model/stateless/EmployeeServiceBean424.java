package c424oneToOneLazy.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c424oneToOneLazy.model.Employee424;
import c424oneToOneLazy.model.ParkingSpace424;

@Stateless
public class EmployeeServiceBean424 implements EmployeeService424 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee424 createEmployee(String name, long salary) {
        Employee424 emp = new Employee424();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee424 setEmployeeParkingSpace(int empId, int spaceId) {
        Employee424 emp = em.find(Employee424.class, empId);
        ParkingSpace424 pSpace = em.find(ParkingSpace424.class, spaceId);
        emp.setParkingSpace(pSpace);
        return emp;
    }

    public Collection<Employee424> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee424 e");
        return (Collection<Employee424>) query.getResultList();
    }
}
