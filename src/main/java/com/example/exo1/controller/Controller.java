package com.example.exo1.controller;

import com.example.exo1.model.Car;
import com.example.exo1.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping("/cars")
    public ArrayList<Car> getCar(){

        return service.getArrayCar();
    }

    @RequestMapping("/car/{id}")
    public Optional<Car> getCarId(@PathVariable int id){
        return service.getCar(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCarId(@PathVariable int id){
        service.deleteCar(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/car")
    public void createCarId(@RequestBody Car car){
        service.createCar(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")
    public void updateCarId(@RequestBody Car car, @PathVariable int id){
        service.updateCar(car, id);
    }
}
