package com.example.exo1.service;

import com.example.exo1.model.Car;
import com.example.exo1.repository.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private RepositoryCar repository;


    public ArrayList<Car> getArrayCar (){
        ArrayList<Car> arrayDress = new ArrayList<>();
        repository.findAll().forEach(car -> {
            arrayDress.add(car);
        });
        return arrayDress;
    };

    public Optional<Car> getCar(int id){
        return repository.findById(id);
    }

    public void deleteCar(int id){
        repository.deleteById(id);
    }

    public void createDress(Car car){
        repository.save(car);
    }

    public void updateDress(Car car, int id){
        repository.save(car);
    }

}
