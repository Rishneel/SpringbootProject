package com.example.demo.greeting.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.greeting.entity.Greeting;
import com.example.demo.greeting.repository.GreetingRepository;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public List<Greeting> getCards() {
        return greetingRepository.findAll();
    }
}
