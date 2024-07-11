package com.cat.beckend.clr;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.Beans.Toy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class RestTest implements CommandLineRunner {

    private final RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {
        // getSingleCat
        try {
        //    Cat response = restTemplate.getForObject("http://localhost:8080/api/cats/1", Cat.class);
        //    System.out.println(response);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        try {
         //   ResponseEntity<String> response2 = restTemplate.getForEntity("http://localhost:8080/api/cats/1", String.class);
         //   System.out.println(response2);
         // System.out.println(response2.getStatusCodeValue()== HttpStatus.OK.value()?"sababa":"not sababa");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        // addCat
        Cat toAdd = Cat.builder()
                .id(0)
                .name("David")
                .weight(30.0f)
                .toy(new Toy("Snake"))
                .build();

        try {
         //   ResponseEntity<String> responsePost = restTemplate.postForEntity("http://localhost:8080/api/cats",toAdd, String.class);
            //System.out.println(responsePost.getStatusCode().value()==HttpStatus.CREATED.value()?"sababa":"not sababa");
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        try {
            restTemplate.delete("http://localhost:8080/api/cats/5");
         //   System.out.println("david cat was terminated");
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        try {
            Cat[] cats = restTemplate.getForObject("http://localhost:8080/api/cats",Cat[].class);
            List<Cat> catList = Arrays.stream(cats).toList();
            catList.forEach(System.out::println);
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }
}
