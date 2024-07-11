package com.exam.exam.Service;

import com.exam.exam.Exceptions.SchoolSystemException;
import com.exam.exam.beans.Student;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentService {
    void addStudent(Student student) throws SchoolSystemException;
    void deleteStudent(int studentId)throws SchoolSystemException;
    List<Student> getAllStudents();
    Student getSingleStudent(int studentId)throws SchoolSystemException;
    List<Student> findStudentByName(String name) throws SchoolSystemException;
    Double findStudentAvg(int studentId)throws SchoolSystemException;


}
