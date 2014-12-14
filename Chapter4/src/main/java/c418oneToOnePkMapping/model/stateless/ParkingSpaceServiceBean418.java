package c418oneToOnePkMapping.model.stateless;

import c418oneToOnePkMapping.model.Employee418;
import c418oneToOnePkMapping.model.ParkingSpace418;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ParkingSpaceServiceBean418 implements ParkingSpaceService418 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public ParkingSpace418 createParkingSpace(Employee418 emp, int lot, String location) {
        ParkingSpace418 space = new ParkingSpace418();
        space.setId(emp.getId());
        space.setLot(lot);
        space.setLocation(location);
        
        emp.setParkingSpace(space);
        space.setEmployee(emp);
        em.persist(space);
        
        return space;
    }

    public Collection<ParkingSpace418> findAllParkingSpaces() {
        Query query = em.createQuery("SELECT p FROM ParkingSpace418 p");
        return (Collection<ParkingSpace418>) query.getResultList();
    }
}
