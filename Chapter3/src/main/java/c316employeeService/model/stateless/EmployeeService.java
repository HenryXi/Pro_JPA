package c316employeeService.model.stateless;

import c316employeeService.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    public Employee createEmployee(int id, String name, long salary);
    public Employee removeEmployee(int id);
    public Employee changeEmployeeSalary(int id, long newSalary);
    public Employee findEmployee(int id);
    public Collection<Employee> findAllEmployees();
}
