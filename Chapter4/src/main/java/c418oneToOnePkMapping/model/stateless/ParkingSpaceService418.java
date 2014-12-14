package c418oneToOnePkMapping.model.stateless;

import c418oneToOnePkMapping.model.Employee418;
import c418oneToOnePkMapping.model.ParkingSpace418;

import java.util.Collection;

public interface ParkingSpaceService418 {
    public ParkingSpace418 createParkingSpace(Employee418 emp, int lot, String location);
    public Collection<ParkingSpace418> findAllParkingSpaces();
}
