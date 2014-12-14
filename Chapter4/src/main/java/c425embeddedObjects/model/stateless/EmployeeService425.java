package c425embeddedObjects.model.stateless;

import java.util.Collection;

import c425embeddedObjects.model.Employee425;

public interface EmployeeService425 {
    public Employee425 createEmployeeAndAddress(int id, String name, long salary,
                                             String street, String city, String state, String zip);
    public Collection<Employee425> findAllEmployees();
}
