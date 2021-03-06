package com.gamep2.game.Controller;


import com.gamep2.game.Service.GameService;
import com.gamep2.game.model.Game;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currentuser")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }


    @GetMapping // Get all games
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameService.createGame(game);    }




}
