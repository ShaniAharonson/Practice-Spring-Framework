package com.cat.beckend.clr;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.Repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(5)
public class SmartDialect implements CommandLineRunner {
    @Autowired
    CatRepository catRepository;
    @Override
    public void run(String... args) throws Exception {
    //  List<Cat> catByWeight = catRepository.findAllByOrderByWeightDesc();
    //  catByWeight.forEach(System.out::println);
        List<Cat> catStartWith = catRepository.findByNameStartingWith("Ne");
        catStartWith.forEach(System.out::println);

    }
}
