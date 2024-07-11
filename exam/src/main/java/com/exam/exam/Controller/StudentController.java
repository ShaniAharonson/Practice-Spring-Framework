package com.exam.exam.Controller;

import com.exam.exam.Exceptions.SchoolSystemException;
import com.exam.exam.Service.StudentService;
import com.exam.exam.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController implements StudentService{
    @Autowired
    StudentService studentService;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student) throws SchoolSystemException {
        studentService.addStudent(student);

    }

    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable int id) throws SchoolSystemException {
        studentService.deleteStudent(id);


    }

    @Override
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Override
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student getSingleStudent(@PathVariable int id) throws SchoolSystemException {
        return studentService.getSingleStudent(id);
    }

    @Override
    @GetMapping("/ByName")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findStudentByName(String name) throws SchoolSystemException {
        return studentService.findStudentByName(name);
    }

    @Override
    @GetMapping("/ByAvg/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Double findStudentAvg(@PathVariable int id) throws SchoolSystemException {
        return studentService.findStudentAvg(id);
    }
}
