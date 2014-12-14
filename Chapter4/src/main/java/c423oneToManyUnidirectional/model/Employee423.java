package c423oneToManyUnidirectional.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Employee423 {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    
    @OneToMany
    @JoinTable(name="EMP_PHONE", 
          joinColumns=@JoinColumn(name="EMP_ID"),
          inverseJoinColumns=@JoinColumn(name="PHONE_ID"))
    private Collection<Phone423> phones;

    public Employee423() {
        phones = new ArrayList<Phone423>();
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

    public void addPhone(Phone423 phone) {
        if (!getPhones().contains(phone)) {
            getPhones().add(phone);
        }
    }
    
    public Collection<Phone423> getPhones() {
        return phones;
    }
    
    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() + 
               " with " + getPhones().size() + " phones";
    }
}
