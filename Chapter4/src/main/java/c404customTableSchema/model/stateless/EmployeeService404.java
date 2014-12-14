package c404customTableSchema.model.stateless;

import c404customTableSchema.model.Employee404;

import java.util.Collection;

public interface EmployeeService404 {
    public Employee404 createEmployee(int id, String name, long salary);
    public Collection<Employee404> findAllEmployees();
}
