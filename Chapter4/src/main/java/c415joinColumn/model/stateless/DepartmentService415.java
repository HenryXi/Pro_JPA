package c415joinColumn.model.stateless;

import java.util.Collection;

import c415joinColumn.model.Department415;

public interface DepartmentService415 {
    public Department415 createDepartment(String name);
    public Collection<Department415> findAllDepartments();
}
