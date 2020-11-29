package org.cnam.sample.controller.dto;

public class AcheterTicketRequest {

    public long idTicket;

    public float price;

    public long movie;

    public AcheterTicketRequest(long idTicket, float price, long movie) {
        this.idTicket = idTicket;
        this.price = price;
        this.movie = movie;
    }
}
