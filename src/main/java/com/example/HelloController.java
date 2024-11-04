package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get("/")
    public String hello() {
        return "Hello, Worldx!";
    }
    
    @Get("/Ixe")
    public String helloIxe() {
        return "Hola, soy Ixe";
    }
}