package com.example.testingMapper.controller;

import com.example.testingMapper.dto.CarDto;
import com.example.testingMapper.mapper.CarMapper;
import com.example.testingMapper.model.Car;
import com.example.testingMapper.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;


    @GetMapping("/car/{targa}")
    CarDto findCarByTarga (@PathVariable("targa") String targa) {
        return carService.getCarByTarga(targa);
    }

    @PostMapping("/add-car")
    Car saveCar (@RequestBody CarDto carDto) {
        return carService.addCar(carDto);
    }

}
