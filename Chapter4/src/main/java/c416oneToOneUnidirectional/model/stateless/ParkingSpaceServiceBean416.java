package c416oneToOneUnidirectional.model.stateless;

import c416oneToOneUnidirectional.model.ParkingSpace416;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class ParkingSpaceServiceBean416 implements ParkingSpaceService416 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public ParkingSpace416 createParkingSpace(int lot, String location) {
        ParkingSpace416 space = new ParkingSpace416();
        space.setLot(lot);
        space.setLocation(location);
        em.persist(space);
        
        return space;
    }

    public Collection<ParkingSpace416> findAllParkingSpaces() {
        Query query = em.createQuery("SELECT p FROM ParkingSpace416 p");
        return (Collection<ParkingSpace416>) query.getResultList();
    }
}
