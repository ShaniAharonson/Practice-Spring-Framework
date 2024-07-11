package com.test.practiceBackend.Controllers;

import com.test.practiceBackend.Exceptions.LecturerSystemException;
import com.test.practiceBackend.Services.LectureService;
import com.test.practiceBackend.beans.Lecturer;
import com.test.practiceBackend.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/lectures")

public class LecturerController {
    @Autowired
    LectureService lectureService;

    // get all lectures
    @GetMapping
    public List<Lecturer> getAllLectures() {
        return lectureService.getAllLecturers();
    }

    // add lecture
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addLecturer(@RequestBody Lecturer lecturer) throws LecturerSystemException {
        lectureService.addLecturer(lecturer);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateLecturer(@PathVariable long id, @RequestBody Lecturer lecturer) throws LecturerSystemException{

    }
    //get Single lecture

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Lecturer getSingleLectureById(@PathVariable long id) throws LecturerSystemException{
        return lectureService.getSingleLecturer(id);
    }



}
