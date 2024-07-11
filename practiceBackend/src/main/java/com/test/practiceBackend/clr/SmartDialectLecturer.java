package com.test.practiceBackend.clr;

import com.test.practiceBackend.Repositories.LecturerRepository;
import com.test.practiceBackend.beans.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Order(5)
public class SmartDialectLecturer implements CommandLineRunner {
    @Autowired
    LecturerRepository lecturerRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Lecturer> findByName = lecturerRepository.findByName("Haim");
        System.out.println("found:");
        findByName.forEach(System.out::println);
    }
}
