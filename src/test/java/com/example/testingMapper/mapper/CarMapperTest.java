package com.example.testingMapper.mapper;

import com.example.testingMapper.dto.CarDto;
import com.example.testingMapper.model.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarMapperTest {

    @Test
    void itShouldCarToDto() {

        //given
        Car car = new Car(1L, "Ferrari", "SF90", 15000.00, "RM007");

        //when
        CarDto carDto = CarMapper.INSTANCE.carToDto( car );

        //then
        assertThat( carDto ).isNotNull();
        assertThat( carDto.getMarca() ).isEqualTo( "Ferrari" );
        assertThat( carDto.getModello() ).isEqualTo( "SF90" );
        assertThat( carDto.getTarga() ).isEqualTo( "RM007" );

    }

    @Test
    void itShouldDtoToCar() {

        //given
        CarDto carDto = new CarDto();

        carDto.setMarca("Lamborghini");
        carDto.setModello("Huracan");
        carDto.setTarga("RM003");

        //when
        Car car = CarMapper.INSTANCE.dtoToCar(carDto);

        //then
        assertThat( car ).isNotNull();
        assertThat( car.getMarca() ).isEqualTo("Lamborghini");
        assertThat( car.getModello() ).isEqualTo("Huracan");
        assertThat( car.getTarga() ).isEqualTo("RM003");

    }
}