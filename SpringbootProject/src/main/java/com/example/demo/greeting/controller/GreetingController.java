package com.example.demo.greeting.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.greeting.entity.Greeting;
import com.example.demo.greeting.service.GreetingService;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String greeting(
            @RequestParam(value = "name", defaultValue = "Greet") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/cards")
    public List<Greeting> getCards() {
        return greetingService.getCards();
    }
}
