package c409transientMapping.model.stateless;

import java.util.Collection;

import c409transientMapping.model.Employee409;

public interface EmployeeService409 {
    public Employee409 createEmployee(int id, String name, long salary);
    public Collection<Employee409> findAllEmployees();
}
