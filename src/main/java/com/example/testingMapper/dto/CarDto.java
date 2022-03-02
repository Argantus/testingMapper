
package com.example.testingMapper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarDto implements Serializable{


    private Long DtoId;
    private String marca;
    private String modello;
    private Double kilometri;
    private String targa;
}
