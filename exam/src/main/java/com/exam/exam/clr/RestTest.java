package com.exam.exam.clr;

import com.exam.exam.beans.Grade;
import com.exam.exam.beans.Student;
import com.exam.exam.beans.Topic;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
@Order(1)
@RequiredArgsConstructor
public class RestTest implements CommandLineRunner {
    private final RestTemplate restTemplate;


    @Override
    public void run(String... args) throws Exception {
        //add students
        try {
            Student student1 = Student.builder()
                    .id(0)
                    .name("shani")
                    .birthday(Date.valueOf(LocalDate.of(1998,1,13)))
                    .isActive(true)
                    .grade(new Grade(Topic.Project1,98))
                    .grade(new Grade(Topic.Project2,100))
                    .grade(new Grade(Topic.Project3,97))
                    .build();

//            ResponseEntity<String> studentToAdd = restTemplate.postForEntity("http://localhost:8080/api/students",student1, String.class);
//            System.out.println(studentToAdd.getStatusCode().value() == HttpStatus.CREATED.value() ? "student1 is added" : "student1 not added");
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        try {
            Student student2 = Student.builder()
                    .id(0)
                    .name("Ofir")
                    .birthday(Date.valueOf(LocalDate.of(1996,12,21)))
                    .isActive(true)
                    .grade(new Grade(Topic.Project1,90))
                    .grade(new Grade(Topic.Project2,93))
                    .grade(new Grade(Topic.Project3,96))
                    .build();

            ResponseEntity<String> studentToAdd = restTemplate.postForEntity("http://localhost:8080/api/students",student2, String.class);
            System.out.println(studentToAdd.getStatusCode().value() == HttpStatus.CREATED.value() ? "student2 is added" : "student2 not added");
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
        try {
            Student student3 = Student.builder()
                    .id(0)
                    .name("Oshra")
                    .birthday(Date.valueOf(LocalDate.of(1970,5,30)))
                    .isActive(false)
                    .grade(new Grade(Topic.Project1,90))
                    .grade(new Grade(Topic.Project2,100))
                    .grade(new Grade(Topic.Project3,80))
                    .build();

//            ResponseEntity<String> studentToAdd = restTemplate.postForEntity("http://localhost:8080/api/students",student3, String.class);
//            System.out.println(studentToAdd.getStatusCode().value() == HttpStatus.CREATED.value() ? "student3 is added" : "student3 not added");
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        // get All Students
        try {
        System.out.println("All students:");
        Student[] students = restTemplate.getForObject("http://localhost:8080/api/students",Student[].class);
            List<Student> studentList = Arrays.stream(students).toList();
            studentList.forEach(System.out::println);
    } catch (Exception err){
            System.out.println(err.getMessage());
        }

        // get single student
        try {
            System.out.println("Get single student:");
           Student getStudent = restTemplate.getForObject("http://localhost:8080/api/students/1", Student.class);
            System.out.println(getStudent);
        }catch (Exception err){
            System.out.println(err.getMessage());
        }

        //delete student
        try {
//            restTemplate.delete("http://localhost:8080/api/students/2");
//            System.out.println("student is deleted");
        }catch (Exception err){
            System.out.println(err.getMessage());
        }

        // get student by name
        try {
            System.out.println("student by name:");
            ResponseEntity<String> studentByName = restTemplate.getForEntity("http://localhost:8080/api/students/ByName?name=shani", String.class);
            System.out.println(studentByName.getBody());
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        // get avg of student
        System.out.println("Student avg:");
        ResponseEntity<String> studentAvg = restTemplate.getForEntity("http://localhost:8080/api/students/ByAvg/3", String.class);
        System.out.println(studentAvg.getBody());
    }
}
