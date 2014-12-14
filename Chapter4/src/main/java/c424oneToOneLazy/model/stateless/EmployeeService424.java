package c424oneToOneLazy.model.stateless;

import java.util.Collection;

import c424oneToOneLazy.model.Employee424;

public interface EmployeeService424 {
    public Employee424 createEmployee(String name, long salary);
    public Employee424 setEmployeeParkingSpace(int empId, int spaceId);
    public Collection<Employee424> findAllEmployees();
}
