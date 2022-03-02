package com.example.testingMapper.mapper;

import com.example.testingMapper.dto.CarDto;
import com.example.testingMapper.model.Car;
import org.mapstruct.BeanMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface CarMapper {

    public CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "car.marca", target = "marca")
    @Mapping(source = "car.modello", target = "modello")
    @Mapping(source = "car.targa", target = "targa")
    public CarDto carToDto (Car car);


    @InheritInverseConfiguration
    @Mapping(source = "carDto.kilometri", target = "km")
    public Car dtoToCar(CarDto carDto);


}
