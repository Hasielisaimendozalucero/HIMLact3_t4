package com.lucero.demoCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucero.demoCrud.models.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
