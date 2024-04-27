package dev.garvit.parkinglot.services;

import dev.garvit.parkinglot.exceptions.InvalidGateException;
import dev.garvit.parkinglot.models.Ticket;
import dev.garvit.parkinglot.models.Gate;
import dev.garvit.parkinglot.models.Vehicle;
import dev.garvit.parkinglot.models.VehicleType;
import dev.garvit.parkinglot.repositories.GateRepo;
import dev.garvit.parkinglot.repositories.VehicleRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TicketService {

    GateRepo gateRepo;
    VehicleRepo vehicleRepo;
    public TicketService(GateRepo gateRepo, VehicleRepo vehicleRepo) {
        this.gateRepo = gateRepo;
        this.vehicleRepo = vehicleRepo;
    }
    public static Ticket issueTicket(Long gateId, VehicleType vehicleType, String vehicleNumber, String ownerName) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> optionalGate = gateRepo.findById(gateId);
        if(optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid Gate Id");
        }
        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());


        Optional<Vehicle> optionalVehicle = vehicleRepo.findById(vehicleNumber);
        Vehicle vehicle;

        if (optionalVehicle.isPresent()) {
            vehicle = optionalVehicle.get();
        } else {

            vehicle = new Vehicle();
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            vehicle = vehicleRepo.vehicles.put(vehicleNumber,vehicle);
        }


        ticket.setVehicle(vehicle);

        return ticket;
    }
}
