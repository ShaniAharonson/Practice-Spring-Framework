package com.example.restTemplate.Repository;

import com.example.restTemplate.beans.YoutubeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YoutubeRepo extends JpaRepository<YoutubeData,String> {

}
