package com.alura.literalura.config;

import com.alura.literalura.dto.BookDto;
import com.alura.literalura.dto.PagedBooksDto;
import com.alura.literalura.response.GutendexResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;


@Component
public class GutendexClient {
    private static final String BASE_URL = "https://gutendex.com/books";
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public GutendexClient() {
        this.httpClient = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
        this.objectMapper = new ObjectMapper();
    }

    public List<BookDto> buscarLibros(String query) throws Exception {
        String url = BASE_URL + "?search=" + query.replace(" ", "%20");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Error llamando a la API Gutendex: " + response.statusCode());
        }

        GutendexResponse gutendexResponse = objectMapper.readValue(response.body(), GutendexResponse.class);
        return gutendexResponse.getResults();
    }
}
