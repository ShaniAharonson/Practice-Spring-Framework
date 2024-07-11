package com.example.demo.Controllers;

import com.example.demo.Services.CatService;
import com.example.demo.beans.Cat;
import com.example.demo.exceptions.CatException;
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
    public List<Cat> getAllCats() {
        return catService.getAllCats();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCat(@Validated @RequestBody Cat cat) throws CatException {
        catService.addCat(cat);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCat(@Validated @PathVariable int id, @RequestBody Cat cat) throws CatException{
        catService.updateCat(id, cat);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCat(@PathVariable int id) throws CatException{
        catService.deleteCat(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cat getSingleCat(@PathVariable int id) throws CatException{
        return catService.getSingleCat(id);
    }

}
