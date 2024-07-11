package com.example.demo.clr;

import com.example.demo.Repositories.CatRepo;
import com.example.demo.beans.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

//@Component
@Order(3)
public class DeleteCat implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        Optional<Cat> catToDelete =catRepo.findById(1);
        catToDelete.ifPresent(cat -> {
            cat.setToys(null);
 //           catRepo.deleteById(1);
        });
    }
}
