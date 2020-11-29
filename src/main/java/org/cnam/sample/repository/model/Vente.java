package org.cnam.sample.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "VENTE")
public class Vente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vente_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "film_id", foreignKey = @ForeignKey(name = "filmticket_id_fk"))
    private Long film;

    @Column(name = "numreservation")
    private int numreservation;

    @Column(name = "prix")
    private float prix;

    public Vente(Long id, float prix, long film){
        this.id = id;
        this.prix = prix;
        this.film = film;
    }

    public Vente(Long id, Long film, int numreservation, float prix) {
        this.id = id;
        this.film = film;
        this.numreservation = numreservation;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFilm() {
        return film;
    }

    public void setFilm(Long film) {
        this.film = film;
    }

    public int getNumreservation() {
        return numreservation;
    }

    public void setNumreservation(int numreservation) {
        this.numreservation = numreservation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
