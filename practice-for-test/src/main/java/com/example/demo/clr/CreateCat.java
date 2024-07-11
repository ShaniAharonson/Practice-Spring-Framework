package com.example.demo.clr;

import com.example.demo.Repositories.CatRepo;
import com.example.demo.beans.Cat;
import com.example.demo.beans.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Order(1)
public class CreateCat implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;


    @Override
    public void run(String... args) throws Exception {
        Cat c1 = Cat.builder()
                .name("Nessi")
                .weight(10.0f)
                .toy(new Toy("bird"))
                .toy(new Toy("Legs"))
                .build();

        Cat c2 = Cat.builder()
                .name("Cleo")
                .weight(7.0f)
                .toy(new Toy("mouse"))
                .build();

        Cat c3 = Cat.builder()
                .name("David")
                .weight(13.0f)
                .toy(new Toy("Gormet"))
                .build();

 //       catRepo.saveAll(Arrays.asList(c1,c2,c3));
    }
}
