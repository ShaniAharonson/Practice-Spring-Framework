package com.example.restTemplate.clr;

import com.example.restTemplate.service.PlayListService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(1)
@RequiredArgsConstructor
public class playList implements CommandLineRunner {
    private final PlayListService playListService;

    @Override
    public void run(String... args) throws Exception {
        //create play list :)
        playListService.createPlayList("uri trashy songs");
        playListService.addSong(playListService.getIdByPlayListName("uri trashy songs"),"TWlKSUhzbRQ");
        playListService.createPlayList("songs for the soul");
        playListService.addSong(playListService.getIdByPlayListName("songs for the soul"),"Xt7roadoup8");

         playListService.removeSong(playListService.getIdByPlayListName("songs for the soul"),"Xt7roadoup8");

    }
}
