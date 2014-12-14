package c422manyToManyJoinTable.model.stateless;

import c422manyToManyJoinTable.model.Employee422;

import java.util.Collection;


public interface EmployeeService422 {
    public Employee422 createEmployee(String name, long salary);
    public Employee422 addEmployeeProject(int empId, int projId);
    public Collection<Employee422> findAllEmployees();
}
