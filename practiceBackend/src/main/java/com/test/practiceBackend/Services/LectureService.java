package com.test.practiceBackend.Services;

import com.test.practiceBackend.Exceptions.LecturerSystemException;
import com.test.practiceBackend.beans.Lecturer;
import com.test.practiceBackend.beans.Student;

import java.util.List;

public interface LectureService {
    void addLecturer(Lecturer lecturer) throws LecturerSystemException;
    Lecturer getSingleLecturer(long lecturerId) throws LecturerSystemException;
    List<Student> getAllStudents(long lecturerId);
    List<Lecturer> getAllLecturers();


}
