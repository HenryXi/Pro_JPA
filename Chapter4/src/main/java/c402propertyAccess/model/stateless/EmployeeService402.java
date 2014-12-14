package c402propertyAccess.model.stateless;

import c402propertyAccess.model.Employee402;

import java.util.Collection;

public interface EmployeeService402 {
    public Employee402 createEmployee(int id, String name, long salary);
    public Collection<Employee402> findAllEmployees();
}
