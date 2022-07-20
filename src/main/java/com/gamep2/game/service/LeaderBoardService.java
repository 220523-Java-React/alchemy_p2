package com.gamep2.game.service;

import com.gamep2.game.repository.LeaderBoardRepository;
import com.gamep2.game.model.LeaderBoard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderBoardService {

    private final LeaderBoardRepository leaderBoardRepository;

    public LeaderBoardService(LeaderBoardRepository leaderBoardRepository) {
        this.leaderBoardRepository = leaderBoardRepository;
    }


    //Create
    public LeaderBoard createLeaderBoard(LeaderBoard leaderBoard){
        return leaderBoardRepository.save(leaderBoard);
    }

    //Update


    //Read
    public List<LeaderBoard> getAllLeaderboards(){
        return leaderBoardRepository.findAll();
    }

   /* public LeaderBoard getLeaderBoardById(Integer leaderBoardId){
        return learderBoardRepository.findById(leaderBoardId).orElseThrow(() -> new ResourceNotFound(LeaderBoard.class, "");
    }*/

    //Delete
}
