package c421manyToManyBidirectional.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project421 {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id;
    protected String name;
    @ManyToMany(mappedBy="projects")
    private Collection<Employee421> employees;

    public Project421() {
        employees = new ArrayList<Employee421>();
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
    
    public Collection<Employee421> getEmployees() {
        return employees;
    }
    
    public void addEmployee(Employee421 employee) {
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
