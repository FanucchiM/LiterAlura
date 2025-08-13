package com.alura.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDto {
    private Long id;

    private String title;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private List<AuthorDto> authors;

    private List<String> subjects;

    private List<String> languages;

    @JsonAlias("download_count")
    private Integer download_count;


    @Override
    public String toString() {
        String autor = (authors != null && !authors.isEmpty()) ? authors.get(0).getName() : "Desconocido";
        return String.format("[%d] %s - %s (Descargas: %d)", id, title, autor, download_count);
    }
}
