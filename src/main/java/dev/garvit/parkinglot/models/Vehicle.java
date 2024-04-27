package dev.garvit.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseModel{
    private String number;
    private String ownerName;
    private VehicleType vehicleType;
}
