package com.gamep2.game.Repository;

import com.gamep2.game.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
//    Boolean existsByUsername(String userName);
//
//    Optional<Player> findByUsername(String userName);

}
