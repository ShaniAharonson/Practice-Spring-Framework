package com.example.demo.Repositories;

import com.example.demo.beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepo extends JpaRepository<Cat, Integer> {
    List<Cat> findByNameAndWeight(String name, float weight);

    List<Cat> findByNameOrWeight(String name, float weight);

    List<Cat> findAllByOrderByWeightAsc();

    List<Cat> findAllByOrderByWeightDesc();

    List<Cat> findByNameStartsWith(String name);

}
