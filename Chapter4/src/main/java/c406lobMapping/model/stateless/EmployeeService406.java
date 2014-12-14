package c406lobMapping.model.stateless;

import c406lobMapping.model.Employee406;

import java.util.Collection;

public interface EmployeeService406 {
    public Employee406 createEmployee(int id, String name, long salary, byte[] pic);
    public Collection<Employee406> findAllEmployees();
}
