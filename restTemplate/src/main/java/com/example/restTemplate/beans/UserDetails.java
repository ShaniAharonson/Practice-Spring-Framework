package com.example.restTemplate.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private UserType userType;
    private String tel;
    private String location;
    private String genre;

    //loose coupling

    public UserDetails(int id, String email, String password, UserType userType) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public UserDetails(String email, String password, UserType userType){
        this.email=email;
        this.password=password;
        this.userType=userType;
    }
}