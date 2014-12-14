package c408temporalMapping.model.stateless;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c408temporalMapping.model.Employee408;

@Stateless
public class EmployeeServiceBean408 implements EmployeeService408 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee408 createEmployee(int id, String name, long salary, Calendar dob) {
        Employee408 emp = new Employee408();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setDob(dob);
        emp.setStartDate(new Date());
        em.persist(emp);
        
        return emp;
    }

    public Collection<Employee408> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee408 e");
        return (Collection<Employee408>) query.getResultList();
    }
}
