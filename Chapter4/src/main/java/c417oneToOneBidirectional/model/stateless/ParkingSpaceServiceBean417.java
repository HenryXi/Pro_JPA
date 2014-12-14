package c417oneToOneBidirectional.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c417oneToOneBidirectional.model.ParkingSpace417;

@Stateless
public class ParkingSpaceServiceBean417 implements ParkingSpaceService417 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public ParkingSpace417 createParkingSpace(int lot, String location) {
        ParkingSpace417 space = new ParkingSpace417();
        space.setLot(lot);
        space.setLocation(location);
        em.persist(space);
        
        return space;
    }

    public Collection<ParkingSpace417> findAllParkingSpaces() {
        Query query = em.createQuery("SELECT p FROM ParkingSpace417 p");
        return (Collection<ParkingSpace417>) query.getResultList();
    }
}
