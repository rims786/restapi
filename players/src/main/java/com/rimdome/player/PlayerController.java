package com.rimdome.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @GetMapping("/player")
    public List<String> getPlayer() throws InterruptedException {
        System.out.println("Player Controller");
        Thread.sleep(10000);
        return List.of("Player1", "Player2", "Player3");
    }
}
