package c423oneToManyUnidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c423oneToManyUnidirectional.model.Employee423;
import c423oneToManyUnidirectional.model.Phone423;

@Stateless
public class EmployeeServiceBean423 implements EmployeeService423 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public Employee423 createEmployee(String name, long salary) {
        Employee423 emp = new Employee423();
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        
        return emp;
    }
    
    public Employee423 addEmployeePhone(int empId, int phoneId) {
        Employee423 emp = em.find(Employee423.class, empId);
        Phone423 phone = em.find(Phone423.class, phoneId);
        emp.addPhone(phone);
        return emp;
    }

    public Collection<Employee423> findAllEmployees() {
        Query query = em.createQuery("SELECT e FROM Employee423 e");
        return (Collection<Employee423>) query.getResultList();
    }
}
