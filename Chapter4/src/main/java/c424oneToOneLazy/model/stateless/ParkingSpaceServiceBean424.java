package c424oneToOneLazy.model.stateless;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import c424oneToOneLazy.model.ParkingSpace424;

@Stateless
public class ParkingSpaceServiceBean424 implements ParkingSpaceService424 {
    @PersistenceContext(unitName="EmployeeService")
    protected EntityManager em;

    public ParkingSpace424 createParkingSpace(int lot, String location) {
        ParkingSpace424 space = new ParkingSpace424();
        space.setLot(lot);
        space.setLocation(location);
        em.persist(space);
        
        return space;
    }

    public Collection<ParkingSpace424> findAllParkingSpaces() {
        Query query = em.createQuery("SELECT p FROM ParkingSpace424 p");
        return (Collection<ParkingSpace424>) query.getResultList();
    }
}
