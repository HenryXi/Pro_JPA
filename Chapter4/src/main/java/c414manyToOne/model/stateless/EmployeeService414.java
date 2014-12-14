package c414manyToOne.model.stateless;

import c414manyToOne.model.Employee414;

import java.util.Collection;

public interface EmployeeService414 {
    public Employee414 createEmployee(String name, long salary);
    public Employee414 setEmployeeDepartment(int empId, int deptId);
    public Collection<Employee414> findAllEmployees();
}
