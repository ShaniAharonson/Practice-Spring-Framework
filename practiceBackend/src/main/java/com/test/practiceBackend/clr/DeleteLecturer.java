package com.test.practiceBackend.clr;

import com.test.practiceBackend.Repositories.LecturerRepository;
import com.test.practiceBackend.beans.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

import java.util.Optional;

//@Component
@Order(3)
public class DeleteLecturer implements CommandLineRunner {
    @Autowired
    LecturerRepository lecturerRepository;

    @Override
    public void run(String... args) throws Exception {
        Optional<Lecturer> lecturerToDelete = lecturerRepository.findById(2L);
        lecturerToDelete.ifPresent(lecturer -> {
            lecturer.setStudents(null);
//            lecturerRepository.deleteById(2L);
//            System.out.println("Lecturer deleted!");
        });
    }
}
