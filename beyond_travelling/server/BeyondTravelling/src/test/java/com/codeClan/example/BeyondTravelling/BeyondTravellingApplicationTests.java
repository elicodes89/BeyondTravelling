package com.codeClan.example.BeyondTravelling;

import com.codeClan.example.BeyondTravelling.models.City;
import com.codeClan.example.BeyondTravelling.models.Country;
import com.codeClan.example.BeyondTravelling.models.Hotel;
import com.codeClan.example.BeyondTravelling.repositories.CityRepository;
import com.codeClan.example.BeyondTravelling.repositories.CountryRepository;
import com.codeClan.example.BeyondTravelling.repositories.HotelRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeyondTravellingApplicationTests {

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	CityRepository cityRepository;

	@Autowired
	HotelRepository hotelRepository;

	@Test
	void contextLoads() {
	}

}
