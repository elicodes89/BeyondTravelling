package com.codeClan.example.BeyondTravelling.repositories;

import com.codeClan.example.BeyondTravelling.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    List<Country> findAllByName(String name);
}
