package com.example.restTemplate.Repository;

import com.example.restTemplate.beans.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserDetails, Integer> {
    public UserDetails findByEmailAndPassword(String email, String password);
}
