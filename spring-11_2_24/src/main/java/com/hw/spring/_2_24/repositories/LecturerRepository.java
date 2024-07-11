package com.hw.spring._2_24.repositories;

import com.hw.spring._2_24.beans.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository extends JpaRepository<Lecturer,Integer> {

}
