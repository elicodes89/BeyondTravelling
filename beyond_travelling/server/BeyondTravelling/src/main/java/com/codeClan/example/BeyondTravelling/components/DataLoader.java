package com.codeClan.example.BeyondTravelling.components;

import com.codeClan.example.BeyondTravelling.models.*;
import com.codeClan.example.BeyondTravelling.repositories.*;
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

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    DescriptionRepository descriptionRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        // List of the countries
        Country country1 = new Country("Scotland","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Scotland.jpeg"); //done
        countryRepository.save(country1);
        Country country2 = new Country("England","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/England.jpeg"); //done
        countryRepository.save(country2);
        Country country3 = new Country("Wales","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Wales.jpeg"); //done
        countryRepository.save(country3);
        Country country4 = new Country("Ireland","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Ireland.jpeg"); //done
        countryRepository.save(country4);

        //This is the cities in Scotland
        City city1 = new City("Edinburgh",country1,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Edinburgh/Edinburgh.jpeg"); //done
        cityRepository.save(city1);
        City city2 = new City("St Andrews",country1,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/StAndrews.jpeg"); //done
        cityRepository.save(city2);
        City city3 = new City("Inverness",country1,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Inverness/Inverness.jpeg"); //done
        cityRepository.save(city3);
        City city4 = new City("Dundee",country1, "https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Dundee/Dundee.jpeg"); //done
        cityRepository.save(city4);
        City city19 = new City("Skye",country1, "https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Skye/Skye.jpeg"); //done
        cityRepository.save(city19);

        //This is the hotels in Edinburgh
        Hotel hotel5 = new Hotel("Eden Locke","0330 056 3363","https://www.lockeliving.com/en/edinburgh/eden-locke?utm_source=google-my-business&utm_medium=organic&utm_campaign=eden-locke","-3.205272.","55.952035","127 George St, Edinburgh, EH2 4JN, United Kingdom",city1,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Edinburgh/EdenLockeCollage.jpg","");
        hotelRepository.save(hotel5);
        Hotel hotel6 = new Hotel("The Bonham","0131 226 6050","https://thebonham.com/","-3.188267"," 55.953251","35 Drumsheugh Gardens, Edinburgh, EH3 7RN, United Kingdom",city1,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Edinburgh/BonhamCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Edinburgh/Bonham4.jpeg");
        hotelRepository.save(hotel6);

        //This is the hotels in St Andrews
        Hotel hotel7 = new Hotel("LODGE 6 AT ELDERBURN LUXURY LODGES","07840 801114","https://www.elderburnlodges.co.uk/","-2.8667399693141506.","56.31194469351686","Denhead, St Andrews KY16 8PA",city2,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/ElderburnCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/Elderburn1.jpeg");
        hotelRepository.save(hotel7);
        Hotel hotel8 = new Hotel("CULMORE BRIDGE COTTAGES","01776 830539","http://www.culmorebridge.co.uk/"," -4.9617529240942515"," 54.862040001883365","Sandhead, Stranraer DG9 9DX",city2,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/CulmoreCollage.jpg?rW=TRUE","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/Culmore1.jpeg");
        hotelRepository.save(hotel8);

        //This is the hotel in Inverness
        Hotel hotel10 = new Hotel("Courtyard by Marriott Inverness Airport","(800) 085-8179","https://www.marriott.co.uk","-4.065986557353875","57.53859107575739","Dalcross, Inverness, IV2 7BL, United Kingdom",city3,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Inverness/CourtyardCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Inverness/Courtyard1.jpeg");
        hotelRepository.save(hotel10);

        //This is the hotel in Dundee
        Hotel hotel11 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city3,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Dundee/StaybridgeCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Dundee/Staybridge1.jpeg");
        hotelRepository.save(hotel11);

        //This is the hotel in Skye
        Hotel hotel9 = new Hotel("Isle of Raasay Distillery","01478 470178","https://raasaydistillery.com/","-6.07391043731","57.3518275583","Borodale House Isle of Raasay, Kyle IV40 8PB",city19,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Skye/RaasayCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Skye/Raasay6.jpeg");
        hotelRepository.save(hotel9);

        //This is the cities in England
        City city10 = new City("London",country2,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/London/London.jpeg"); //done
        cityRepository.save(city10);
        City city11 = new City("Manchester",country2, "https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Manchester/Manchester.jpeg"); //done
        cityRepository.save(city11);
        City city12 = new City("Birmingham",country2,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Birmingham/Birmingham.jpeg");//done
        cityRepository.save(city12);
        City city13 = new City("Liverpool",country2,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Liverpool/Liverpool.jpeg");//done
        cityRepository.save(city13);

        //These are the hotels in London
        Hotel hotel12 = new Hotel("The Guardsman","0207 309 9200","https://www.guardsmanhotel.com","-0.13703021534406976","51.49950352375432,","1 Vandon Street Westminster, Westminster Borough, London, SW1H 0AH",city10,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/London/GuardsmanCollage.jpg","");
        hotelRepository.save(hotel12);

        //This is the hotel in Manchester
        Hotel hotel14 = new Hotel("Clayton Hotel Manchester City Centre","+44 161 433 7580","https://www.claytonhotelmanchestercitycentre.com/","-2.2368257021083737","53.47843255407386","55 Portland St Manchester M1 3HP United Kingdom",city11,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Manchester/ClaytonCollage.jpg","");
        hotelRepository.save(hotel14);

        //These are the hotels in Birmingham
        Hotel hotel16 = new Hotel("Aparthotel Adagio Birmingham City Centre","0121 399 0500","https://www.adagio-city.com/gb/hotel-8117-aparthotel-adagio-birmingham-city-centre/index.shtml?utm_source=googleMaps&utm_medium=seoMaps&utm_campaign=seoMaps&y_source=1_MTUzNjIzMDUtNzE1LWxvY2F0aW9uLndlYnNpdGU%3D","-1.888801932796513","52.4773625753563","131 Digbeth, Birmingham B5 6DR",city12,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Birmingham/HolidayCollage.jpg","");
        hotelRepository.save(hotel16);

        //These are the hotels in Liverpool
        Hotel hotel18 = new Hotel("INNSIDE Liverpool","0151 832 0960","https://www.melia.com/en/hotels/united-kingdom/liverpool/innside-liverpool/index.htm?utm_medium=organic&utm_source=uberall&utm_content=dynamic","-2.9944098777745354","53.41024421444565","43 Old Hall St, Liverpool L3 9PP",city13,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Liverpool/InnsideCollage.jpg","");
        hotelRepository.save(hotel18);

        //This is the cities in Wales
        City city14 = new City("Cardiff",country3,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Cardiff/Cardiff.jpeg");
        cityRepository.save(city14);
        City city15 = new City("Swansea",country3, "https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Swansea/Swansea.jpeg");
        cityRepository.save(city15);
        City city16 = new City("Newport",country3,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Newport/Newport.jpeg");
        cityRepository.save(city16);

        //These are the hotels in Cardiff
        Hotel hotel20 = new Hotel("Cardiff1","020 3966 8654","google.com","-2.9624006001947434","56.465844944513066","Cardiff city",city14,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Cardiff/HomefieldCollage.jpg","");
        hotelRepository.save(hotel20);

        //These are the hotels in Swansea
        Hotel hotel22 = new Hotel("Swansea","020 3966 8654","google.swansee.com","-2.9624006001947434","56.465844944513066","swansee eh45 kb",city15,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Swansea/StableCollage.jpeg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Swansea/Stable2.jpeg");
        hotelRepository.save(hotel22);

        //These are the hotels in Newport
        Hotel hotel24 = new Hotel("Newport","020 3966 8654","google.newport","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city16,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Newport/CuffernManorCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Newport/Cuffernmanor4.jpeg");
        hotelRepository.save(hotel24);

        //This is the cities in Ireland
        City city5 = new City("Dublin",country4,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Dublin/Dublin.jpeg");//done
        cityRepository.save(city5);
        City city6 = new City("Belfast",country4,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Belfast/Belfast.jpeg");//done
        cityRepository.save(city6);
        City city7 = new City("Galway",country4,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Galway/Galway.jpeg");//done
        cityRepository.save(city7);
        City city8 = new City("Donegal",country4,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Donegal/Donegal.jpeg");//done
        cityRepository.save(city8);

        //This is the hotels in Ireland
        Hotel hotel1 = new Hotel("Crowne Plaza Dublin Airport","+ 353-1-8628888","https://www.ihg.com/crowneplaza/hotels/gb/en/dublin/dblnp/hoteldetail","-6.245522215940467","53.404503137589636","Northwood Park Santry Demesne, Dublin 9 | Ireland",city5,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Dublin/CrowneCollage.jpeg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Dublin/crowneplaza1.jpeg");
        hotelRepository.save(hotel1);
        Hotel hotel2 = new Hotel("Meldron Belfast ","+35 02896001680","https://www.maldronhotelbelfastcity.com/room","-5.932631321052927","54.594818490728684","20 Brunswick Street Belfast",city6,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Belfast/MaldronCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Belfast/maldron1.jpeg");
        hotelRepository.save(hotel2);
        Hotel hotel3 = new Hotel("The Dean","+353 (0)91 749 200","https://thedean.ie/galway","-9.0467412975213","53.277101326967795","Galway 80 Prospect Hill, Galway",city7,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Galway/TheDeanCollage.jpg","");
        hotelRepository.save(hotel3);
        Hotel hotel4 = new Hotel("Donegal Hotel","+353749541112","https://www.woodhillhouse.com/","-8.403013666358087","54.75839283544279","Wood Road Ardara Donegal F94 E102 Ireland",city8,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Donegal/WoodCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Donegal/woodhillhouse3.jpeg");
        hotelRepository.save(hotel4);

       //This is the comment for Inverness
        Description description1 = new Description("Delicious meals from early breakfast till dinner",hotel10);
        descriptionRepository.save(description1);
        Description description2 = new Description("Our guest rooms have black-out curtains, great for good sleep.",hotel10);
        descriptionRepository.save(description2);
        Description description3 = new Description("Only 3 minute walk from Inverness Airport, easily accessible transport to Inverness city centre.",hotel10);
        descriptionRepository.save(description3);
        Description description4 = new Description("Business or leisure, your stay at hotel will be very comfortable",hotel10);
        descriptionRepository.save(description4);

        //This is the section for videos
        Video vide1 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg", hotel5);
        videoRepository.save(vide1);

        //This is the comments for Dundee
        Description description5 = new Description("Hotel with gym, shared lounge and 24-hour front desk.",hotel11);
        descriptionRepository.save(description5);
        Description description6 = new Description("Continental and buffet breakfast options are available each morning",hotel11);
        descriptionRepository.save(description6);
        Description description7 = new Description("Popular points of interest near hotel like Dundee Central Library and St Paul's Cathedral.",hotel11);
        descriptionRepository.save(description7);
        Description description8 = new Description("Visual aids: Tactile signs, Braille",hotel11);
        descriptionRepository.save(description8);
        Description description9 = new Description("Emergency cord in bathroom, lower bathroom sink, higher level toilet",hotel11);
        descriptionRepository.save(description9);

        //Edinburgh Eden Lock
        Description description10 = new Description("Offers free WiFi and is in the heart of the city, 72 rooms.",hotel5);
        descriptionRepository.save(description10);
        Description description11 = new Description("Rooms have flat-screen TV. There is a seating and/or dining area in some areas.",hotel5);
        descriptionRepository.save(description11);
        Description description12 = new Description("Private bathroom and kitchen, free toiletries, fresh bed linen available.",hotel5);
        descriptionRepository.save(description12);
        Description description13 = new Description("Many cultural places to go out and enjoy are close by.",hotel5);
        descriptionRepository.save(description13);
        Description description14 = new Description("In-room massages, spa treatments available upon request, must be paid",hotel5);
        descriptionRepository.save(description14);
        Description description15 = new Description("Edinburgh Castle Tour in Bsl available",hotel5);
        descriptionRepository.save(description15);


        //Edinburgh The Bonham
        Description description16 = new Description("49 individually designed bedrooms.",hotel6);
        descriptionRepository.save(description16);
        Description description17 = new Description("10 minute walk to Princes Street/Gardens, great views of Edinburgh Castle.",hotel6);
        descriptionRepository.save(description17);
        Description description18 = new Description("Hotel fully wheelchair accessible, bathroom with wet room.",hotel6);
        descriptionRepository.save(description18);
        Description description19 = new Description("Entry via ramp at rear of building",hotel6);
        descriptionRepository.save(description19);
        Description description20 = new Description("Lift access to every floor, guide dog friendly hotel.",hotel6);
        descriptionRepository.save(description20);

        //St Andrews LODGE 6 AT ELDERBURN LUXURY LODGES
        Description description21 = new Description("5 self-catering lodges.",hotel7);
        descriptionRepository.save(description21);
        Description description22 = new Description("Designed and built to suit people who may have additional access requirements.",hotel7);
        descriptionRepository.save(description22);
        Description description23 = new Description("All lodges have standard wheelchair-width doors, concrete pads to park on at the front door, level access into each house, bedrooms, bathrooms.",hotel7);
        descriptionRepository.save(description23);
        Description description24 = new Description("Additional grab rails and wetroom with shower.",hotel7);
        descriptionRepository.save(description24);

        //St Andrews CULMORE BRIDGE COTTAGES
        Description description25 = new Description("John and Jacqui welcome all guests at Culmore Bridge Cottages.",hotel8);
        descriptionRepository.save(description25);
        Description description26 = new Description("3 spacious, comfortable bungalows set in peaceful woodland area.",hotel8);
        descriptionRepository.save(description26);
        Description description27 = new Description("Cottages furnished to very high standard, all fully wheelchair-friendly",hotel8);
        descriptionRepository.save(description27);
        Description description28 = new Description("Large wet room with wheel-in shower, shower chair with arms, grab rails, high level toilet.\u200D",hotel8);
        descriptionRepository.save(description28);
        Description description29 = new Description("Wheelchair friendly furniture and carpets. Kitchens have some low-level worktops, access under hob and sink.",hotel8);
        descriptionRepository.save(description29);

        //Ireland Dublin
        Description description30 = new Description("Overlooking a leafy park, Hotel only 5 minutes by shuttle bus from Dublin Airport.",hotel1);
        descriptionRepository.save(description30);
        Description description31 = new Description("15 minutes by car from Dublin City Centre.",hotel1);
        descriptionRepository.save(description31);
        Description description32 = new Description("Enjoy Guinness Brewery, Jameson Whiskey Distillery, Trinity College and Book of Kells, rare book.\n",hotel1);
        descriptionRepository.save(description32);
        Description description33 = new Description("Induction Loop System at reception, Braille elevator available if visually impaired.",hotel1);
        descriptionRepository.save(description33);
        Description description34 = new Description("Vibrating fire alarm, visual alarm in hallways and public areas.",hotel1);
        descriptionRepository.save(description34);
        Description description35 = new Description("Hotel very wheelchair accessible as well.",hotel1);
        descriptionRepository.save(description35);
        Description description36 = new Description("Click on hotel link for more information and to book.",hotel1);
        descriptionRepository.save(description36);
        Description description37 = new Description("Exciting events in Dublin available : for example at the Little Museum, an Irish Sign Language Tour – click here https://www.littlemuseum.ie/irish-sign-language-tour\n",hotel1);
        descriptionRepository.save(description37);

        //Maldron Belfast
        Description description38 = new Description("Maldron Hotel is located right in the heart of Belfast city.",hotel2);
        descriptionRepository.save(description38);
        Description description39 = new Description("Walking distance to restaurants and historic landmarks.",hotel2);
        descriptionRepository.save(description39);
        Description description40 = new Description("Brilliant Customer Service, everything you need for great holidays.",hotel2);
        descriptionRepository.save(description40);
        Description description41 = new Description("Very wheelchair accessible, visual and vibration alarm, Braille in elevator, Loop System at reception. ",hotel2);
        descriptionRepository.save(description41);

        //Galway Belfast
        Description description42 = new Description("The Dean Galway is your home, right on doorstep of Wild Atlantic Way!",hotel3);
        descriptionRepository.save(description42);
        Description description43 = new Description("Hotel offers 100 super comfortable rooms.",hotel3);
        descriptionRepository.save(description43);
        Description description44 = new Description("Building has unique historic features, including part of Galway to Clifden railway tunnel.",hotel3);
        descriptionRepository.save(description44);
        Description description45 = new Description("Hotel has 4 ground floor rooms, one with full wheelchair access & a wet room",hotel3);
        descriptionRepository.save(description45);

        //Donegal
        Description description46 = new Description("Historic coastal house built 17th century. House overlooks beautiful Donegal Highlands.",hotel4);
        descriptionRepository.save(description46);
        Description description47 = new Description("Half mile from sea and one quarter from coastal town Ardara on the ‘Wild Atlantic Way’",hotel4);
        descriptionRepository.save(description47);
        Description description48 = new Description("Woodhill House well known for high quality and reasonable prices.",hotel4);
        descriptionRepository.save(description48);
        Description description49 = new Description("4 ground floor rooms with full wheelchair access & a wet room",hotel4);
        descriptionRepository.save(description49);
        Description description50 = new Description("Emergency cord in bathroom, lower bathroom sink, higher level toilet, toilet with grab rails",hotel4);
        descriptionRepository.save(description50);






    }


}
