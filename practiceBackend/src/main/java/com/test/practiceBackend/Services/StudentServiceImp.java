package com.test.practiceBackend.Services;

import com.test.practiceBackend.Exceptions.StudentErrMsg;
import com.test.practiceBackend.Exceptions.StudentSystemException;
import com.test.practiceBackend.Repositories.StudentRepository;
import com.test.practiceBackend.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getAllGrades(long id) throws StudentSystemException {
        if (!studentRepository.existsById(id)){
            throw new StudentSystemException(StudentErrMsg.ID_NOT_FOUND);
        }
        return studentRepository.findGradeById(id);
    }

    @Override
    public List<Student> getGradeByDate(Date endDate) throws StudentSystemException {
        return studentRepository.findByEndDate(endDate);
    }

    @Override
    public List<Student> getAllGradesBetweenDates(Date date1, Date date2) throws StudentSystemException {
        return studentRepository.findGradeByEndDateBetween(date1,date2);
    }
}
