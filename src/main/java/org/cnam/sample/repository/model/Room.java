package org.cnam.sample.repository.model;
import javax.persistence.*;
@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "film_id", foreignKey = @ForeignKey(name = "film_id_fk"))
    private Film film;

    @Column(name = "room")
    private int room;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "floor")
    private String floor;
    public Room(Long id, int room, int capacity, String floor) {
        this.id = id;
        this.room = room;
        this.capacity = capacity;
        this.floor = floor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}