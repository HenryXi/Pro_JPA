package c422manyToManyJoinTable.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee422 {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    
    @ManyToMany 
    @JoinTable(name="EMP_PROJ", 
          joinColumns=@JoinColumn(name="EMP_ID"),
          inverseJoinColumns=@JoinColumn(name="PROJ_ID"))
    private Collection<Project422> projects;
    
    
    public Employee422() {
        projects = new ArrayList<Project422>();
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public void addProject(Project422 project) {
        if (!getProjects().contains(project)) {
            getProjects().add(project);
        }
        if (!project.getEmployees().contains(this)) {
            project.getEmployees().add(this);
        }
    }

    public Collection<Project422> getProjects() {
        return projects;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() + 
               " with " + getProjects().size() + " projects";
    }
}
