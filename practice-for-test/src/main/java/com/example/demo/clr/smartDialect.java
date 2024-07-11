package com.example.demo.clr;

import com.example.demo.Repositories.CatRepo;
import com.example.demo.beans.Cat;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(5)
public class smartDialect implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        List<Cat> catsByWeight = catRepo.findByNameAndWeight("Nessi",10.0f);
      //  System.out.println(catsByWeight);

    }
}
