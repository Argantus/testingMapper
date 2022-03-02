package com.example.testingMapper.configuration;

import com.example.testingMapper.model.Car;
import com.example.testingMapper.repo.CarRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CarConfig implements CommandLineRunner {

    private final CarRepo carRepo;


    @Override
    public void run(String... args) throws Exception {
        if (carRepo.findAll().isEmpty()){
        carRepo.save(new Car(1L, "BMW", "M4", 25000.00D, "RM001"));
        }

    }
}
