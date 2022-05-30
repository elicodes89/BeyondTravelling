package com.codeClan.example.BeyondTravelling.controllers;

import com.codeClan.example.BeyondTravelling.models.Country;
import com.codeClan.example.BeyondTravelling.models.Hotel;
import com.codeClan.example.BeyondTravelling.repositories.CountryRepository;
import com.codeClan.example.BeyondTravelling.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping(value = "/hotels")
    public ResponseEntity<List<Hotel>> getAllHotel(){
        return new ResponseEntity<>(hotelRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/hotels/{id}")
    public ResponseEntity getCountry(@PathVariable Long id){
        return new ResponseEntity<>(hotelRepository.findById(id), HttpStatus.OK);
    }
}
