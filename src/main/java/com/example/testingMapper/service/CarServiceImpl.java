package com.example.testingMapper.service;

import com.example.testingMapper.dto.CarDto;
import com.example.testingMapper.mapper.CarMapper;
import com.example.testingMapper.model.Car;
import com.example.testingMapper.repo.CarRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{

    private final CarRepo carRepo;

    private final CarMapper carMapper;


    /*@Override
    public List<Car> carList() {
        return carRepo.findAll();
    }*/

    @Override
    public Car addCar(CarDto carDto) {
        return carRepo.save(carMapper.dtoToCar(carDto));

    }
    /*
    @Override
    public void deleteCarById(Long id) {
        carRepo.deleteById(id);
    }*/

    @Override
    public CarDto getCarByTarga(String targa) {
        return carMapper.carToDto(carRepo.findCarByTarga(targa));
    }
}
