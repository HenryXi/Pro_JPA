package c426sharingEmbeddedObjects.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Company426 {
    @Id private int id;
    
    @Embedded
    private Address426 address;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Address426 getAddress() {
        return this.address;
    }
    public void setAddress(Address426 address) {
        this.address = address;
    }

    public String toString() {
        return "Company id: " + getId() + " address: " + getAddress();

    }
    
}