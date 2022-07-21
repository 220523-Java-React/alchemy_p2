package com.gamep2.game.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="players")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Player {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer playerId;


//    @JsonIgnore
//    @ManyToMany()
//    @JoinTable(
//            name = "players_games",
//            joinColumns = @JoinColumn(name = "player_id"),
//            inverseJoinColumns = @JoinColumn(name = "game_id")
//    )
//    private Set<Game> playergames = new HashSet<>();



//    @Column(nullable = true)
//    private String firstName;
//
//    @Column(nullable = true)
//    private String lastName;

    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private int level;


//    public void playedgame(Game game) {
//        playergames.add(game);
//    }
}
