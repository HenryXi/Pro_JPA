package c416oneToOneUnidirectional.model.stateless;

import java.util.Collection;

import c416oneToOneUnidirectional.model.ParkingSpace416;

public interface ParkingSpaceService416 {
    public ParkingSpace416 createParkingSpace(int lot, String location);
    public Collection<ParkingSpace416> findAllParkingSpaces();
}
