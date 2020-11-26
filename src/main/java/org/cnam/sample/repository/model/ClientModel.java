package org.cnam.sample.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="client_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "film_id", foreignKey = @ForeignKey(name = "filmclient_id_fk"))
    private Film film ;

    @ManyToOne
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(name = "roomclient_id_fk"))
    private Room room ;

    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    @Column(name = "age")
    private int age;

    @Column(name = "postalcode")
    private int postalcode;

    @Column(name = "pointfidelete")
    private int pointFidelite;

    public ClientModel(Long id, Film film, Room room, String name, String adress, int age, int postalcode, int pointfidelete) {
        this.id = id;
        this.film = film;
        this.room = room;
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.postalcode = postalcode;
        this.pointFidelite = pointfidelete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }

    public int getPointFidelite() {
        return pointFidelite;
    }

    public void setPointFidelite(int pointFidelite) {
        this.pointFidelite = pointFidelite;
    }
}
