package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/choco")
public class ChocoController {

    @Get("/")
    public String hello() {
        return "Chocolate";
    }
}