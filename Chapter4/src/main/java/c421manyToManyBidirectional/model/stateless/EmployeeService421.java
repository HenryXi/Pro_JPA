package c421manyToManyBidirectional.model.stateless;

import java.util.Collection;

import c421manyToManyBidirectional.model.Employee421;

public interface EmployeeService421 {
    public Employee421 createEmployee(String name, long salary);
    public Employee421 addEmployeeProject(int empId, int projId);
    public Collection<Employee421> findAllEmployees();
}
