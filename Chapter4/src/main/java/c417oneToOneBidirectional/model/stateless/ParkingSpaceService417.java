package c417oneToOneBidirectional.model.stateless;

import java.util.Collection;

import c417oneToOneBidirectional.model.ParkingSpace417;

public interface ParkingSpaceService417 {
    public ParkingSpace417 createParkingSpace(int lot, String location);
    public Collection<ParkingSpace417> findAllParkingSpaces();
}
