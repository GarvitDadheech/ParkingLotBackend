package dev.garvit.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private Date date;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String referenceNumber;

}
