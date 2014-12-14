package c422manyToManyJoinTable.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project422 {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id;
    protected String name;
    @ManyToMany(mappedBy="projects")
    private Collection<Employee422> employees;

    public Project422() {
        employees = new ArrayList<Employee422>();
    }

    public int getId() {
        return id;
    }
    
    public void setId(int projectNo) {
        this.id = projectNo;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String projectName) {
        this.name = projectName;
    }
    
    public Collection<Employee422> getEmployees() {
        return employees;
    }
    
    public void addEmployee(Employee422 employee) {
        if (!getEmployees().contains(employee)) {
            getEmployees().add(employee);
        }
        if (!employee.getProjects().contains(this)) {
            employee.getProjects().add(this);
        }
    }
    
    public String toString() {
        return "Project id: " + getId() + ", name: " + getName() +
               " with " + getEmployees().size() + " employees";
    }
}
