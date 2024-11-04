package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/Saludar")
public class AlanController {

    @Get("/")
    public String hello() {
        return "Buenos dias Alan";
    }
}