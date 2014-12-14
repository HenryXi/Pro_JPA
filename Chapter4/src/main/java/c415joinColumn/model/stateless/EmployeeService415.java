package c415joinColumn.model.stateless;

import c415joinColumn.model.Employee415;

import java.util.Collection;

public interface EmployeeService415 {
    public Employee415 createEmployee(String name, long salary);
    public Employee415 setEmployeeDepartment(int empId, int deptId);
    public Collection<Employee415> findAllEmployees();
}
