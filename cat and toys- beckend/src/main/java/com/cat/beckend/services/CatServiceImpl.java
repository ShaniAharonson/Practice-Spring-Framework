package com.cat.beckend.services;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.Repositories.CatRepository;
import com.cat.beckend.exception.CatSystemException;
import com.cat.beckend.exception.ErrMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {
    @Autowired
    CatRepository catRepository;

    @Override
    public void addCat(Cat cat) throws CatSystemException {
        int id = cat.getId();
        if (catRepository.existsById(id)) {
            throw new CatSystemException(ErrMsg.ID_ALREADY_EXISTS);
        }
        catRepository.save(cat);
    }

    @Override
    public void updateCat(int catID, Cat cat) throws CatSystemException {
        if (!catRepository.existsById(cat.getId())) {
            throw new CatSystemException(ErrMsg.ID_NOT_FOUND);
        }
        catRepository.saveAndFlush(cat);
    }

    @Override
    public void deleteCat(int catID) throws CatSystemException {
        if (!catRepository.existsById(catID)) {
            throw new CatSystemException(ErrMsg.ID_NOT_FOUND);
        }
        catRepository.deleteById(catID);
    }

    @Override
    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    @Override
    public Cat getSingleCatById(int catID) throws CatSystemException {
        return catRepository.findById(catID).orElseThrow(()->new CatSystemException(ErrMsg.ID_NOT_FOUND));
    }


}
