package c418oneToOnePkMapping.model.stateless;

import java.util.Collection;

import c418oneToOnePkMapping.model.Employee418;

public interface EmployeeService418 {
    public Employee418 createEmployee(int id, String name, long salary);
    public Collection<Employee418> findAllEmployees();
}
