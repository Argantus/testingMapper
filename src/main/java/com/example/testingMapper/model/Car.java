package com.example.testingMapper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", nullable = false)
    private Long id;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "modello", nullable = false)
    private String modello;

    @Column(name = "km", nullable = false)
    private Double km;

    @Column(name = "targa", nullable = false, unique = true)
    private String targa;
}
