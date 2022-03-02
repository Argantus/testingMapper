package com.example.testingMapper.repo;

import com.example.testingMapper.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {

    Car findCarByTarga(String targa);
}
