package org.cnam.sample.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "Programmation")
public class Programmation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "programmation_id")
    private Long id;

    @Column(name = "Hours")
    private char hour;

    @Column(name = "Date")
    private char date;

    @ManyToOne
    @JoinColumn(name = "film_id", foreignKey = @ForeignKey(name = "filmprog_id_fk"))
    private Film film ;

    @ManyToOne
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(name = "roomprog_id_fk"))
    private Room room ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getHour() {
        return hour;
    }

    public void setHour(char hour) {
        this.hour = hour;
    }

    public char getDate() {
        return date;
    }

    public void setDate(char date) {
        this.date = date;
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
}
