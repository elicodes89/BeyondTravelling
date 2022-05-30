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

        City city5 = new City("Dublin",country4);
        cityRepository.save(city5);
        City city6 = new City("Belfast",country4);
        cityRepository.save(city6);
        City city7 = new City("Galway",country4);
        cityRepository.save(city7);
        City city8 = new City("Donegal",country4);
        cityRepository.save(city8);


        Hotel hotel1 = new Hotel("Crowne Plaza Dublin Airport","+ 353-1-8628888","https://www.ihg.com/crowneplaza/hotels/gb/en/dublin/dblnp/hoteldetail","-6.245522215940467","53.404503137589636","Northwood Park Santry Demesne, Dublin 9 | Ireland",city5);
        hotelRepository.save(hotel1);
        Hotel hotel2 = new Hotel("Radisson Blu Hotel Belfast","+44 28 90 434 065","https://www.radissonhotels.com/en-us/hotels/radisson-blu-belfast"," -5.923195","54.591445"," 3 Cromac Place, Ormeau Road, Belfast, BT7 2JB, United Kingdom",city6);
        hotelRepository.save(hotel2);
        Hotel hotel3 = new Hotel("The Dean","+353 (0)91 749 200","https://thedean.ie/galway","-9.0467412975213","53.277101326967795","Galway 80 Prospect Hill, Galway",city7);
        hotelRepository.save(hotel3);
        Hotel hotel4 = new Hotel("Donegal Hotel","+353749541112","https://www.woodhillhouse.com/","-8.403013666358087","54.75839283544279","Wood Road Ardara Donegal F94 E102 Ireland",city8);
        hotelRepository.save(hotel4);

    }


}
