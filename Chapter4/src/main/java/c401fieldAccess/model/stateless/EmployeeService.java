package c401fieldAccess.model.stateless;

import c401fieldAccess.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    public Employee createEmployee(int id, String name, long salary);
    public Collection<Employee> findAllEmployees();
}
