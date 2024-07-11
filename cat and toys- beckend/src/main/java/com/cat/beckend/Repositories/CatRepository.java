package com.cat.beckend.Repositories;

import com.cat.beckend.Beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat,Integer> {
    List<Cat> findByNameAndWeight(String name, float weight);
    List<Cat> findByNameOrWeight(String name, float weight);
    List<Cat>  findAllByOrderByWeightAsc();
    List<Cat>  findAllByOrderByWeightDesc();
    List<Cat> findByNameStartingWith(String name);
}
