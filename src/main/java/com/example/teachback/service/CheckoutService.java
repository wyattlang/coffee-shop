package com.example.teachback.service;

import com.example.teachback.model.CoffeeEntity;
import com.example.teachback.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutService {

    private CoffeeRepository coffeeRepository;

    public Double checkout(List<UUID> coffeeIds) {
        List<CoffeeEntity> foundCoffees = (List<CoffeeEntity>) coffeeRepository.findAllById(coffeeIds);
        return foundCoffees.stream()
                .mapToDouble(coffee -> coffee.getPrice())
                .sum();
    }

}
