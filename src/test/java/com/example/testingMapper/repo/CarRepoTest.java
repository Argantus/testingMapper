package com.example.testingMapper.repo;

import com.example.testingMapper.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class CarRepoTest {

    @Autowired
    private CarRepo carRepoTesting;



    @Test
    void itShouldFindCarByTarga() {

        //given
        String targa = "RM007";
        Car car = new Car(1L, "Ferrari", "SF90", 15000.00, targa);
        carRepoTesting.save(car);

        //when
        //Car carResult = carRepoTesting.findCarByTarga("RM007");
        Car foundCar = carRepoTesting.findCarByTarga(car.getTarga());

        //then
        assertThat(foundCar).isEqualTo(car);
    }

}