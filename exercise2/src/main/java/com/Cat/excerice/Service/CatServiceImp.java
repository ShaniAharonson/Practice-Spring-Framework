package com.Cat.excerice.Service;

import com.Cat.excerice.Repository.CatRepository;
import com.Cat.excerice.beans.Cat;
import com.Cat.excerice.exceptions.CatSystemException;
import com.Cat.excerice.exceptions.ErrMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImp implements CatService {
    @Autowired
    CatRepository catRepository;

    @Override
    public void addCat(Cat cat) throws CatSystemException {
        if (catRepository.existsById(cat.getId())) {
            throw new CatSystemException(ErrMsg.ID_ALREADY_EXISTS);
        }
        catRepository.save(cat);
    }

    @Override
    public void updateCat(int id, Cat cat) throws CatSystemException {
        if (!catRepository.existsById(id)) {
            throw new CatSystemException(ErrMsg.ID_NOT_FOUND);
        }
        catRepository.saveAndFlush(cat);

    }

    @Override
    public void deleteCat(int catId) throws CatSystemException {
        if (!catRepository.existsById(catId)) {
            throw new CatSystemException(ErrMsg.ID_NOT_FOUND);
        }
        catRepository.deleteById(catId);

    }

    @Override
    public Cat getSingleCat(int catId) throws CatSystemException {
        if (!catRepository.existsById(catId)) {
            throw new CatSystemException(ErrMsg.ID_NOT_FOUND);
        }
        return catRepository.findById(catId).get();

    }

    @Override
    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    @Override
    public List<Cat> findByNameAndWeight(String name, Float weight) throws CatSystemException {
        if (!catRepository.existsCatByWeight(weight) || !catRepository.existsCatByName(name)) {
            throw new CatSystemException(ErrMsg.CAT_NOT_FOUND);
        }
        return catRepository.findByNameAndWeight(name, weight);
    }

    @Override
    public List<Cat> findByNameOrWeight(String name, Float weight) throws CatSystemException {
        if (!catRepository.existsCatByWeight(weight) && !catRepository.existsCatByName(name)) {
            throw new CatSystemException(ErrMsg.CAT_NOT_FOUND);
        }
        return catRepository.findByNameOrWeight(name, weight);
    }

    @Override
    public List<Cat> findAllByOrderByAsc() {
        return catRepository.findAllByOrderByWeightAsc();
    }

    @Override
    public List<Cat> findAllByOrderByDesc() {
        return catRepository.findAllByOrderByWeightDesc();
    }

    @Override
    public List<Cat> findByNameStartingWith(String name) throws CatSystemException{
        if (name==null){
            throw new CatSystemException(ErrMsg.CAT_NOT_FOUND);
        }
        return catRepository.findByNameStartingWith(name);
    }
}
