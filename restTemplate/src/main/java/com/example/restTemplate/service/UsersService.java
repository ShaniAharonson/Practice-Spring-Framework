package com.example.restTemplate.service;

import com.example.restTemplate.Repository.UserRepo;
import com.example.restTemplate.beans.Credentials;
import com.example.restTemplate.beans.UserDetails;
import com.example.restTemplate.beans.UserLogin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UserRepo userRepo;

    /*
    private int id;
    private String email;
    private String password;
    private UserType userType;
    private String tel;
    private String location;
    private String genre;
     */

    public boolean registerUser(UserDetails user) throws Exception{
        if (userRepo.existsById(user.getId())){
            throw new Exception("UserExists");
        }
        userRepo.save(user);
        return true;
    }

    public UserDetails loginUser(UserLogin data) throws Exception {
        UserDetails userDetails = userRepo.findByEmailAndPassword(data.getUserEmail(),data.getUserPass());
        System.out.println("backend data");
        System.out.println(userDetails);
        //throw new Exception("Who are you?");
        return userDetails;
    }
}