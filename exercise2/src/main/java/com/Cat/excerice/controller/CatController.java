package com.Cat.excerice.controller;

import com.Cat.excerice.Service.CatService;
import com.Cat.excerice.beans.Cat;
import com.Cat.excerice.exceptions.CatSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cats")
public class CatController implements CatService {
    @Autowired
    CatService catService;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCat(@RequestBody Cat cat) throws CatSystemException {
        catService.addCat(cat);


    }

    @Override
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCat(@PathVariable int id,@RequestBody Cat cat) throws CatSystemException {
        catService.updateCat(id, cat);
    }

    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCat(@PathVariable int id) throws CatSystemException {
        catService.deleteCat(id);

    }

    @Override
    @GetMapping("/{id}")
    public Cat getSingleCat(@PathVariable int id) throws CatSystemException {
        return catService.getSingleCat(id);

    }

    @Override
    @GetMapping
    public List<Cat> getAllCats() {
        return catService.getAllCats();
    }

    @Override
    @GetMapping("/nameAndWeight")
    @ResponseStatus(HttpStatus.OK)
    public List<Cat> findByNameAndWeight(String name, Float weight) throws CatSystemException {
        return catService.findByNameAndWeight(name, weight);
    }

    @Override
    @GetMapping("/nameOrWeight")
    @ResponseStatus(HttpStatus.OK)
    public List<Cat> findByNameOrWeight(String name, Float weight) throws CatSystemException {
        return catService.findByNameOrWeight(name,weight);
    }

    @Override
    @GetMapping("/AscOrder")
    @ResponseStatus(HttpStatus.OK)
    public List<Cat> findAllByOrderByAsc() {
        return catService.findAllByOrderByAsc();
    }

    @Override
    @GetMapping("/DescOrder")
    @ResponseStatus(HttpStatus.OK)
    public List<Cat> findAllByOrderByDesc() {
        return catService.findAllByOrderByDesc();
    }

    @Override
    @GetMapping("/StartsWith")
    @ResponseStatus(HttpStatus.OK)
    public List<Cat> findByNameStartingWith(String name) throws CatSystemException {
        return catService.findByNameStartingWith(name);
    }
}
