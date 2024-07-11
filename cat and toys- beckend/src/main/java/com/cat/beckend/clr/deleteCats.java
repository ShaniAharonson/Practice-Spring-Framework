package com.cat.beckend.clr;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.Repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

//@Component
@Order(3)
public class deleteCats implements CommandLineRunner {
    @Autowired
    CatRepository catRepository;

    @Override
    public void run(String... args) throws Exception {
        // delete cat by id
        Optional<Cat> catToDelete = catRepository.findById(3);
        catToDelete.ifPresent((cat)->{
            // remove relations but keeps the toy
            cat.setToys(null);
            catRepository.deleteById(3);
        });
    }
}
