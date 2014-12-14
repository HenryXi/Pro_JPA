package c403mixedAccess.model.stateless;

import c403mixedAccess.model.Employee403;

import java.util.Collection;

public interface EmployeeService403 {
    public Employee403 createEmployee(int id, String name, long salary);
    public Collection<Employee403> findAllEmployees();
}
