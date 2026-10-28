package com.example.hello.controller;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public record Greeting(long id, String message, Instant timestamp) {
    }

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam(defaultValue = "World") String name) {
        return build(name);
    }

    @GetMapping("/greeting/{name}")
    public Greeting getGreetingByPath(@PathVariable String name) {
        return build(name);
    }

    private Greeting build(String name) {
        return new Greeting(counter.incrementAndGet(), "Hello, " + name + "!", Instant.now());
    }
}
