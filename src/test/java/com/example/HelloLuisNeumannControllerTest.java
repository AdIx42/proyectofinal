package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloLuisNeumannControllerTest {

    @Test
    void helloLuisNeumann() {
        HelloLuisNeumannController helloLuisNeumannController = new HelloLuisNeumannController();
        String greetingString = helloLuisNeumannController.sayHelloToLuisNeumann();
        assertEquals("Hello Luis Neumann!", greetingString);
    }
}