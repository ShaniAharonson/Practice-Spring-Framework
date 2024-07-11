package com.example.demo.Repositories;

import com.example.demo.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepo extends JpaRepository<Toy, Integer> {
}
