package c419oneToManyBidirectional.model.stateless;

import c419oneToManyBidirectional.model.Department419;

import java.util.Collection;

public interface DepartmentService419 {
    public Department419 createDepartment(String name);
    public Collection<Department419> findAllDepartments();
}
