package dev.garvit.parkinglot.models;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingSpot {
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private int spotNumber;
    private ParkingFloor parkingFloor;
}
