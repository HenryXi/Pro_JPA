package c407enumMapping.model.stateless;

import java.util.Collection;

import c407enumMapping.model.Employee407;
import c407enumMapping.model.EmployeeType;

public interface EmployeeService407 {
    public Employee407 createEmployee(int id, String name, long salary, EmployeeType type);
    public Collection<Employee407> findAllEmployees();
}
