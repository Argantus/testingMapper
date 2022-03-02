package com.example.testingMapper.service;

import com.example.testingMapper.dto.CarDto;
import com.example.testingMapper.model.Car;

import java.util.List;

public interface CarService {

    //public List<Car> carList();
    public Car addCar(CarDto carDto);
    //public void deleteCarById(Long id);
    public CarDto getCarByTarga(String targa);
}
