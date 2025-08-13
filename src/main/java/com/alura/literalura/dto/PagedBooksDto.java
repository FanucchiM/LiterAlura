package com.alura.literalura.dto;

import lombok.Data;

import java.util.List;


@Data
public class PagedBooksDto {
    private int count;
    private String next;
    private String previous;
    private List<BookDto> results;
}
