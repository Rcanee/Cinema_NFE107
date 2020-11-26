package org.cnam.sample.controller.dto;

public class CrediterPointFideliteResponse {

    public long idClient;

    public int soldePoint;

    public CrediterPointFideliteResponse(long idClient, int soldePoint) {
        this.idClient = idClient;
        this.soldePoint = soldePoint;
    }
}
