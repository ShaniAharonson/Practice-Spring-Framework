package com.Docker.myDoker.Controller;

import com.Docker.myDoker.beans.Car;
import com.Docker.myDoker.dervices.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car getCarById(@PathVariable String id) {
        return carService.getCarByID(id);
    }

    @GetMapping("/byCriteria/{text}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Car> getCarByCriteria(@PathVariable String text){
        return carService.getCarByCriteria(text);
    }
}
