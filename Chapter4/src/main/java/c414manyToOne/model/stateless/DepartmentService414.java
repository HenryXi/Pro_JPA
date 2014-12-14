package c414manyToOne.model.stateless;

import java.util.Collection;

import c414manyToOne.model.Department414;

public interface DepartmentService414 {
    public Department414 createDepartment(String name);
    public Collection<Department414> findAllDepartments();
}
