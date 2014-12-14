package c424oneToOneLazy.model.stateless;

import java.util.Collection;

import c424oneToOneLazy.model.ParkingSpace424;

public interface ParkingSpaceService424 {
    public ParkingSpace424 createParkingSpace(int lot, String location);
    public Collection<ParkingSpace424> findAllParkingSpaces();
}
