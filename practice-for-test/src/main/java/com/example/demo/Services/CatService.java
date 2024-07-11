package com.example.demo.Services;

import com.example.demo.beans.Cat;
import com.example.demo.exceptions.CatException;

import java.util.List;

public interface CatService {
    void addCat(Cat cat) throws CatException;
    void updateCat(int catId, Cat cat) throws CatException;
    void deleteCat(int catId) throws CatException;
    List<Cat> getAllCats();
    Cat getSingleCat(int catId) throws CatException;
    List<Cat> allCatsByNameAndWeight(String name, Float weight) throws CatException;
}
