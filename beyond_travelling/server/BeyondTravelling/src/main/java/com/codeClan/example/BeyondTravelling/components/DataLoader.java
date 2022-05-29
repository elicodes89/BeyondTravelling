package com.codeClan.example.BeyondTravelling.components;

import com.codeClan.example.BeyondTravelling.models.City;
import com.codeClan.example.BeyondTravelling.models.Country;
import com.codeClan.example.BeyondTravelling.models.Hotel;
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

        Country country1 = new Country("Scotland");
        countryRepository.save(country1);
        Country country2 = new Country("England");
        countryRepository.save(country2);
        Country country3 = new Country("Wales");
        countryRepository.save(country3);
        Country country4 = new Country("Ireland");
        countryRepository.save(country4);

        City city1 = new City("Edinburgh",country1);
        cityRepository.save(city1);
        City city2 = new City("Glasgow",country1);
        cityRepository.save(city2);
        City city3 = new City("Inverness",country1);
        cityRepository.save(city3);
        City city4 = new City("Dundee",country1);
        cityRepository.save(city4);


        Hotel hotel1 = new Hotel("Mercure","0876452","www.edinburgh.co.uk","6633893","7762534",city1);
        hotelRepository.save(hotel1);



    }


}
