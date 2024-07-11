package com.Cat.excerice.Repository;

import com.Cat.excerice.beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends JpaRepository<Cat,Integer> {
    List<Cat> findByNameAndWeight(String name, Float weight);
    List<Cat> findByNameOrWeight(String name,Float weight);
    List<Cat> findAllByOrderByWeightAsc();
    List<Cat> findAllByOrderByWeightDesc();
    List<Cat> findByNameStartingWith(String name);
    Boolean existsCatByName(String name);
    Boolean existsCatByWeight(Float weight);


}
