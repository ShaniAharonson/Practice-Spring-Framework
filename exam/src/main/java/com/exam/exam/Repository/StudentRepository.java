package com.exam.exam.Repository;

import com.exam.exam.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByName(String name);
    @Query(value = "SELECT avg(score) FROM exam.grades join students_grades ON grades.id = students_grades.grades_id where student_id = ?;",nativeQuery = true)
    double findAvg(int id);
    Boolean existsStudentByName(String name);
}
