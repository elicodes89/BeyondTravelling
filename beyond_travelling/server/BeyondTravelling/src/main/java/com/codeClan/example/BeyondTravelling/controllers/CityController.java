package com.codeClan.example.BeyondTravelling.controllers;

import com.codeClan.example.BeyondTravelling.models.City;
import com.codeClan.example.BeyondTravelling.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    CityRepository cityRepository;

    @GetMapping(value = "/cities")
    public ResponseEntity<List<City>> getAllCity(){
        return new ResponseEntity<>(cityRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/cities/{id}")
    public ResponseEntity getCity(@PathVariable Long id){
        return new ResponseEntity<>(cityRepository.findById(id), HttpStatus.OK);
    }
}
