package dev.garvit.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Date;
@Getter
@Setter

public class Bill extends BaseModel {
    private Date exitTime;
    private int amount;
    private Ticket ticket;
    private Operator operator;
    private BillStatus billStatus;
    private List<Payment> paymentList;
}
