package c416oneToOneUnidirectional.model.stateless;

import java.util.Collection;

import c416oneToOneUnidirectional.model.Employee416;

public interface EmployeeService416 {
    public Employee416 createEmployee(String name, long salary);
    public Employee416 setEmployeeParkingSpace(int empId, int spaceId);
    public Collection<Employee416> findAllEmployees();
}
