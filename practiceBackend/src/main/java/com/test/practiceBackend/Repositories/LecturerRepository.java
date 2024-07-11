package com.test.practiceBackend.Repositories;

import com.test.practiceBackend.beans.Lecturer;
import com.test.practiceBackend.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer,Long>{
    List<Lecturer> findByName (String name);
    List<Student> findStudentsById(long id);
}
