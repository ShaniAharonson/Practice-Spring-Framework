package com.example.demo.clr;

import com.example.demo.beans.Cat;
import com.example.demo.beans.Toy;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Order(6)
@RequiredArgsConstructor
public class RestTest implements CommandLineRunner {
    private final RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {
        // test Get by id
        try {
            // Cat response = restTemplate.getForObject("http://localhost:8080/api/cats/2", Cat.class);
            // System.out.println(response);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        Cat catToAdd = Cat.builder()
                .id(0)
                .name("shani")
                .weight(15.0f)
                .toy(new Toy("bamba"))
                .build();
        try {
            // test add cat
         //   ResponseEntity<String> responseToPost = restTemplate.postForEntity("http://localhost:8080/api/cats", catToAdd, String.class);
         //   System.out.println(responseToPost.getStatusCode().value()== HttpStatus.CREATED.value()?"cat add!":"cat not add!");
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        // test delete cat
        try {
            restTemplate.delete("http://localhost:8080/api/cats/1");
            System.out.println("deleted!!");
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }
}
