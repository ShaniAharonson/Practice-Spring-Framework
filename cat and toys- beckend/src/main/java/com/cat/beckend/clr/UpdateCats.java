package com.cat.beckend.clr;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.Repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

//@Component
@Order(2)
public class UpdateCats implements CommandLineRunner {
    @Autowired
    CatRepository catRepository;
    @Override
    public void run(String... args) throws Exception {
        // update cat
        // first, lets get cat by id:
        Optional<Cat> updateCat = catRepository.findById(3);
        // print cat
        updateCat.ifPresent(System.out::println);
        // updating the cat
        updateCat.ifPresent(cat -> {
            // set name
            cat.setName("David the Ars");
            // save cat and flush it now
          //  catRepository.saveAndFlush(cat);
        });
    }
}
