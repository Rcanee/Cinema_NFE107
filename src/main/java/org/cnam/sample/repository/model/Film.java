package org.cnam.sample.repository.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "FILM")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<room> room = new ArrayList<>();

    @Column(name = "film_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "real")
    private String real;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }
}
