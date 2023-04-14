package com.example.teachback.controller;

import com.example.teachback.model.CoffeeEntity;
import com.example.teachback.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeRepository coffeeRepository;

    @GetMapping
    public List<CoffeeEntity> getAllCoffee() {
        return (List<CoffeeEntity>) coffeeRepository.findAll();
    }

    @PostMapping
    public CoffeeEntity postCoffee(@RequestBody CoffeeEntity coffeeEntity) {
        return coffeeRepository.save(coffeeEntity);
    }

}
