package com.test.practiceBackend.Services;

import com.test.practiceBackend.Exceptions.StudentSystemException;
import com.test.practiceBackend.beans.Student;

import java.sql.Date;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    List<Student> getAllGrades(long id)throws StudentSystemException;
    List<Student> getGradeByDate(Date endDate) throws StudentSystemException;
    List<Student> getAllGradesBetweenDates(Date date1,Date date2)throws StudentSystemException;
}
