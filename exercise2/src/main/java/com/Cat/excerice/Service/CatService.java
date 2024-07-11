package com.Cat.excerice.Service;

import com.Cat.excerice.beans.Cat;
import com.Cat.excerice.exceptions.CatSystemException;

import java.util.List;

public interface CatService {
    void addCat(Cat cat) throws CatSystemException;
    void updateCat(int id, Cat cat) throws CatSystemException;
    void deleteCat(int catId) throws CatSystemException;
    Cat getSingleCat(int catId) throws CatSystemException;
    List<Cat> getAllCats();
    List<Cat> findByNameAndWeight(String name,Float weight)throws CatSystemException;
    List<Cat> findByNameOrWeight(String name,Float weight)throws CatSystemException;
    List<Cat> findAllByOrderByAsc();
    List<Cat> findAllByOrderByDesc();
    List<Cat> findByNameStartingWith(String name) throws CatSystemException;

}
