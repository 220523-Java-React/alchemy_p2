package com.gamep2.game.Repository;

import com.gamep2.game.model.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Integer> {
}
