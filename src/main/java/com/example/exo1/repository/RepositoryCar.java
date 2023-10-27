package com.example.exo1.repository;

import com.example.exo1.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCar extends JpaRepository<Car, Integer> {

}
