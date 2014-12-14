package c420oneToManyTargetEntity.model.stateless;

import c420oneToManyTargetEntity.model.Employee420;

import java.util.Collection;

public interface EmployeeService420 {
    public Employee420 createEmployee(String name, long salary);
    public Employee420 setEmployeeDepartment(int empId, int deptId);
    public Collection<Employee420> findAllEmployees();
}
