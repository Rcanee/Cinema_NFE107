package org.cnam.sample.controller.dto;

public class AcheterTicketResponse {

    public long idTicket;

    public int numreservation;

    public AcheterTicketResponse(long idTicket, int numreservation) {
        this.idTicket = idTicket;
        this.numreservation = numreservation;
    }
}
