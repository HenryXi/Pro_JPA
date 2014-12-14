package c408temporalMapping.model.stateless;

import java.util.Calendar;
import java.util.Collection;

import c408temporalMapping.model.Employee408;

public interface EmployeeService408 {
    public Employee408 createEmployee(int id, String name, long salary, Calendar dob);
    public Collection<Employee408> findAllEmployees();
}
