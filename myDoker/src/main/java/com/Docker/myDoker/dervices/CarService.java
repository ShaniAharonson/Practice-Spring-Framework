package com.Docker.myDoker.dervices;

import com.Docker.myDoker.beans.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    public Car getCarByID(String id){
        return new Car("Car: "+id);
    }

    public List<Car> getCarByCriteria(String searchText){
        return List.of(
                new Car("kia picanto"),
                new Car("Mitsubishi star space"),
                new Car(searchText)
        );
    }
}
