package com.codeClan.example.BeyondTravelling.components;

import com.codeClan.example.BeyondTravelling.repositories.CityRepository;
import com.codeClan.example.BeyondTravelling.repositories.CountryRepository;
import com.codeClan.example.BeyondTravelling.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    HotelRepository hotelRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

    }


}
