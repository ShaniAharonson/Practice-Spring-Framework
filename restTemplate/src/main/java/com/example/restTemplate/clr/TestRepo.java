package com.example.restTemplate.clr;

import com.example.restTemplate.service.PlayListService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

//@Component
//@Component
@RequiredArgsConstructor
public class TestRepo implements CommandLineRunner {
    private final PlayListService service;
    @Override
    public void run(String... args) throws Exception {
        //create play list :)
        service.createPlayList("uri trashy songs");
        service.addSong(service.getIdByPlayListName("uri trashy songs"),"TWlKSUhzbRQ");
        service.createPlayList("songs for the soul");
        service.addSong(service.getIdByPlayListName("songs for the soul"),"Xt7roadoup8");

        //service.removeSong(service.getIdByPlayListName("uri trashy songs"),"TWlKSUhzbRQ");
    }
}