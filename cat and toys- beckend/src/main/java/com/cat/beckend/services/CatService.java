package com.cat.beckend.services;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.exception.CatSystemException;

import java.util.List;

public interface CatService {
    void addCat(Cat cat) throws CatSystemException;
    void updateCat(int catID, Cat cat) throws CatSystemException;
    void deleteCat(int catID) throws CatSystemException;
    List<Cat> getAllCats();
    Cat getSingleCatById(int catID) throws CatSystemException;
 //   List<Cat> getCatsByNameAndWeight(String name, float weight) throws CatSystemException;

}
