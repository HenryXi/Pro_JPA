package c423oneToManyUnidirectional.model.stateless;

import java.util.Collection;

import c423oneToManyUnidirectional.model.Employee423;

public interface EmployeeService423 {
    public Employee423 createEmployee(String name, long salary);
    public Employee423 addEmployeePhone(int empId, int phoneId);
    public Collection<Employee423> findAllEmployees();
}
