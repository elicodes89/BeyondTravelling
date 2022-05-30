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

        // List of the countries
        Country country1 = new Country("Scotland");
        countryRepository.save(country1);
        Country country2 = new Country("England");
        countryRepository.save(country2);
        Country country3 = new Country("Wales");
        countryRepository.save(country3);
        Country country4 = new Country("Ireland"); //done
        countryRepository.save(country4);
        Country country5 = new Country("Sky"); //done
        countryRepository.save(country5);

        //This is the cities in Scotland
        City city1 = new City("Edinburgh",country1); //done
        cityRepository.save(city1);
        City city2 = new City("St Andrews",country1); //done
        cityRepository.save(city2);
        City city3 = new City("Inverness",country1); //done
        cityRepository.save(city3);
        City city4 = new City("Dundee",country1);
        cityRepository.save(city4);

        //This is the hotels in Edinburgh
        Hotel hotel5 = new Hotel("Eden Locke","0330 056 3363","https://www.lockeliving.com/en/edinburgh/eden-locke?utm_source=google-my-business&utm_medium=organic&utm_campaign=eden-locke","-3.205272.","55.952035","127 George St, Edinburgh, EH2 4JN, United Kingdom",city1);
        hotelRepository.save(hotel5);
        Hotel hotel6 = new Hotel("The Bonham","0131 226 6050","https://thebonham.com/","-3.188267"," 55.953251","35 Drumsheugh Gardens, Edinburgh, EH3 7RN, United Kingdom",city1);
        hotelRepository.save(hotel6);

        //This is the hotels in St Andrews
        Hotel hotel7 = new Hotel("LODGE 6 AT ELDERBURN LUXURY LODGES","07840 801114","https://www.elderburnlodges.co.uk/","-2.8667399693141506.","56.31194469351686","Denhead, St Andrews KY16 8PA",city2);
        hotelRepository.save(hotel7);
        Hotel hotel8 = new Hotel("CULMORE BRIDGE COTTAGES","01776 830539","http://www.culmorebridge.co.uk/"," -4.9617529240942515"," 54.862040001883365","Sandhead, Stranraer DG9 9DX",city2);
        hotelRepository.save(hotel8);

        //This is the hotel in Inverness
        Hotel hotel10 = new Hotel("Courtyard by Marriott Inverness Airport","(800) 085-8179","https://www.marriott.co.uk","-4.065986557353875","57.53859107575739","Dalcross, Inverness, IV2 7BL, United Kingdom",city3);
        hotelRepository.save(hotel10);

        //This is the hotel in Dundee
        Hotel hotel11 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city3);
        hotelRepository.save(hotel11);

        //This is the cities in Ireland
        City city5 = new City("Dublin",country4);
        cityRepository.save(city5);
        City city6 = new City("Belfast",country4);
        cityRepository.save(city6);
        City city7 = new City("Galway",country4);
        cityRepository.save(city7);
        City city8 = new City("Donegal",country4);
        cityRepository.save(city8);

        //This is the hotels in Ireland
        Hotel hotel1 = new Hotel("Crowne Plaza Dublin Airport","+ 353-1-8628888","https://www.ihg.com/crowneplaza/hotels/gb/en/dublin/dblnp/hoteldetail","-6.245522215940467","53.404503137589636","Northwood Park Santry Demesne, Dublin 9 | Ireland",city5);
        hotelRepository.save(hotel1);
        Hotel hotel2 = new Hotel("Meldron Belfast ","+35 02896001680","https://www.maldronhotelbelfastcity.com/room","-5.932631321052927","54.594818490728684","20 Brunswick Street Belfast",city6);
        hotelRepository.save(hotel2);
        Hotel hotel3 = new Hotel("The Dean","+353 (0)91 749 200","https://thedean.ie/galway","-9.0467412975213","53.277101326967795","Galway 80 Prospect Hill, Galway",city7);
        hotelRepository.save(hotel3);
        Hotel hotel4 = new Hotel("Donegal Hotel","+353749541112","https://www.woodhillhouse.com/","-8.403013666358087","54.75839283544279","Wood Road Ardara Donegal F94 E102 Ireland",city8);
        hotelRepository.save(hotel4);

        //This is the city for Sky
        City city9 = new City("Kyle",country5);
        cityRepository.save(city9);

        //This is the hotel in Sky
        Hotel hotel9 = new Hotel("Isle of Raasay Distillery","01478 470178","https://raasaydistillery.com/","-6.07391043731","57.3518275583","Borodale House Isle of Raasay, Kyle IV40 8PB",city9);
        hotelRepository.save(hotel9);
    }


}
