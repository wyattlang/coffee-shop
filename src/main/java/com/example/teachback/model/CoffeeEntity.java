package com.example.teachback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.UUID;

@Entity
@Value
@NoArgsConstructor(force = true)
public class CoffeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    Double price;

}
