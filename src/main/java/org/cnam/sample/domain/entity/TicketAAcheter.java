package org.cnam.sample.domain.entity;

public class TicketAAcheter {

    public static Long idTicket;

    public float price;

    public long film;

    public TicketAAcheter(long idTicket, float price, long film) {
        this.idTicket = idTicket;
        this.price = price;
        this.film = film;
    }
}
