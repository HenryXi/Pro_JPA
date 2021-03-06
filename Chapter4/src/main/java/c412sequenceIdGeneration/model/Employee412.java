package c412sequenceIdGeneration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;

@Entity
public class Employee412 {
    @SequenceGenerator(name="Emp_Gen412", sequenceName="Emp_Seq412")
    @Id @GeneratedValue(generator="Emp_Gen412")
    private int id;
    private String name;
    private long salary;

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
    
    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() + " salary: " + getSalary();
    }
}
