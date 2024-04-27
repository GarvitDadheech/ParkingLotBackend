package dev.garvit.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class ParkingLot extends BaseModel {
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gates;
    private List<VehicleType> vehicleTypes;
    private ParkingLotStatus parkingLotStatus;
}
