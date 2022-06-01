package com.codeClan.example.BeyondTravelling.controllers;

import com.codeClan.example.BeyondTravelling.models.Country;
import com.codeClan.example.BeyondTravelling.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping(value = "/countries/{id}")
    public ResponseEntity getCountry(@PathVariable Long id){
        return new ResponseEntity<>(countryRepository.findById(id), HttpStatus.OK);
    }
    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountry(@RequestParam(name = "name", required = false) String name){

        if (name != null){
            return new ResponseEntity<>(countryRepository.findAllByName(name), HttpStatus.OK);
        }

        return new ResponseEntity<>(countryRepository.findAll(), HttpStatus.OK);
    }


}
