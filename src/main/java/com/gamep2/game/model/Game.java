package com.gamep2.game.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="currentuser")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Game {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nowId;

    //@JsonIgnore
//    @ManyToMany(mappedBy = "playergames")
//    private Set<Player> players = new HashSet<>();

    @Column(unique = false, nullable = true)
    private String user_name;

    @Column(nullable = true)
    private String pword;

    @Column
    private int level;

    @Column(nullable = true)
    private boolean isLogged;

    // There is a relationship between games and player. There is a one to many relashionship
    // between a game and a player. A player can play many games.




}
