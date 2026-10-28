package com.example.hello.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTests {

    private final HelloController controller = new HelloController();

    @Test
    void defaultsToHelloWorld() {
        assertEquals("Hello, World!", controller.getGreeting("World").message());
    }

    @Test
    void greetsByName() {
        assertEquals("Hello, Ashish!", controller.getGreetingByPath("Ashish").message());
    }

    @Test
    void idIncrements() {
        long first = controller.getGreeting("A").id();
        long second = controller.getGreeting("B").id();
        assertEquals(first + 1, second);
    }
}
