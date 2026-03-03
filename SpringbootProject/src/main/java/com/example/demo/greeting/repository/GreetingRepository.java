package com.example.demo.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.greeting.entity.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, String> {
    
}
