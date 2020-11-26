package org.cnam.sample.controller.dto;

public class CrediterPointFideliteRequest {

    public long idClient;

    public int nbPointACrediter;

    public CrediterPointFideliteRequest(long idClient, int nbPointACrediter) {
        this.idClient = idClient;
        this.nbPointACrediter = nbPointACrediter;
    }
}
