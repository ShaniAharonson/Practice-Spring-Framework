package com.test.practiceBackend.clr;

import com.test.practiceBackend.Repositories.LecturerRepository;
import com.test.practiceBackend.beans.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

import java.util.Optional;

//@Component
@Order(2)
public class UpdateLecturer implements CommandLineRunner {
    @Autowired
    LecturerRepository lecturerRepository;

    @Override
    public void run(String... args) throws Exception {
        Optional<Lecturer> lecturerToUpdate = lecturerRepository.findById(1L);
        lecturerToUpdate.ifPresent(System.out::println);
        lecturerToUpdate.ifPresent(lecturer -> {
            lecturer.setSalary(11000.0);
 //           lecturerRepository.saveAndFlush(lecturer);
        });
    }
}
