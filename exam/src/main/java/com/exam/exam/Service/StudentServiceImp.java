package com.exam.exam.Service;

import com.exam.exam.Exceptions.ErrMsg;
import com.exam.exam.Exceptions.SchoolSystemException;
import com.exam.exam.Repository.StudentRepository;
import com.exam.exam.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) throws SchoolSystemException {
        int id = student.getId();
        if (studentRepository.existsById(id)){
            throw new SchoolSystemException(ErrMsg.ID_ALREADY_EXISTS);
        }
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int studentId) throws SchoolSystemException {
        if (!studentRepository.existsById(studentId)){
            throw new SchoolSystemException(ErrMsg.ID_NOT_FOUND);
        }
        studentRepository.deleteById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getSingleStudent(int studentId) throws SchoolSystemException {
        if (!studentRepository.existsById(studentId)){
            throw new SchoolSystemException(ErrMsg.ID_NOT_FOUND);
        }
        return studentRepository.findById(studentId).get();
    }

    @Override
    public List<Student> findStudentByName(String name) throws SchoolSystemException {
        if (!studentRepository.existsStudentByName(name)){
            throw new SchoolSystemException(ErrMsg.STUDENT_NOT_FOUND);
        }
        return studentRepository.findByName(name);
    }

    @Override
    public Double findStudentAvg(int studentId) throws SchoolSystemException {
        if (!studentRepository.existsById(studentId)){
            throw new SchoolSystemException(ErrMsg.ID_NOT_FOUND);
        }
        return studentRepository.findAvg(studentId);
    }
}
