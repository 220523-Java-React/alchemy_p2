package com.gamep2.game.controller;

import com.gamep2.game.repository.GameRepository;
import com.gamep2.game.repository.PlayerRepository;
import com.gamep2.game.service.PlayerService;
import com.gamep2.game.model.Game;
import com.gamep2.game.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/players")

public class PlayerController{

    private final PlayerService playerService;

    /*@Autowired
    GameRepository gameRepository;

    @Autowired
    PlayerRepository playerRepository;
    */

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping // Get all players
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    /*@PutMapping ("/{playerId}/games/{gameId}")
    Player relateGameToPlayer(
            @PathVariable Integer playerId,
            @PathVariable Integer gameId
        ) {
        Player player = playerRepository.getReferenceById(playerId);
        Game game = gameRepository.getReferenceById(gameId);
        player.playedGame(game);
        return playerRepository.save(player);
        }
     */

}
