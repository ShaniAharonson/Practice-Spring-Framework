package com.Cat.excerice.clr;

import com.Cat.excerice.beans.Cat;
import com.Cat.excerice.beans.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Order(1)
public class RestTest implements CommandLineRunner {
    @Autowired
    RestTemplate restTemplate;


    @Override
    public void run(String... args) throws Exception {
        try {

            // add cat
            Cat toAdd = Cat.builder()
                    .id(0)
                    .name("ofir")
                    .weight(3.0f)
                    .toy(new Toy("mizi"))
                    .build();

            ResponseEntity<String> responsePost = restTemplate.postForEntity("http://localhost:8080/api/cats", toAdd, String.class);
            System.out.println(responsePost.getStatusCode().value() == HttpStatus.CREATED.value() ? "cat is added" : "cat not added");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        // getAllCatss
        System.out.println();
        System.out.println("All cats:");
        System.out.println(restTemplate.getForObject("http://localhost:8080/api/cats", String.class));

        //updateCat
        try {
            Cat cat = Cat.builder()
                    .id(0)
                    .name("yafo")
                    .toy(new Toy("lo yodaat"))
                    .weight(13.7f)
                    .build();
            cat.setName("japo");
            restTemplate.put("http://localhost:8080/api/cats/1", cat);
            System.out.println("cat is updated");
            System.out.println();
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        // get single Cat
        try {
            System.out.println("Get single Cat: ");
            ResponseEntity<String> getCat = restTemplate.getForEntity("http://localhost:8080/api/cats/1", String.class);
            System.out.println(getCat);
            System.out.println();
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        // delete cat
        try {
       //     restTemplate.delete("http://localhost:8080/api/cats/28");
       //     System.out.println("Cat is terminated");
            System.out.println();
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        // get cat by name or weight
        try {
            System.out.println("Cat by name or weight:");
            ResponseEntity<String> getCat = restTemplate.getForEntity("http://localhost:8080/api/cats/nameOrWeight?name=shani&weight=4", String.class);
            System.out.println(getCat);
            System.out.println();
        } catch (Exception err){
            err.getMessage();
        }

        // get cat by name and weight
        try {
            System.out.println("Cat by name and weight:");
            ResponseEntity<String> getCat1 = restTemplate.getForEntity("http://localhost:8080/api/cats/nameAndWeight?name=ofir&weight=3", String.class);
            System.out.println(getCat1);
            System.out.println();

        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        try {
            System.out.println("cat starts with:");
            ResponseEntity<String> catToGet = restTemplate.getForEntity("http://localhost:8080/api/cats/StartsWith?name=of", String.class);
            System.out.println(catToGet);
            System.out.println();
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        try {
            System.out.println("cats descending:");
            ResponseEntity<String > cats = restTemplate.getForEntity("http://localhost:8080/api/cats/DescOrder", String.class);
            System.out.println(cats);
            System.out.println();
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        try {
            System.out.println("cats Ascending:");
            ResponseEntity<String > cats = restTemplate.getForEntity("http://localhost:8080/api/cats/AscOrder", String.class);
            System.out.println(cats);
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }
}
