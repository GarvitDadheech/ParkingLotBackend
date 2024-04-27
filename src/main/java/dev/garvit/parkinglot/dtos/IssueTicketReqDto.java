package dev.garvit.parkinglot.dtos;

import dev.garvit.parkinglot.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IssueTicketReqDto {
    private Long gateId;
    private VehicleType vehicleType;
    private String vehicleNumber;
    private String ownerName;
}
