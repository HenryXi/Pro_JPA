package c411tableIdGeneration.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c411tableIdGeneration.model.Address411;
import c411tableIdGeneration.model.Employee411;

@Stateless
public class EmployeeServiceBean411 implements EmployeeService411 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee411 createEmployee(String name, long salary,
            String street, String city, String state, String zip) {
        Employee411 emp = new Employee411();
        emp.setName(name);
        emp.setSalary(salary);
        
        Address411 addr = new Address411();
        addr.setStreet(street);
        addr.setCity(city);
        addr.setState(state);
        addr.setZip(zip);
        emp.setAddress(addr);

        em.persist(emp);
        em.persist(addr);
        
        return emp;
    }

    public Collection<Employee411> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee411 e");
        return (Collection<Employee411>) query.getResultList();
    }
}
