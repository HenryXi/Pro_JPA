package c418oneToOnePkMapping.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c418oneToOnePkMapping.model.Employee418;

@Stateless
public class EmployeeServiceBean418 implements EmployeeService418 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee418 createEmployee(int id, String name, long salary) {
        Employee418 emp = new Employee418();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee418> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee418 e");
        return (Collection<Employee418>) query.getResultList();
    }
}
