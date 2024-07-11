package com.example.restTemplate.controller;

import com.example.restTemplate.beans.Credentials;
import com.example.restTemplate.beans.UserDetails;
import com.example.restTemplate.beans.UserLogin;
import com.example.restTemplate.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerUser(@RequestBody UserDetails data) throws Exception {
        usersService.registerUser(data);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public Credentials loginUser(@RequestBody UserLogin data) throws Exception{
        UserDetails userDetails = usersService.loginUser(data);
        //return to frontend : email,name,token,userType
        return new Credentials(userDetails.getEmail(),userDetails.getName(),userDetails.getUserType());
    }



}