package com.alura.literalura.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorDto {
    private String name;
    private Integer birth_year;
    private Integer death_year;
}
