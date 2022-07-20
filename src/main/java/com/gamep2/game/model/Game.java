package com.gamep2.game.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="games")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer gameId;

    /*@JsonIgnore
    @ManyToMany(mappedBy = "playerGames")
    private Set<Player> players = new HashSet<>();
    */

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = true)
    private String description;

    // There is a relationship between games and player. There is a one to many relashionship
    // between a game and a player. A player can play many games.




}
