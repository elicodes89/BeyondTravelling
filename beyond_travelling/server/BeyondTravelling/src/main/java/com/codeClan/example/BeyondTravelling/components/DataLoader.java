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
    CommentRepository commentRepository;


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
        Hotel hotel11 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city4,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Dundee/StaybridgeCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Dundee/Staybridge1.jpeg");
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
        Hotel hotel20 = new Hotel("Homefield Holidays","(+44) 01495 764212","https://homefield.wales/"," -2.866228647627431","51.9165695231888","Grosmont, Abergavenny NP7 8EP",city14,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Cardiff/HomefieldCollage.jpg","");
        hotelRepository.save(hotel20);

        //These are the hotels in Swansea
        Hotel hotel22 = new Hotel("The Stable","07368577232","https://www.walesgowercottages.co.uk/the-stable","-4.0944747","51.637405439890365","Blaen Cedi Farm SA4 4LX",city15,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Swansea/StableCollage.jpeg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Swansea/Stable2.jpeg");
        hotelRepository.save(hotel22);

        //These are the hotels in Newport
        Hotel hotel24 = new Hotel("Cuffernmanor","01437 710071","https://www.cuffernmanor.co.uk/","-5.0567761362527","51.8514641148183","Pembrokeshire SA62 6HB",city16,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Newport/CuffernManorCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Newport/Cuffernmanor4.jpeg");
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
        Comment description1 = new Comment("Delicious meals from early breakfast till dinner",hotel10);
        commentRepository.save(description1);
        Comment description2 = new Comment("Our guest rooms have black-out curtains, great for good sleep.",hotel10);
        commentRepository.save(description2);
        Comment description3 = new Comment("Only 3 minute walk from Inverness Airport, easily accessible transport to Inverness city centre.",hotel10);
        commentRepository.save(description3);
        Comment description4 = new Comment("Business or leisure, your stay at hotel will be very comfortable",hotel10);
        commentRepository.save(description4);

        //This is the section for videos
        Video vide1 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg", hotel5);
        videoRepository.save(vide1);
//        Video vide2 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg", hotel5);
//        videoRepository.save(vide2);
//        Video vide3 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg", hotel5);
//        videoRepository.save(vide3);
//        Video vide4 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg", hotel5);
//        videoRepository.save(vide4);
//
         //This is the comments for Dundee
        Comment description5 = new Comment("Hotel with gym, shared lounge and 24-hour front desk.",hotel11);
        commentRepository.save(description5);
        Comment description6 = new Comment("Continental and buffet breakfast options are available each morning",hotel11);
        commentRepository.save(description6);
        Comment description7 = new Comment("Popular points of interest near hotel like Dundee Central Library and St Paul's Cathedral.",hotel11);
        commentRepository.save(description7);
        Comment description8 = new Comment("Visual aids: Tactile signs, Braille",hotel11);
        commentRepository.save(description8);
        Comment description9 = new Comment("Emergency cord in bathroom, lower bathroom sink, higher level toilet",hotel11);
        commentRepository.save(description9);

        //Edinburgh Eden Lock
        Comment comment10 = new Comment("Offers free WiFi and is in the heart of the city, 72 rooms.",hotel5);
        commentRepository.save(comment10);
        Comment comment11 = new Comment("Rooms have flat-screen TV. There is a seating and/or dining area in some areas.",hotel5);
        commentRepository.save(comment11);
        Comment description12 = new Comment("Private bathroom and kitchen, free toiletries, fresh bed linen available.",hotel5);
        commentRepository.save(description12);
        Comment description13 = new Comment("Many cultural places to go out and enjoy are close by.",hotel5);
        commentRepository.save(description13);
        Comment description14 = new Comment("In-room massages, spa treatments available upon request, must be paid",hotel5);
        commentRepository.save(description14);
        Comment description15 = new Comment("Edinburgh Castle Tour in Bsl available",hotel5);
        commentRepository.save(description15);

        //Edinburgh The Bonham
        Comment description16 = new Comment("49 individually designed bedrooms.",hotel6);
        commentRepository.save(description16);
        Comment description17 = new Comment("10 minute walk to Princes Street/Gardens, great views of Edinburgh Castle.",hotel6);
        commentRepository.save(description17);
        Comment description18 = new Comment("Hotel fully wheelchair accessible, bathroom with wet room.",hotel6);
        commentRepository.save(description18);
        Comment description19 = new Comment("Entry via ramp at rear of building",hotel6);
        commentRepository.save(description19);
        Comment description20 = new Comment("Lift access to every floor, guide dog friendly hotel.",hotel6);
        commentRepository.save(description20);

        //St Andrews LODGE 6 AT ELDERBURN LUXURY LODGES
        Comment description21 = new Comment("5 self-catering lodges.",hotel7);
        commentRepository.save(description21);
        Comment description22 = new Comment("Designed and built to suit people who may have additional access requirements.",hotel7);
        commentRepository.save(description22);
        Comment description23 = new Comment("All lodges have standard wheelchair-width doors, concrete pads to park on at the front door, level access into each house, bedrooms, bathrooms.",hotel7);
        commentRepository.save(description23);
        Comment description24 = new Comment("Additional grab rails and wetroom with shower.",hotel7);
        commentRepository.save(description24);

        //St Andrews CULMORE BRIDGE COTTAGES
        Comment description25 = new Comment("John and Jacqui welcome all guests at Culmore Bridge Cottages.",hotel8);
        commentRepository.save(description25);
        Comment description26 = new Comment("3 spacious, comfortable bungalows set in peaceful woodland area.",hotel8);
        commentRepository.save(description26);
        Comment description27 = new Comment("Cottages furnished to very high standard, all fully wheelchair-friendly",hotel8);
        commentRepository.save(description27);
        Comment description28 = new Comment("Large wet room with wheel-in shower, shower chair with arms, grab rails, high level toilet.",hotel8);
        commentRepository.save(description28);
        Comment description29 = new Comment("Wheelchair friendly furniture and carpets. Kitchens have some low-level worktops, access under hob and sink.",hotel8);
        commentRepository.save(description29);

        //Ireland Dublin
        Comment description30 = new Comment("Overlooking a leafy park, Hotel only 5 minutes by shuttle bus from Dublin Airport.",hotel1);
        commentRepository.save(description30);
        Comment description31 = new Comment("15 minutes by car from Dublin City Centre.",hotel1);
        commentRepository.save(description31);
        Comment description32 = new Comment("Enjoy Guinness Brewery, Jameson Whiskey Distillery, Trinity College and Book of Kells, rare book.\n",hotel1);
        commentRepository.save(description32);
        Comment description33 = new Comment("Induction Loop System at reception, Braille elevator available if visually impaired.",hotel1);
        commentRepository.save(description33);
        Comment description34 = new Comment("Vibrating fire alarm, visual alarm in hallways and public areas.",hotel1);
        commentRepository.save(description34);
        Comment description35 = new Comment("Hotel very wheelchair accessible as well.",hotel1);
        commentRepository.save(description35);
        Comment description36 = new Comment("Click on hotel link for more information and to book.",hotel1);
        commentRepository.save(description36);
        Comment description37 = new Comment("Exciting events in Dublin available : for example at the Little Museum, an Irish Sign Language Tour – click here https://www.littlemuseum.ie/irish-sign-language-tour\n",hotel1);
        commentRepository.save(description37);

       //Maldron Belfast
        Comment description38 = new Comment("Maldron Hotel is located right in the heart of Belfast city.",hotel2);
        commentRepository.save(description38);
        Comment description39 = new Comment("Walking distance to restaurants and historic landmarks.",hotel2);
        commentRepository.save(description39);
        Comment description40 = new Comment("Brilliant Customer Service, everything you need for great holidays.",hotel2);
        commentRepository.save(description40);
        Comment description41 = new Comment("Very wheelchair accessible, visual and vibration alarm, Braille in elevator, Loop System at reception. ",hotel2);
        commentRepository.save(description41);

        //Galway Belfast
        Comment description42 = new Comment("The Dean Galway is your home, right on doorstep of Wild Atlantic Way!",hotel3);
        commentRepository.save(description42);
        Comment description43 = new Comment("Hotel offers 100 super comfortable rooms.",hotel3);
        commentRepository.save(description43);
        Comment description44 = new Comment("Building has unique historic features, including part of Galway to Clifden railway tunnel.",hotel3);
        commentRepository.save(description44);
        Comment description45 = new Comment("Hotel has 4 ground floor rooms, one with full wheelchair access & a wet room",hotel3);
        commentRepository.save(description45);

        //Donegal
        Comment description46 = new Comment("Historic coastal house built 17th century. House overlooks beautiful Donegal Highlands.",hotel4);
        commentRepository.save(description46);
        Comment description47 = new Comment("Half mile from sea and one quarter from coastal town Ardara on the ‘Wild Atlantic Way’",hotel4);
        commentRepository.save(description47);
        Comment description48 = new Comment("Woodhill House well known for high quality and reasonable prices.",hotel4);
        commentRepository.save(description48);
        Comment description49 = new Comment("4 ground floor rooms with full wheelchair access & a wet room",hotel4);
        commentRepository.save(description49);
        Comment description50 = new Comment("Emergency cord in bathroom, lower bathroom sink, higher level toilet, toilet with grab railsr",hotel4);
        commentRepository.save(description50);

        //Skye
        Comment description51 = new Comment("",hotel9);
        commentRepository.save(description51);
        Comment description52 = new Comment("",hotel9);
        commentRepository.save(description52);
        Comment description53 = new Comment("",hotel9);
        commentRepository.save(description53);
        Comment description54 = new Comment("",hotel9);
        commentRepository.save(description54);
        Comment description55 = new Comment("",hotel9);
        commentRepository.save(description55);

        //Newport Wales
        Comment description56 = new Comment("",hotel24);
        commentRepository.save(description56);
        Comment description57 = new Comment("",hotel24);
        commentRepository.save(description57);
        Comment description58 = new Comment("",hotel24);
        commentRepository.save(description58);
        Comment description59 = new Comment("",hotel24);
        commentRepository.save(description59);
        Comment description60 = new Comment("",hotel24);
        commentRepository.save(description60);

        //Swansee Wales
        Comment description61 = new Comment("",hotel22);
        commentRepository.save(description61);
        Comment description62 = new Comment("",hotel22);
        commentRepository.save(description62);
        Comment description63 = new Comment("",hotel22);
        commentRepository.save(description63);
        Comment description64 = new Comment("",hotel22);
        commentRepository.save(description64);
        Comment description65 = new Comment("",hotel22);
        commentRepository.save(description65);

        //Cardiff
        Comment description66 = new Comment("",hotel20);
        commentRepository.save(description66);
        Comment description67 = new Comment("",hotel20);
        commentRepository.save(description67);
        Comment description68 = new Comment("",hotel20);
        commentRepository.save(description68);
        Comment description69 = new Comment("",hotel20);
        commentRepository.save(description69);
        Comment description70 = new Comment("",hotel20);
        commentRepository.save(description70);

        //Liverpool
        Comment description71 = new Comment("",hotel18);
        commentRepository.save(description71);
        Comment description72 = new Comment("",hotel18);
        commentRepository.save(description72);
        Comment description73 = new Comment("",hotel18);
        commentRepository.save(description73);

        //London
        Comment description74 = new Comment("",hotel12);
        commentRepository.save(description74);
        Comment description75 = new Comment("",hotel12);
        commentRepository.save(description75);
        Comment description76 = new Comment("",hotel12);
        commentRepository.save(description76);
        Comment description77 = new Comment("",hotel12);
        commentRepository.save(description77);
        Comment description78 = new Comment("",hotel12);
        commentRepository.save(description78);

        //Manchaster
        Comment description79 = new Comment("",hotel14);
        commentRepository.save(description79);
        Comment description80 = new Comment("",hotel14);
        commentRepository.save(description80);
        Comment description81 = new Comment("",hotel14);
        commentRepository.save(description81);
        Comment description82 = new Comment("",hotel14);
        commentRepository.save(description82);
        Comment description83 = new Comment("",hotel14);
        commentRepository.save(description83);

        //Birmigham
        Comment description84 = new Comment("",hotel16);
        commentRepository.save(description84);
        Comment description85 = new Comment("",hotel16);
        commentRepository.save(description85);
        Comment description86 = new Comment("",hotel16);
        commentRepository.save(description86);
        Comment description87 = new Comment("",hotel16);
        commentRepository.save(description87);

    }


}
