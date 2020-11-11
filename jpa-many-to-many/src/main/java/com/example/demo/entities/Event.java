package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Event implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String country;

//    @ManyToMany
//    private Set<Speaker> speakers = new HashSet<>();
//
//    public Set<Speaker> getSpeakers() {
//        return speakers;
//    }
//
//    public void setSpeakers(Set<Speaker> speakers) {
//        this.speakers = speakers;
//    }

    public Event() {
    }

    public Event(String title, String country) {
        this.title = title;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
