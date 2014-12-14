package c417oneToOneBidirectional.model.stateless;

import java.util.Collection;

import c417oneToOneBidirectional.model.Employee417;

public interface EmployeeService417 {
    public Employee417 createEmployee(String name, long salary);
    public Employee417 setEmployeeParkingSpace(int empId, int spaceId);
    public Collection<Employee417> findAllEmployees();
}
