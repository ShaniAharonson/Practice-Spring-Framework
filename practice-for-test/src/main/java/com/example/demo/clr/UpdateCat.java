package com.example.demo.clr;

import com.example.demo.Repositories.CatRepo;
import com.example.demo.beans.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

//@Component
@Order(2)
public class UpdateCat implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        Optional<Cat> catToUpdate = catRepo.findById(1);
        catToUpdate.ifPresent(System.out::println);
        catToUpdate.ifPresent(cat -> {
            cat.setName("sasson");
         //   catRepo.saveAndFlush(cat);

        });
    }
}
