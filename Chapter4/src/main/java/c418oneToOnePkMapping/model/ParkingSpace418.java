package c418oneToOnePkMapping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PARKING_SPACE418")
public class ParkingSpace418 {
    @Id
    private int id;
    private int lot;
    private String location;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Employee418 employee;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String deptName) {
        this.location = deptName;
    }

    public Employee418 getEmployee() {
        return employee;
    }

    public void setEmployee(Employee418 employee) {
        this.employee = employee;
    }
    
    public String toString() {
        return "ParkingSpace id: " + getId() + " lot: " + getLot() +
               ", location: " + getLocation();
    }
}
