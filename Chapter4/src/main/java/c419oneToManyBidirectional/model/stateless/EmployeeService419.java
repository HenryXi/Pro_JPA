package c419oneToManyBidirectional.model.stateless;

import java.util.Collection;

import c419oneToManyBidirectional.model.Employee419;

public interface EmployeeService419 {
    public Employee419 createEmployee(String name, long salary);
    public Employee419 setEmployeeDepartment(int empId, int deptId);
    public Collection<Employee419> findAllEmployees();
}
