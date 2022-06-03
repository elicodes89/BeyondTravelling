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
        Country country1 = new Country("Scotland","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/ireland_images/countryside2.jpg"); //done
        countryRepository.save(country1);
        Country country2 = new Country("England","https://cdn.pixabay.com/photo/2015/11/12/16/23/flag-1040592_1280.png"); //done
        countryRepository.save(country2);
        Country country3 = new Country("Wales","https://cdn.pixabay.com/photo/2012/04/11/15/30/wales-28516_1280.png"); //done
        countryRepository.save(country3);
        Country country4 = new Country("Ireland","https://cdn.pixabay.com/photo/2012/04/10/23/11/ireland-26887_1280.png"); //done
        countryRepository.save(country4);

        //This is the cities in Scotland
        City city1 = new City("Edinburgh",country1,"https://cdn.pixabay.com/photo/2019/12/10/10/42/edinburgh-4685583_1280.jpg"); //done
        cityRepository.save(city1);
        City city2 = new City("St Andrews",country1,"https://cdn.pixabay.com/photo/2017/09/13/07/02/scotland-2744581_1280.jpg"); //done
        cityRepository.save(city2);
        City city3 = new City("Inverness",country1,"https://cdn.pixabay.com/photo/2016/08/20/15/49/bridge-1607823_1280.jpg"); //done
        cityRepository.save(city3);
        City city4 = new City("Dundee",country1, "https://cdn.pixabay.com/photo/2017/06/07/14/20/boat-2380490_1280.jpg"); //done
        cityRepository.save(city4);
        City city19 = new City("Skye",country1, "https://drive.google.com/file/d/1CLiPNhWS2xdWeAQwiDn1bc_cDNptBWjs/view?usp=sharing"); //done
        cityRepository.save(city19);


        //This is the hotels in Edinburgh
        Hotel hotel5 = new Hotel("Eden Locke","0330 056 3363","https://www.lockeliving.com/en/edinburgh/eden-locke?utm_source=google-my-business&utm_medium=organic&utm_campaign=eden-locke","-3.205272.","55.952035","127 George St, Edinburgh, EH2 4JN, United Kingdom",city1,"");
        hotelRepository.save(hotel5);
        Hotel hotel6 = new Hotel("The Bonham","0131 226 6050","https://thebonham.com/","-3.188267"," 55.953251","35 Drumsheugh Gardens, Edinburgh, EH3 7RN, United Kingdom",city1,"");
        hotelRepository.save(hotel6);

        //This is the hotels in St Andrews
        Hotel hotel7 = new Hotel("LODGE 6 AT ELDERBURN LUXURY LODGES","07840 801114","https://www.elderburnlodges.co.uk/","-2.8667399693141506.","56.31194469351686","Denhead, St Andrews KY16 8PA",city2,"");
        hotelRepository.save(hotel7);
        Hotel hotel8 = new Hotel("CULMORE BRIDGE COTTAGES","01776 830539","http://www.culmorebridge.co.uk/"," -4.9617529240942515"," 54.862040001883365","Sandhead, Stranraer DG9 9DX",city2,"");
        hotelRepository.save(hotel8);

        //This is the hotel in Inverness
        Hotel hotel10 = new Hotel("Courtyard by Marriott Inverness Airport","(800) 085-8179","https://www.marriott.co.uk","-4.065986557353875","57.53859107575739","Dalcross, Inverness, IV2 7BL, United Kingdom",city3,"");
        hotelRepository.save(hotel10);

        //This is the hotel in Dundee
        Hotel hotel11 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city3,"");
        hotelRepository.save(hotel11);

        //This is the hotel in Skye
        Hotel hotel9 = new Hotel("Isle of Raasay Distillery","01478 470178","https://raasaydistillery.com/","-6.07391043731","57.3518275583","Borodale House Isle of Raasay, Kyle IV40 8PB",city19,"");
        hotelRepository.save(hotel9);

        //This is the cities in England
        City city10 = new City("London",country2,"https://cdn.pixabay.com/photo/2014/09/11/18/23/tower-bridge-441853_1280.jpg"); //done
        cityRepository.save(city10);
        City city11 = new City("Manchester",country2, "https://cdn.pixabay.com/photo/2020/07/22/15/09/city-5429124_1280.jpg"); //done
        cityRepository.save(city11);
        City city12 = new City("Birmingham",country2,"https://cdn.pixabay.com/photo/2017/08/24/07/36/birmingham-2675655_1280.jpg");//done
        cityRepository.save(city12);
        City city13 = new City("Liverpool",country2,"https://cdn.pixabay.com/photo/2018/03/26/17/32/city-3263351_1280.jpg");//done
        cityRepository.save(city13);

        //These are the hotels in London
        Hotel hotel12 = new Hotel("The Guardsman","0207 309 9200","https://www.guardsmanhotel.com","-0.13703021534406976","51.49950352375432,","1 Vandon Street Westminster, Westminster Borough, London, SW1H 0AH",city10,"");
        hotelRepository.save(hotel12);
//        Hotel hotel13 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city10);
//        hotelRepository.save(hotel13);

        //This is the hotel in Manchester
        Hotel hotel14 = new Hotel("Clayton Hotel Manchester City Centre","+44 161 433 7580","https://www.claytonhotelmanchestercitycentre.com/","-2.2368257021083737","53.47843255407386","55 Portland St Manchester M1 3HP United Kingdom",city11,"");
        hotelRepository.save(hotel14);
//        Hotel hotel15 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city11);
//        hotelRepository.save(hotel15);

        //These are the hotels in Birmingham
        Hotel hotel16 = new Hotel("Aparthotel Adagio Birmingham City Centre","0121 399 0500","https://www.adagio-city.com/gb/hotel-8117-aparthotel-adagio-birmingham-city-centre/index.shtml?utm_source=googleMaps&utm_medium=seoMaps&utm_campaign=seoMaps&y_source=1_MTUzNjIzMDUtNzE1LWxvY2F0aW9uLndlYnNpdGU%3D","-1.888801932796513","52.4773625753563","131 Digbeth, Birmingham B5 6DR",city12,"");
        hotelRepository.save(hotel16);
//        Hotel hotel17 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city12);
//        hotelRepository.save(hotel17);

        //These are the hotels in Liverpool
        Hotel hotel18 = new Hotel("INNSIDE Liverpool","0151 832 0960","https://www.melia.com/en/hotels/united-kingdom/liverpool/innside-liverpool/index.htm?utm_medium=organic&utm_source=uberall&utm_content=dynamic","-2.9944098777745354","53.41024421444565","43 Old Hall St, Liverpool L3 9PP",city13,"");
        hotelRepository.save(hotel18);
//        Hotel hotel19 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city13);
//        hotelRepository.save(hotel19);

        //This is the cities in Wales
        City city14 = new City("Cardiff",country3,"https://cdn.pixabay.com/photo/2019/06/25/22/31/cardiff-4299219_1280.jpg");
        cityRepository.save(city14);
        City city15 = new City("Swansea",country3, "https://cdn.pixabay.com/photo/2019/07/26/14/38/boats-4364878_1280.jpg");
        cityRepository.save(city15);
        City city16 = new City("Newport",country3,"https://cdn.pixabay.com/photo/2017/09/08/09/25/denmark-2728182_1280.jpg");
        cityRepository.save(city16);

        //These are the hotels in Cardiff
        Hotel hotel20 = new Hotel("Cardiff1","020 3966 8654","google.com","-2.9624006001947434","56.465844944513066","Cardiff city",city14,"");
        hotelRepository.save(hotel20);
//        Hotel hotel21 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city14);
//        hotelRepository.save(hotel21);

        //These are the hotels in Swansea
        Hotel hotel22 = new Hotel("Swansea","020 3966 8654","google.swansee.com","-2.9624006001947434","56.465844944513066","swansee eh45 kb",city15,"");
        hotelRepository.save(hotel22);
//        Hotel hotel23 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city15);
//        hotelRepository.save(hotel23);

        //These are the hotels in Newport
        Hotel hotel24 = new Hotel("Newport","020 3966 8654","google.newport","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city16,"");
        hotelRepository.save(hotel24);
//        Hotel hotel25 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city16);
//        hotelRepository.save(hotel25);

        //This is the cities in Ireland
        City city5 = new City("Dublin",country4,"https://cdn.pixabay.com/photo/2013/12/18/18/01/bridge-230311_1280.jpg");//done
        cityRepository.save(city5);
        City city6 = new City("Belfast",country4,"https://cdn.pixabay.com/photo/2014/11/20/20/40/mural-539830_1280.jpg");//done
        cityRepository.save(city6);
        City city7 = new City("Galway",country4,"https://cdn.pixabay.com/photo/2020/05/14/10/27/galway-5170793_1280.jpg");//done
        cityRepository.save(city7);
        City city8 = new City("Donegal",country4,"https://cdn.pixabay.com/photo/2017/06/01/13/49/ireland-2363582_1280.jpg");//done
        cityRepository.save(city8);

        //This is the hotels in Ireland
        Hotel hotel1 = new Hotel("Crowne Plaza Dublin Airport","+ 353-1-8628888","https://www.ihg.com/crowneplaza/hotels/gb/en/dublin/dblnp/hoteldetail","-6.245522215940467","53.404503137589636","Northwood Park Santry Demesne, Dublin 9 | Ireland",city5,"");
        hotelRepository.save(hotel1);
        Hotel hotel2 = new Hotel("Meldron Belfast ","+35 02896001680","https://www.maldronhotelbelfastcity.com/room","-5.932631321052927","54.594818490728684","20 Brunswick Street Belfast",city6,"");
        hotelRepository.save(hotel2);
        Hotel hotel3 = new Hotel("The Dean","+353 (0)91 749 200","https://thedean.ie/galway","-9.0467412975213","53.277101326967795","Galway 80 Prospect Hill, Galway",city7,"");
        hotelRepository.save(hotel3);
        Hotel hotel4 = new Hotel("Donegal Hotel","+353749541112","https://www.woodhillhouse.com/","-8.403013666358087","54.75839283544279","Wood Road Ardara Donegal F94 E102 Ireland",city8,"");
        hotelRepository.save(hotel4);

    }


}
