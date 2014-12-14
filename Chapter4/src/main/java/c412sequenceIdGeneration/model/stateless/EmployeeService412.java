package c412sequenceIdGeneration.model.stateless;

import c412sequenceIdGeneration.model.Employee412;

import java.util.Collection;

public interface EmployeeService412 {
    public Employee412 createEmployee(String name, long salary);
    public Collection<Employee412> findAllEmployees();
}
