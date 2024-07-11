package com.example.demo.clr;

import com.example.demo.Repositories.CatRepo;
import com.example.demo.beans.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Order(4)
public class getAllCats implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
       List<Cat> catList= catRepo.findAll();
       catList.forEach(System.out::println);
    }
}
