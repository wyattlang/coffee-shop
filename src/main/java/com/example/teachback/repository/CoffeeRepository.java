package com.example.teachback.repository;

import com.example.teachback.model.CoffeeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CoffeeRepository extends CrudRepository<CoffeeEntity, UUID> {

}
