package com.gamep2.game.service;


import com.gamep2.game.repository.PlayerRepository;
import com.gamep2.game.model.Player;
import com.gamep2.game.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    //Create
    public Player createPlayer(Player player){
        return playerRepository.save(player);
    }

    //Update


    //Read
    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerById(Integer id){
        return playerRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
    }

    //Delete
}
