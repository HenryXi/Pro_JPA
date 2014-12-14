package c425embeddedObjects.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee425 {
    @Id private int id;
    private String name;
    private long salary;
    
    @Embedded 
    private Address425 address;
    
    public Employee425() {}

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

    public Address425 getAddress() {
        return address;
    }
    
    public void setAddress(Address425 address) {
        this.address = address; 
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() +
               " salary: " + getSalary() + " address: " + getAddress();
    }
}
