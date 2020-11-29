package org.cnam.sample.domain.entity;

public class TicketAcheter {

    public long idTicket;

    public int numreservation;

    public long film;

    public TicketAcheter(long idTicket, int numreservation, long film) {
        this.idTicket = idTicket;
        this.numreservation = numreservation;
        this.film = film;
    }
}
