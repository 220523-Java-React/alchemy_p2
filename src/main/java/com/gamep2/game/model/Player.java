package com.gamep2.game.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

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

    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = true)
    private String email;


    /*@JsonIgnore
    @ManyToMany()
    @JoinTable(
            name = "players_games",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id")
    )
    private Set<Game> playerGames = new HashSet<>();
    */

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = true)
    private Integer currentLevel;

    @Column(nullable = true)
    private String bestGame;

    @Column
    private Integer tokens;

    /*public void playedGame(Game game) {
        playerGames.add(game);
    }
    */
}
