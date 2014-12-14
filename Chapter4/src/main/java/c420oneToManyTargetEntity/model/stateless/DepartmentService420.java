package c420oneToManyTargetEntity.model.stateless;

import c420oneToManyTargetEntity.model.Department420;

import java.util.Collection;

public interface DepartmentService420 {
    public Department420 createDepartment(String name);
    public Collection<Department420> findAllDepartments();
}
