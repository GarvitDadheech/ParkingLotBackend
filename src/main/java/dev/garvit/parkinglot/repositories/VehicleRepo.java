package dev.garvit.parkinglot.repositories;

import dev.garvit.parkinglot.models.Gate;
import dev.garvit.parkinglot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepo {
    public Map<String, Vehicle> vehicles = new HashMap<>();

    public Optional<Vehicle> findById(String vehicleNumber) {
        return Optional.ofNullable(vehicles.get(vehicleNumber));
    }
}
