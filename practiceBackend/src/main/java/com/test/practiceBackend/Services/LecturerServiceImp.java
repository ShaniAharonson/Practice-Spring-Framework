package com.test.practiceBackend.Services;

import com.test.practiceBackend.Exceptions.LecturerErrMsg;
import com.test.practiceBackend.Exceptions.LecturerSystemException;
import com.test.practiceBackend.Repositories.LecturerRepository;
import com.test.practiceBackend.Repositories.StudentRepository;
import com.test.practiceBackend.beans.Lecturer;
import com.test.practiceBackend.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerServiceImp implements LectureService {
    @Autowired
    LecturerRepository lecturerRepository;

    @Override
    public void addLecturer(Lecturer lecturer) throws LecturerSystemException {
        long id = lecturer.getId();
        if (lecturerRepository.existsById(id)) {
            throw new LecturerSystemException(LecturerErrMsg.ID_ALREADY_EXISTS);
        }
        lecturerRepository.save(lecturer);

    }

    @Override
    public Lecturer getSingleLecturer(long lecturerId) throws LecturerSystemException {
        return lecturerRepository.findById(lecturerId).orElseThrow(
                () -> new LecturerSystemException(LecturerErrMsg.ID_NOT_FOUND));
    }

    @Override
    public List<Student> getAllStudents(long lecturerId) {
        return lecturerRepository.findStudentsById(lecturerId);
    }

    @Override
    public List<Lecturer> getAllLecturers() {
        return lecturerRepository.findAll();
    }

}
