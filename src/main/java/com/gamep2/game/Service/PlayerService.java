package com.gamep2.game.Service;


import com.gamep2.game.Repository.PlayerRepository;
import com.gamep2.game.exception.UserNotFoundException;
import com.gamep2.game.model.Player;
import com.gamep2.game.model.User;
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

//    public Player getPlayerById(int id){
//        return playerRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
//    }
//    public Player getPlayersByUserName(String userName){
//        return playerRepository.findByUsername(userName).orElseThrow(() -> new UserNotFoundException());
//    }

    //Delete
}
