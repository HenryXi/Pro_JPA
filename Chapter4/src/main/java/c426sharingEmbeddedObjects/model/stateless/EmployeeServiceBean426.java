package c426sharingEmbeddedObjects.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c426sharingEmbeddedObjects.model.Address426;
import c426sharingEmbeddedObjects.model.Company426;
import c426sharingEmbeddedObjects.model.Employee426;

@Stateless
public class EmployeeServiceBean426 implements EmployeeService426 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee426 createEmployeeAndAddress(int id, String name, long salary,
            String street, String city, String state, String zip) {
        Employee426 emp = new Employee426();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        Address426 addr = new Address426();
        addr.setStreet(street);
        addr.setCity(city);
        addr.setState(state);
        addr.setZip(zip);
        emp.setAddress(addr);
        em.persist(emp);
        
        return emp;
    }

    public Company426 createCompanyAndAddress(int id,
            String street, String city, String state, String zip) {
        Company426 c = new Company426();
        c.setId(id);
        Address426 addr = new Address426();
        addr.setStreet(street);
        addr.setCity(city);
        addr.setState(state);
        addr.setZip(zip);
        c.setAddress(addr);

        em.persist(c);        
        return c;
    }

    public Collection<Employee426> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee426 e");
        return (Collection<Employee426>) query.getResultList();
    }
    
    public Collection<Company426> findAllCompanies() {
        Query query = em.createQuery("SELECT c FROM Company426 c");
        return (Collection<Company426>) query.getResultList();
    }
}
