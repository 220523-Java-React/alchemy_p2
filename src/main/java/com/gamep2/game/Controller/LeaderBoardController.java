package com.gamep2.game.Controller;


import com.gamep2.game.Service.LeaderBoardService;
import com.gamep2.game.model.LeaderBoard;
import com.gamep2.game.model.Player;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leaderboards")
public class LeaderBoardController {
    private final LeaderBoardService leaderBoardService;

    public LeaderBoardController(LeaderBoardService leaderBoardService) {
        this.leaderBoardService = leaderBoardService;
    }


    @GetMapping // Get all leaderboards
    public List<LeaderBoard> getAllLeaderBoards(){
        return leaderBoardService.getAllLeaderboards();
    }

    @PostMapping
    public LeaderBoard createLeaderBoard(@RequestBody LeaderBoard leaderBoard) {
        return leaderBoardService.createLeaderBoard(leaderBoard);
    }

}
