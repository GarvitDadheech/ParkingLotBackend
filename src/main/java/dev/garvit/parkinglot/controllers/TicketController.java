package dev.garvit.parkinglot.controllers;

import dev.garvit.parkinglot.dtos.IssueTicketReqDto;
import dev.garvit.parkinglot.dtos.IssueTicketResponseDto;
import dev.garvit.parkinglot.exceptions.InvalidGateException;
import dev.garvit.parkinglot.models.Operator;
import dev.garvit.parkinglot.models.Ticket;
import dev.garvit.parkinglot.models.Vehicle;
import dev.garvit.parkinglot.services.TicketService;

import static dev.garvit.parkinglot.dtos.ResponseStatus.SUCCESS;

public class TicketController {
    public IssueTicketResponseDto issueTicket(IssueTicketReqDto issueTicketReqDto) throws InvalidGateException {
        return new IssueTicketResponseDto(TicketService.issueTicket(issueTicketReqDto.getGateId(), issueTicketReqDto.getVehicleType(), issueTicketReqDto.getVehicleNumber(), issueTicketReqDto.getOwnerName()), SUCCESS);
    }

}
