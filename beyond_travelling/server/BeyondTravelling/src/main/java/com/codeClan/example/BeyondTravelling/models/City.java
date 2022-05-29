package com.codeClan.example.BeyondTravelling.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties({"cities"})
    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @JsonIgnoreProperties({"city"})
    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    private List<Hotel> hotels;

    public City(String name, Country country) {
        this.name = name;
        this.hotels = new ArrayList<>();
        this.country = country;
    }

    public City() {
    }

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}
