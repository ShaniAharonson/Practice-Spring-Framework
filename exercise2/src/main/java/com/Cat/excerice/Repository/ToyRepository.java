package com.Cat.excerice.Repository;

import com.Cat.excerice.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyRepository extends JpaRepository<Toy,Integer> {
}
