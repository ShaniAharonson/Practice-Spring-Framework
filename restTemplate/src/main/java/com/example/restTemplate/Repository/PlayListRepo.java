package com.example.restTemplate.Repository;

import com.example.restTemplate.beans.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListRepo extends JpaRepository<PlayList, Integer> {
    public boolean existsByPlayListName(String playListName);
    public PlayList findByPlayListName(String playListName);
    //public boolean existById(boolean id);
}