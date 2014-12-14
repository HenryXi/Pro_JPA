package c413dbIdentityIdGeneration.model.stateless;

import c413dbIdentityIdGeneration.model.Employee413;

import java.util.Collection;

public interface EmployeeService413 {
    public Employee413 createEmployee(String name, long salary);
    public Collection<Employee413> findAllEmployees();
}
