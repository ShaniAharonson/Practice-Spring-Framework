package com.cat.beckend.clr;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.Repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Order(4)
public class CatList implements CommandLineRunner {
    @Autowired
    private CatRepository catRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Cat> allCats = catRepository.findAll();
        allCats.forEach(System.out::println);
    }
}
