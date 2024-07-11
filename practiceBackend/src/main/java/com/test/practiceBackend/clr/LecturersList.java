package com.test.practiceBackend.clr;

import com.test.practiceBackend.Repositories.LecturerRepository;
import com.test.practiceBackend.beans.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

import java.util.List;

//@Component
@Order(4)
public class LecturersList implements CommandLineRunner {
    @Autowired
    LecturerRepository lecturerRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Lecturer> lecturerList = lecturerRepository.findAll();
//        System.out.println("Lecturers list:");
//        lecturerList.forEach(System.out::println);

    }
}
