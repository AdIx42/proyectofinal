package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello-luis-neumann")
public class HelloLuisNeumannController {
    public HelloLuisNeumannController() {
        super();
    }

    @Get("/")
    public String sayHelloToLuisNeumann() {
        return "Hello Luis Neumann";
    }
}
