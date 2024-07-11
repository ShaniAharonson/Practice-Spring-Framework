package com.cat.beckend.controllers;

import com.cat.beckend.Beans.Cat;
import com.cat.beckend.exception.CatSystemException;
import com.cat.beckend.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cats")
public class CatController {
    @Autowired
    CatService catService;

    @GetMapping
    public List<Cat> getAllCats(){
        return catService.getAllCats();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCat(@Validated @RequestBody Cat cat) throws CatSystemException{
        catService.addCat(cat);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCat(@PathVariable int id,@RequestBody Cat cat) throws CatSystemException {
        catService.updateCat(id, cat);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCat(@PathVariable int id) throws CatSystemException {
        catService.deleteCat(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cat getSingleCatById(@PathVariable int id) throws CatSystemException {
        return catService.getSingleCatById(id);

    }
}