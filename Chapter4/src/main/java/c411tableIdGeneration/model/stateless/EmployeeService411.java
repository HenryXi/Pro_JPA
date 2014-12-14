package c411tableIdGeneration.model.stateless;

import c411tableIdGeneration.model.Employee411;

import java.util.Collection;

public interface EmployeeService411 {
    public Employee411 createEmployee(String name, long salary,
                                   String street, String city, String state, String zip);
    public Collection<Employee411> findAllEmployees();
}
