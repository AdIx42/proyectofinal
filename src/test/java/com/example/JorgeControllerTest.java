package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class JorgeControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testJorgeEndpoint() {
        HttpRequest<String> request = HttpRequest.GET("/hello/jorge");
        HttpResponse<String> response = client.toBlocking().exchange(request, String.class);
        //este json siempre se debe obtener para asegurar que la prueba de integracion fue existosa
        assertEquals("hola Jorge", response.body());
    }
}