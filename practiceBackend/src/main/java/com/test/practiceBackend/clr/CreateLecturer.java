package com.test.practiceBackend.clr;

import com.test.practiceBackend.Repositories.LecturerRepository;
import com.test.practiceBackend.beans.Lecturer;
import com.test.practiceBackend.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

import java.sql.Date;
import java.time.LocalDate;

//@Component
@Order(1)
public class CreateLecturer implements CommandLineRunner {
    @Autowired
    LecturerRepository lecturerRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student(80, Date.valueOf(LocalDate.of(2022,8,8)));
        Student student2 = new Student(90, Date.valueOf(LocalDate.of(2023,10,8)));
        Student student3 = new Student(95, Date.valueOf(LocalDate.of(2022,9,1)));
        Student student4 = new Student(60, Date.valueOf(LocalDate.of(2021,5,16)));
        Student student5 = new Student(75, Date.valueOf(LocalDate.of(2022,4,15)));
        Student student6 = new Student(100, Date.valueOf(LocalDate.of(2023,6,20)));

        Lecturer lecturer1= Lecturer.builder()
                .name("Haim")
                .salary(10000.0)
                .student(student1)
                .student(student2)
                .student(student3)
                .build();

        Lecturer lecturer2 = Lecturer.builder()
                .name("Rivka")
                .salary(15000.0)
                .student(student4)
                .student(student5)
                .student(student6)
                .build();

  //      lecturerRepository.saveAll(Arrays.asList(lecturer1,lecturer2));
    }
}
