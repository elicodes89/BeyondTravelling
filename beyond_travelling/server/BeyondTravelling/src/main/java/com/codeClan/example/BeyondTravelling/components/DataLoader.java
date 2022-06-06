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
        Hotel hotel1 = new Hotel("Eden Locke","0330 056 3363","https://www.lockeliving.com/en/edinburgh/eden-locke?utm_source=google-my-business&utm_medium=organic&utm_campaign=eden-locke","-3.205272.","55.952035","127 George St, Edinburgh, EH2 4JN, United Kingdom",city1,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Edinburgh/EdenLockeCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/features/db_working/beyond_travelling/client/new_app/src/regions/Scotland/Edinburgh/Eden_Locke_EDI.jpeg");
        hotelRepository.save(hotel1 );

        // Eden Lock Edinburgh
        Comment comment10 = new Comment("Offers free WiFi and is in the heart of the city, 72 rooms.",hotel1);
        commentRepository.save(comment10);
        Comment comment11 = new Comment("Rooms have flat-screen TV. There is a seating and/or dining area in some areas.",hotel1);
        commentRepository.save(comment11);
        Comment description12 = new Comment("Private bathroom and kitchen, free toiletries, fresh bed linen available.",hotel1);
        commentRepository.save(description12);
        Comment description13 = new Comment("Many cultural places to go out and enjoy are close by.",hotel1);
        commentRepository.save(description13);
        Comment description14 = new Comment("In-room massages, spa treatments available upon request, must be paid",hotel1);
        commentRepository.save(description14);
        Comment description15 = new Comment("Edinburgh Castle Tour in Bsl available",hotel1);
        commentRepository.save(description15);

        //This is the hotels in Edinburgh
        Hotel hotel2 = new Hotel("The Bonham","0131 226 6050","https://thebonham.com/","-3.188267"," 55.953251","35 Drumsheugh Gardens, Edinburgh, EH3 7RN, United Kingdom",city1,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Edinburgh/BonhamCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Edinburgh/Bonham4.jpeg");
        hotelRepository.save(hotel2);

        //The Bonham Edinburgh
        Comment description16 = new Comment("49 individually designed bedrooms.",hotel2);
        commentRepository.save(description16);
        Comment description17 = new Comment("10 minute walk to Princes Street/Gardens, great views of Edinburgh Castle.",hotel2);
        commentRepository.save(description17);
        Comment description18 = new Comment("Hotel fully wheelchair accessible, bathroom with wet room.",hotel2);
        commentRepository.save(description18);
        Comment description19 = new Comment("Entry via ramp at rear of building",hotel2);
        commentRepository.save(description19);
        Comment description20 = new Comment("Lift access to every floor, guide dog friendly hotel.",hotel2);
        commentRepository.save(description20);


        //This is the hotels in St Andrews
        Hotel hotel3 = new Hotel("LODGE 6 AT ELDERBURN LUXURY LODGES","07840 801114","https://www.elderburnlodges.co.uk/","-2.8667399693141506.","56.31194469351686","Denhead, St Andrews KY16 8PA",city2,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/ElderburnCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/Elderburn1.jpeg");
        hotelRepository.save(hotel3);

        //St Andrews LODGE 6 AT ELDERBURN LUXURY LODGES
        Comment description21 = new Comment("5 self-catering lodges.",hotel3);
        commentRepository.save(description21);
        Comment description22 = new Comment("Designed and built to suit people who may have additional access requirements.",hotel3);
        commentRepository.save(description22);
        Comment description23 = new Comment("All lodges have standard wheelchair-width doors, concrete pads to park on at the front door, level access into each house, bedrooms, bathrooms.",hotel3);
        commentRepository.save(description23);
        Comment description24 = new Comment("Additional grab rails and wetroom with shower.",hotel3);
        commentRepository.save(description24);

        //This is the hotels in St Andrews
        Hotel hotel4 = new Hotel("CULMORE BRIDGE COTTAGES","01776 830539","http://www.culmorebridge.co.uk/"," -4.9617529240942515"," 54.862040001883365","Sandhead, Stranraer DG9 9DX",city2,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/CulmoreCollage.jpg?rW=TRUE","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/St%20Andrews/Culmore1.jpeg");
        hotelRepository.save(hotel4);

        //St Andrews CULMORE BRIDGE COTTAGES
        Comment description25 = new Comment("John and Jacqui welcome all guests at Culmore Bridge Cottages.",hotel4);
        commentRepository.save(description25);
        Comment description26 = new Comment("3 spacious, comfortable bungalows set in peaceful woodland area.",hotel4);
        commentRepository.save(description26);
        Comment description27 = new Comment("Cottages furnished to very high standard, all fully wheelchair-friendly",hotel4);
        commentRepository.save(description27);
        Comment description28 = new Comment("Large wet room with wheel-in shower, shower chair with arms, grab rails, high level toilet.",hotel4);
        commentRepository.save(description28);
        Comment description29 = new Comment("Wheelchair friendly furniture and carpets. Kitchens have some low-level worktops, access under hob and sink.",hotel4);
        commentRepository.save(description29);

        //This is the hotel in Inverness
        Hotel hotel5 = new Hotel("Courtyard by Marriott Inverness Airport","(800) 085-8179","https://www.marriott.co.uk","-4.065986557353875","57.53859107575739","Dalcross, Inverness, IV2 7BL, United Kingdom",city3,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Inverness/CourtyardCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Inverness/Courtyard1.jpeg");
        hotelRepository.save(hotel5);

        //This is the comment for Inverness
        Comment description1 = new Comment("Delicious meals from early breakfast till dinner",hotel5);
        commentRepository.save(description1);
        Comment description2 = new Comment("Our guest rooms have black-out curtains, great for good sleep.",hotel5);
        commentRepository.save(description2);
        Comment description3 = new Comment("Only 3 minute walk from Inverness Airport, easily accessible transport to Inverness city centre.",hotel5);
        commentRepository.save(description3);
        Comment description4 = new Comment("Business or leisure, your stay at hotel will be very comfortable",hotel5);
        commentRepository.save(description4);

        //This is the hotel in Dundee
        Hotel hotel6 = new Hotel("Staybridge Suites","020 3966 8654","https://www.guestreservations.com","-2.9624006001947434","56.465844944513066","Lower Dens Mill, Dundee, DD4 6AD, United Kingdom",city4,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Dundee/StaybridgeCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Dundee/Staybridge1.jpeg");
        hotelRepository.save(hotel6);

        //This is the comments for Dundee
        Comment description5 = new Comment("Hotel with gym, shared lounge and 24-hour front desk.",hotel6);
        commentRepository.save(description5);
        Comment description6 = new Comment("Continental and buffet breakfast options are available each morning",hotel6);
        commentRepository.save(description6);
        Comment description7 = new Comment("Popular points of interest near hotel like Dundee Central Library and St Paul's Cathedral.",hotel6);
        commentRepository.save(description7);
        Comment description8 = new Comment("Visual aids: Tactile signs, Braille",hotel6);
        commentRepository.save(description8);
        Comment description9 = new Comment("Emergency cord in bathroom, lower bathroom sink, higher level toilet",hotel6);
        commentRepository.save(description9);

        //This is the hotel in Skye
        Hotel hotel7 = new Hotel("Isle of Raasay Distillery","01478 470178","https://raasaydistillery.com/","-6.07391043731","57.3518275583","Borodale House Isle of Raasay, Kyle IV40 8PB",city19,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Skye/RaasayCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Scotland/Skye/Raasay6.jpeg");
        hotelRepository.save(hotel7);

        //Skye
        Comment description51 = new Comment("Only Scottish distillery where you can stay overnight in the same building",hotel7);
        commentRepository.save(description51);
        Comment description52 = new Comment("Unforgettable experience, where whisky and hospitality go hand in hand.",hotel7);
        commentRepository.save(description52);
        Comment description53 = new Comment("Borodale House, Victorian villa transformed into distillery.",hotel7);
        commentRepository.save(description53);
        Comment description54 = new Comment("Six ensuite bedrooms, can be booked individually or by groups of up to 12",hotel7);
        commentRepository.save(description54);
        Comment description55 = new Comment("Non smoking rooms, rooms accessible via wheelchair.",hotel7);
        commentRepository.save(description55);

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
        Hotel hotel8 = new Hotel("The Guardsman","0207 309 9200","https://www.guardsmanhotel.com","-0.13703021534406976","51.49950352375432,","1 Vandon Street Westminster, Westminster Borough, London, SW1H 0AH",city10,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/London/GuardsmanCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/features/db_working/beyond_travelling/client/new_app/src/regions/England/London/The_Guardsman_London.jpeg");
        hotelRepository.save(hotel8);

        //London
        Comment description73 = new Comment("More than a hotel, can be your home away from home. ",hotel8);
        commentRepository.save(description73);
        Comment description74 = new Comment("Need one, two or three bedrooms, all are sumptuous, beautifully designed.",hotel8);
        commentRepository.save(description74);
        Comment description75 = new Comment("Own kitchen, space to work, private chef, 24 hour room service. ",hotel8);
        commentRepository.save(description75);
        Comment description76 = new Comment("Comfort and privacy of your own home with the added hotel service.",hotel8);
        commentRepository.save(description76);
        Comment description77 = new Comment("Lift and wheelchair accessible bathroom.",hotel8);
        commentRepository.save(description77);

        //This is the hotel in Manchester
        Hotel hotel9 = new Hotel("Clayton Hotel Manchester City Centre","+44 161 433 7580","https://www.claytonhotelmanchestercitycentre.com/","-2.2368257021083737","53.47843255407386","55 Portland St Manchester M1 3HP United Kingdom",city11,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Manchester/ClaytonCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/features/db_working/beyond_travelling/client/new_app/src/regions/England/Manchester/Clayton_Hotel_Manchaster.jpeg");
        hotelRepository.save(hotel9);

        //Manchaster
        Comment description78 = new Comment("Clayton Hotel perfectly located in the heart of the city on Portland Street.",hotel9);
        commentRepository.save(description78);
        Comment description79 = new Comment("5 minute walk from Piccadilly Gardens.",hotel9);
        commentRepository.save(description79);
        Comment description80 = new Comment("Transport links, shopping, art galleries, bars & restaurants all closeby.",hotel9);
        commentRepository.save(description80);
        Comment description81 = new Comment("Grab rails in toilet and shower, ample floor space. ",hotel9);
        commentRepository.save(description81);
        Comment description82 = new Comment("Relax with complimentary WiFi and multi-channel HD TV.",hotel9);
        commentRepository.save(description82);

        //These are the hotels in Birmingham
        Hotel hotel10 = new Hotel("Aparthotel Adagio Birmingham City Centre","0121 399 0500","https://www.adagio-city.com/gb/hotel-8117-aparthotel-adagio-birmingham-city-centre/index.shtml?utm_source=googleMaps&utm_medium=seoMaps&utm_campaign=seoMaps&y_source=1_MTUzNjIzMDUtNzE1LWxvY2F0aW9uLndlYnNpdGU%3D","-1.888801932796513","52.4773625753563","131 Digbeth, Birmingham B5 6DR",city12,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Birmingham/HolidayCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/features/db_working/beyond_travelling/client/new_app/src/regions/England/Birmingham/Aparthotel_Birmingham.jpeg");
        hotelRepository.save(hotel10);

        //Birmigham
        Comment description83 = new Comment("Proud partner alongside AccessABLE, the UKs leading provider of access information.",hotel10);
        commentRepository.save(description83);
        Comment description84 = new Comment("Enjoy countryside views from fully air conditioned guest rooms.",hotel10);
        commentRepository.save(description84);
        Comment description85 = new Comment("24-hour room service menu with delicious dishes.",hotel10);
        commentRepository.save(description85);
        Comment description86 = new Comment("Bring your furry friend",hotel10);
        commentRepository.save(description86);


        //These are the hotels in Liverpool
        Hotel hotel11 = new Hotel("INNSIDE Liverpool","0151 832 0960","https://www.melia.com/en/hotels/united-kingdom/liverpool/innside-liverpool/index.htm?utm_medium=organic&utm_source=uberall&utm_content=dynamic","-2.9944098777745354","53.41024421444565","43 Old Hall St, Liverpool L3 9PP",city13,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/England/Liverpool/InnsideCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/features/db_working/beyond_travelling/client/new_app/src/regions/England/Liverpool/Innside_Liverpool.jpeg");
        hotelRepository.save(hotel11);

        //Hotel in Liverpool
        Comment description87 = new Comment("Short walk from Liver Building and iconic Albert Dock",hotel11);
        commentRepository.save(description87);
        Comment description88 = new Comment("Moorfields Metro Station, Castle Street and Town Hall closeby.",hotel11);
        commentRepository.save(description88);
        Comment description89 = new Comment("Short trip from Liverpool John Lennon Airport or Manchester International Airport",hotel11);
        commentRepository.save(description89);

        //This is the cities in Wales
        City city14 = new City("Cardiff",country3,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Cardiff/Cardiff.jpeg");
        cityRepository.save(city14);
        City city15 = new City("Swansea",country3, "https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Swansea/Swansea.jpeg");
        cityRepository.save(city15);
        City city16 = new City("Newport",country3,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Newport/Newport.jpeg");
        cityRepository.save(city16);

        //These are the hotels in Cardiff
        Hotel hotel12 = new Hotel("Homefield Holidays","(+44) 01495 764212","https://homefield.wales/"," -2.866228647627431","51.9165695231888","Grosmont, Abergavenny NP7 8EP",city14,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Cardiff/HomefieldCollage.jpg","");
        hotelRepository.save(hotel12);

        //Cardiff
        Comment description66 = new Comment("Living areas designed to keep tranquility in mind. ",hotel12);
        commentRepository.save(description66);
        Comment description67 = new Comment("Disabled friendly, wheelchair friendly and dog friendly",hotel12);
        commentRepository.save(description67);
        Comment description68 = new Comment("Spacious Farmhouse style kitchen has everything you need.",hotel12);
        commentRepository.save(description68);
        Comment description69 = new Comment("Ramp to patio with level access into the conservatory and kitchen.",hotel12);
        commentRepository.save(description69);

        //These are the hotels in Swansea
        Hotel hotel13 = new Hotel("The Stable","07368577232","https://www.walesgowercottages.co.uk/the-stable","-4.0944747","51.637405439890365","Blaen Cedi Farm SA4 4LX",city15,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Swansea/StableCollage.jpeg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Swansea/Stable2.jpeg");
        hotelRepository.save(hotel13);

        //Swansee Wales
        Comment description61 = new Comment("Grounds  accessed via secure electric gate.",hotel13);
        commentRepository.save(description61);
        Comment description62 = new Comment("Wheelchair accessible cottages hidden away at end of short lane.",hotel13);
        commentRepository.save(description62);
        Comment description63 = new Comment("Diverse fauna, large variety of wildlife to enjoy or photograph.",hotel13);
        commentRepository.save(description63);
        Comment description64 = new Comment("Clean air, no light pollution, great for star gazing.",hotel13);
        commentRepository.save(description64);
        Comment description65 = new Comment("Cottages nested amongst green farmland, woodland and fields.",hotel13);
        commentRepository.save(description65);

        //These are the hotels in Newport
        Hotel hotel14 = new Hotel("Cuffernmanor","01437 710071","https://www.cuffernmanor.co.uk/","-5.0567761362527","51.8514641148183","Pembrokeshire SA62 6HB",city16,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Newport/CuffernManorCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Wales/Newport/Cuffernmanor4.jpeg");
        hotelRepository.save(hotel14);

        //Newport Wales
        Comment description56 = new Comment("Cuffern Manor has four en-suite double rooms, two single rooms beside 3 acres of beautiful gardens.",hotel14);
        commentRepository.save(description56);
        Comment description57 = new Comment("The accessible shower/toilet in rooms. ",hotel14);
        commentRepository.save(description57);
        Comment description58 = new Comment("Guide dogs allowed",hotel14);
        commentRepository.save(description58);
        Comment description59 = new Comment("Wheelchair access to Pembrokeshire Coastal path.",hotel14);
        commentRepository.save(description59);
        Comment description60 = new Comment("Special wheelchairs for the beach available.",hotel14);
        commentRepository.save(description60);


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
        Hotel hotel15 = new Hotel("Crowne Plaza Dublin Airport","+ 353-1-8628888","https://www.ihg.com/crowneplaza/hotels/gb/en/dublin/dblnp/hoteldetail","-6.245522215940467","53.404503137589636","Northwood Park Santry Demesne, Dublin 9 | Ireland",city5,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Dublin/CrowneCollage.jpeg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Dublin/crowneplaza1.jpeg");
        hotelRepository.save(hotel15);

        //Ireland Dublin
        Comment description30 = new Comment("Overlooking a leafy park, Hotel only 5 minutes by shuttle bus from Dublin Airport.",hotel15);
        commentRepository.save(description30);
        Comment description31 = new Comment("15 minutes by car from Dublin City Centre.",hotel15);
        commentRepository.save(description31);
        Comment description32 = new Comment("Enjoy Guinness Brewery, Jameson Whiskey Distillery, Trinity College and Book of Kells, rare book.",hotel15);
        commentRepository.save(description32);
        Comment description33 = new Comment("Induction Loop System at reception, Braille elevator available if visually impaired.",hotel15);
        commentRepository.save(description33);
        Comment description34 = new Comment("Vibrating fire alarm, visual alarm in hallways and public areas.",hotel15);
        commentRepository.save(description34);
        Comment description35 = new Comment("Hotel very wheelchair accessible as well.",hotel15);
        commentRepository.save(description35);
        Comment description36 = new Comment("Click on hotel link for more information and to book.",hotel15);
        commentRepository.save(description36);
        Comment description37 = new Comment("Exciting events in Dublin available : for example at the Little Museum, an Irish Sign Language Tour – click here https://www.littlemuseum.ie/irish-sign-language-tour",hotel15);
        commentRepository.save(description37);
        
        //This is a hotel in Belfast
        Hotel hotel16 = new Hotel("Meldron Belfast ","+35 02896001680","https://www.maldronhotelbelfastcity.com/room","-5.932631321052927","54.594818490728684","20 Brunswick Street Belfast",city6,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Belfast/MaldronCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Belfast/maldron1.jpeg");
        hotelRepository.save(hotel16);

        //Maldron Ireland
        Comment description38 = new Comment("Maldron Hotel is located right in the heart of Belfast city.",hotel16);
        commentRepository.save(description38);
        Comment description39 = new Comment("Walking distance to restaurants and historic landmarks.",hotel16);
        commentRepository.save(description39);
        Comment description40 = new Comment("Brilliant Customer Service, everything you need for great holidays.",hotel16);
        commentRepository.save(description40);
        Comment description41 = new Comment("Very wheelchair accessible, visual and vibration alarm, Braille in elevator, Loop System at reception. ",hotel16);
        commentRepository.save(description41);
        
        //This is a hotel in Galway
        Hotel hotel17 = new Hotel("The Dean","+353 (0)91 749 200","https://thedean.ie/galway","-9.0467412975213","53.277101326967795","Galway 80 Prospect Hill, Galway",city7,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Galway/TheDeanCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/features/db_working/beyond_travelling/client/new_app/src/regions/Ireland/Galway/The%20dean%20galway.jpeg");
        hotelRepository.save(hotel17);

        //Galway Ireland
        Comment description42 = new Comment("The Dean Galway is your home, right on doorstep of Wild Atlantic Way!",hotel17);
        commentRepository.save(description42);
        Comment description43 = new Comment("Hotel offers 100 super comfortable rooms.",hotel17);
        commentRepository.save(description43);
        Comment description44 = new Comment("Building has unique historic features, including part of Galway to Clifden railway tunnel.",hotel17);
        commentRepository.save(description44);
        Comment description45 = new Comment("Hotel has 4 ground floor rooms, one with full wheelchair access & a wet room",hotel17);
        commentRepository.save(description45);

        //This is a hotel in Donegal
        Hotel hotel18 = new Hotel("Donegal Hotel","+353749541112","https://www.woodhillhouse.com/","-8.403013666358087","54.75839283544279","Wood Road Ardara Donegal F94 E102 Ireland",city8,"https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Donegal/WoodCollage.jpg","https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/regions/Ireland/Donegal/woodhillhouse3.jpeg");
        hotelRepository.save(hotel18);

        //Donegal
        Comment description46 = new Comment("Historic coastal house built 17th century. House overlooks beautiful Donegal Highlands.",hotel18);
        commentRepository.save(description46);
        Comment description47 = new Comment("Half mile from sea and one quarter from coastal town Ardara on the ‘Wild Atlantic Way’",hotel18);
        commentRepository.save(description47);
        Comment description48 = new Comment("Woodhill House well known for high quality and reasonable prices.",hotel18);
        commentRepository.save(description48);
        Comment description49 = new Comment("4 ground floor rooms with full wheelchair access & a wet room",hotel18);
        commentRepository.save(description49);
        Comment description50 = new Comment("Emergency cord in bathroom, lower bathroom sink, higher level toilet, toilet with grab railsr",hotel18);
        commentRepository.save(description50);

        //This is the section for videos these line can be deleted!!!
        //Welcome to Beyond Travelling
        Video vide1 = new Video("https://www.youtube.com/embed/swyWGfjBbAA", hotel15);
        videoRepository.save(vide1);
        //Welcome to the deaf friendly Crowne Plaza Hotel Dublin
        Video vide2 = new Video("https://www.youtube.com/embed/AZlVAc9Ip8I", hotel15);
        videoRepository.save(vide2);
        //This Hotel is near a hospital
        Video vide3 = new Video("https://www.youtube.com/embed/Wo-zruz4_zY", hotel15);
        videoRepository.save(vide3);
        //Click below for more BSL content
        Video vide4 = new Video("https://www.youtube.com/embed/9EI1JkhlhOI", hotel15);
        videoRepository.save(vide4);
        //This hotel has a 24 hour reception
        Video vide5 = new Video("https://www.youtube.com/embed/UBn9Kw6zjSw", hotel15);
        videoRepository.save(vide5);
        //This hotel has visual fire alarms
        Video vide6 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg", hotel15);
        videoRepository.save(vide6);
        //This video is wheelchair accessible
        Video vide7 = new Video("https://www.youtube.com/embed/bwtvvf-EzfA", hotel15);
        videoRepository.save(vide7);
        //Bathroom doors are wider than 32 inch and have grab rails
        Video vide8 = new Video("https://www.youtube.com/embed/YzHqL7ZXnjk", hotel15);
        videoRepository.save(vide8);

        //Video
        Video vide9 = new Video("https://www.youtube.com/embed/Wo-zruz4_zY", hotel1);
        videoRepository.save(vide9);
        //This hotel has a 24 hour reception
        Video vide10 = new Video("https://www.youtube.com/embed/UBn9Kw6zjSw", hotel1);
        videoRepository.save(vide10);
        //This hotel has visual fire alarms
        Video vide11 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg",hotel1);
        videoRepository.save(vide11);
        //This video is wheelchair accessible
        Video vide12 = new Video("https://www.youtube.com/embed/bwtvvf-EzfA", hotel1);
        videoRepository.save(vide12);
        //Bathroom doors are wider than 32 inch and have grab rails
        Video vide13 = new Video("https://www.youtube.com/embed/YzHqL7ZXnjk",hotel1);
        videoRepository.save(vide13);

        //Hotel 2
        Video vide14 = new Video("https://www.youtube.com/embed/Wo-zruz4_zY", hotel8);
        videoRepository.save(vide14);
        //This hotel has a 24 hour reception
        Video vide15 = new Video("https://www.youtube.com/embed/UBn9Kw6zjSw", hotel8);
        videoRepository.save(vide15);
        //This hotel has visual fire alarms
        Video vide16 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg",hotel8 );
        videoRepository.save(vide16);
        //This video is wheelchair accessible
        Video vide17 = new Video("https://www.youtube.com/embed/bwtvvf-EzfA", hotel8);
        videoRepository.save(vide17);
        //Bathroom doors are wider than 32 inch and have grab rails
        Video vide18 = new Video("https://www.youtube.com/embed/YzHqL7ZXnjk", hotel8);
        videoRepository.save(vide18);

        //Hotel 3
        Video vide19 = new Video("https://www.youtube.com/embed/Wo-zruz4_zY", hotel3);
        videoRepository.save(vide19);
        //This hotel has a 24 hour reception
        Video vide20 = new Video("https://www.youtube.com/embed/UBn9Kw6zjSw",hotel3);
        videoRepository.save(vide20);
        //This hotel has visual fire alarms
        Video vide21 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg",hotel3);
        videoRepository.save(vide21);
        //This video is wheelchair accessible
        Video vide22 = new Video("https://www.youtube.com/embed/bwtvvf-EzfA", hotel3);
        videoRepository.save(vide22);
        //Bathroom doors are wider than 32 inch and have grab rails
        Video vide23 = new Video("https://www.youtube.com/embed/YzHqL7ZXnjk", hotel3);
        videoRepository.save(vide23);

        //Hotel 4
        Video vide24 = new Video("https://www.youtube.com/embed/Wo-zruz4_zY",hotel13);
        videoRepository.save(vide24);
        //This hotel has a 24 hour reception
        Video vide25 = new Video("https://www.youtube.com/embed/UBn9Kw6zjSw",hotel13);
        videoRepository.save(vide25);
        //This hotel has visual fire alarms
        Video vide26 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg", hotel13);
        videoRepository.save(vide26);
        //This video is wheelchair accessible
        Video vide27 = new Video("https://www.youtube.com/embed/bwtvvf-EzfA",hotel13);
        videoRepository.save(vide27);
        //Bathroom doors are wider than 32 inch and have grab rails
        Video vide28 = new Video("https://www.youtube.com/embed/YzHqL7ZXnjk",hotel13);
        videoRepository.save(vide28);

        //Hotel 5
        Video vide29 = new Video("https://www.youtube.com/embed/Wo-zruz4_zY", hotel18);
        videoRepository.save(vide29);
        //This hotel has a 24 hour reception
        Video vide30 = new Video("https://www.youtube.com/embed/UBn9Kw6zjSw", hotel18);
        videoRepository.save(vide30);
        //This hotel has visual fire alarms
        Video vide31 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg",hotel18);
        videoRepository.save(vide31);
        //This video is wheelchair accessible
        Video vide32 = new Video("https://www.youtube.com/embed/bwtvvf-EzfA", hotel18);
        videoRepository.save(vide32);
        //Bathroom doors are wider than 32 inch and have grab rails
        Video vide33 = new Video("https://www.youtube.com/embed/YzHqL7ZXnjk", hotel18);
        videoRepository.save(vide33);

        //Hotel 6
        Video vide34 = new Video("https://www.youtube.com/embed/Wo-zruz4_zY",hotel17);
        videoRepository.save(vide34);
        //This hotel has a 24 hour reception
        Video vide35 = new Video("https://www.youtube.com/embed/UBn9Kw6zjSw",hotel17);
        videoRepository.save(vide35);
        //This hotel has visual fire alarms
        Video vide36 = new Video("https://www.youtube.com/embed/s0NFHo2RyMg", hotel17);
        videoRepository.save(vide36);
        //This video is wheelchair accessible
        Video vide37 = new Video("https://www.youtube.com/embed/bwtvvf-EzfA",hotel17);
        videoRepository.save(vide37);
        //Bathroom doors are wider than 32 inch and have grab rails
        Video vide38 = new Video("https://www.youtube.com/embed/YzHqL7ZXnjk",hotel17);
        videoRepository.save(vide38);

    }


}
