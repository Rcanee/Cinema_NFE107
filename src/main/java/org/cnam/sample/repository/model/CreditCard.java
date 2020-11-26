package org.cnam.sample.repository.model;


import javax.persistence.*;

@Entity
@Table(name = "CREDIT_CARD")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", foreignKey = @ForeignKey(name = "client_id_fk"))
    private ClientModel client;

    @Column(name = "number")
    private int number;

    @Column(name = "expiration")
    private char expiration;

    @Column(name = "cryptogram")
    private int cryptogram;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getExpiration() {
        return expiration;
    }

    public void setExpiration(char expiration) {
        this.expiration = expiration;
    }

    public int getCryptogram() {
        return cryptogram;
    }

    public void setCryptogram(int cryptogram) {
        this.cryptogram = cryptogram;
    }
}