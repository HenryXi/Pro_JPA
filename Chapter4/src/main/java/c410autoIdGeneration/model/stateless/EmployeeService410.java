package c410autoIdGeneration.model.stateless;

import java.util.Collection;

import c410autoIdGeneration.model.Employee410;

public interface EmployeeService410 {
    public Employee410 createEmployee(String name, long salary);
    public Collection<Employee410> findAllEmployees();
}
