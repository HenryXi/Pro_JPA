package c425embeddedObjects.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c425embeddedObjects.model.Address425;
import c425embeddedObjects.model.Employee425;

@Stateless
public class EmployeeServiceBean425 implements EmployeeService425 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee425 createEmployeeAndAddress(int id, String name, long salary,
            String street, String city, String state, String zip) {
        Employee425 emp = new Employee425();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        Address425 addr = new Address425();
        addr.setStreet(street);
        addr.setCity(city);
        addr.setState(state);
        addr.setZip(zip);
        emp.setAddress(addr);
        
        em.persist(emp);
        
        return emp;
	}

    public Collection<Employee425> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee425 e");
        return (Collection<Employee425>) query.getResultList();
    }
}
