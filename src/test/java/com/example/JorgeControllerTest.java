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
        assertEquals("[{\r\n" + //
                        "    \"name\": \"Bhupesh Menon\",\r\n" + //
                        "    \"language\": \"Hindi\",\r\n" + //
                        "    \"id\": \"0CEPNRDV98KT3ORP\",\r\n" + //
                        "    \"bio\": \"Maecenas tempus neque ut porttitor malesuada. Phasellus massa ligula, hendrerit eget efficitur eget, tincidunt in ligula. Quisque mauris ligula, efficitur porttitor sodales ac, lacinia non ex. Maecenas quis nisi nunc.\",\r\n" + //
                        "    \"version\": 2.69\r\n" + //
                        "  }\r\n" + //
                        "]", response.body());
    }
}
