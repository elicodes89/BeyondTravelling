package com.codeClan.example.BeyondTravelling.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_name")
    private String hotel_name;

    @Column(name = "contact_number")
    private String contact_number;

    @Column(name = "website")
    private String website;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "address")
    private String address;

    @Column(name = "img")
    private String img;

    @Column(name = "img2")
    private String img2;

    @JsonIgnoreProperties({"hotel"})
    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    private List<Video> videos;

    @JsonIgnoreProperties({"hotel"})
    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    private List<Comment> comments;

    @JsonIgnoreProperties({"hotels"})
    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    public Hotel(String hotel_name, String contact_number, String website, String longitude, String latitude, String address,City city, String img, String img2) {
        this.hotel_name = hotel_name;
        this.contact_number = contact_number;
        this.website = website;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.city = city;
        this.img = img;
        this.img2 = img2;
        this.videos = new ArrayList<>();
        this.comments = new ArrayList<>();

    }

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

}

