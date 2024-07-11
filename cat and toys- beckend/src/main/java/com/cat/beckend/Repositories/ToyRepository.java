package com.cat.beckend.Repositories;

import com.cat.beckend.Beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy,Integer> {
}
