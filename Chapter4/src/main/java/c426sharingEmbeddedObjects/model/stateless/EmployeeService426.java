package c426sharingEmbeddedObjects.model.stateless;

import java.util.Collection;

import c426sharingEmbeddedObjects.model.Company426;
import c426sharingEmbeddedObjects.model.Employee426;

public interface EmployeeService426 {
    public Employee426 createEmployeeAndAddress(int id, String name, long salary,
                                             String street, String city, String state, String zip);
    public Company426 createCompanyAndAddress(int id,
                                           String street, String city, String state, String zip);
    public Collection<Employee426> findAllEmployees();
    public Collection<Company426> findAllCompanies();
}
