package com.test.practiceBackend.clr;

import com.test.practiceBackend.Repositories.StudentRepository;
import com.test.practiceBackend.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

//@Component
@Order(6)
public class smartDialectStudent implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        //  List<Student> findByGrades = studentRepository.findByGradeBetween(70,100);
        //  System.out.println("found: ");
        //  findByGrades.forEach(System.out::println);

        List<Student> findByDates = studentRepository.findByEndDateBetween(Date.valueOf(LocalDate.of(2021, 1, 1)),
                Date.valueOf(LocalDate.of(2023, 1, 1)));
        System.out.println("found: ");
        findByDates.forEach(System.out::println);
    }
}
