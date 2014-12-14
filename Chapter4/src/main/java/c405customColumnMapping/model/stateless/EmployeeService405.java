package c405customColumnMapping.model.stateless;

import java.util.Collection;
import c405customColumnMapping.model.Employee405;

public interface EmployeeService405 {
    public Employee405 createEmployee(int id, String name, long salary, String comments);
    public Collection<Employee405> findAllEmployees();
}
