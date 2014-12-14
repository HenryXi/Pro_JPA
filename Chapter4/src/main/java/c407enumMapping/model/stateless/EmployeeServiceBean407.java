package c407enumMapping.model.stateless;

import c407enumMapping.model.Employee407;
import c407enumMapping.model.EmployeeType;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EmployeeServiceBean407 implements EmployeeService407 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee407 createEmployee(int id, String name, long salary, EmployeeType type) {
        Employee407 emp = new Employee407();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setType(type);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee407> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee407 e");
        return (Collection<Employee407>) query.getResultList();
    }
}
