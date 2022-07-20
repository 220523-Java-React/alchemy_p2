package com.gamep2.game.service;

import com.gamep2.game.repository.GameRepository;
import com.gamep2.game.model.Game;
import com.gamep2.game.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }


    //Create
    public Game createGame(Game game){
        return gameRepository.save(game);
    }

    //Update


    //Read
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    public Game getGameById(Integer id){
        return gameRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
    }

    //Delete
}
