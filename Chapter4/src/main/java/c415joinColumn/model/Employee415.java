package c415joinColumn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee415 {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    
    @ManyToOne
    @JoinColumn(name="DEPT_ID")
    private Department415 department;

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
    
    public Department415 getDepartment() {
        return department;
    }
    
    public void setDepartment(Department415 department) {
        this.department = department;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() + 
               " with " + getDepartment();
    }
}
