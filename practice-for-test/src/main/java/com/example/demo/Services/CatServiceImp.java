package com.example.demo.Services;

import com.example.demo.Repositories.CatRepo;
import com.example.demo.beans.Cat;
import com.example.demo.exceptions.CatException;
import com.example.demo.exceptions.ErrMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImp implements CatService {
    @Autowired
    CatRepo catRepo;

    @Override
    public void addCat(Cat cat) throws CatException {
        int id = cat.getId();
        if (catRepo.existsById(id)) {
            throw new CatException(ErrMsg.ID_ALREADY_EXISTS);
        }
        catRepo.save(cat);
    }

    @Override
    public void updateCat(int catId, Cat cat) throws CatException {
        if (!catRepo.existsById(catId)) {
            throw new CatException(ErrMsg.ID_NOT_FOUND);
        }
        catRepo.saveAndFlush(cat);
    }

    @Override
    public void deleteCat(int catId) throws CatException {
        if (!catRepo.existsById(catId)){
            throw new CatException(ErrMsg.ID_NOT_FOUND);
        }
        catRepo.deleteById(catId);
    }

    @Override
    public List<Cat> getAllCats() {
        return catRepo.findAll();
    }

    @Override
    public Cat getSingleCat(int catId) throws CatException {
        return catRepo.findById(catId).orElseThrow(()->new CatException(ErrMsg.ID_NOT_FOUND));
    }

    @Override
    public List<Cat> allCatsByNameAndWeight(String name, Float weight) throws CatException {
        if (allCatsByNameAndWeight(name,weight)==null){
            throw new CatException(ErrMsg.WEIGHT_MAST_BE_MORE_THAN_0);
        }
        return catRepo.findByNameAndWeight(name,weight);
    }
}
