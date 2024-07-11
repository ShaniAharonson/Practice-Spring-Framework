package com.test.practiceBackend.Repositories;

import com.test.practiceBackend.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByGradeBetween(int grade1, int grade2);

    List<Student> findByEndDate(Date Enddate);

    List<Student> findByEndDateBetween(Date EndDate1, Date EndDate2);
    List<Student> findGradeByEndDateBetween(Date EndDate1, Date EndDate2);
    List<Student> findGradeById (long id);
}
