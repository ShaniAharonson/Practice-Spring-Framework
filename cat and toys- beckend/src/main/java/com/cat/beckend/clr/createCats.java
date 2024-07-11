package com.cat.beckend.clr;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.Beans.Toy;
import com.cat.beckend.Repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

//@Component
@Order(1)
public class createCats implements CommandLineRunner {
    @Autowired
    private CatRepository catRepository;
    @Override
    public void run(String... args) throws Exception {
        // add cat
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

    //    catRepository.saveAll(Arrays.asList(c1,c2,c3));




    }
}
