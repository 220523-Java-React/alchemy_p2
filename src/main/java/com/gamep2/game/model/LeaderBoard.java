package com.gamep2.game.model;


import lombok.*;

import javax.persistence.*;

@Entity(name="leaderboards")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class LeaderBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer leaderBoardId;

    @Column(unique = true, nullable = true)
    private String title;

    @Column(nullable = true)
    private Integer rank;

    @Column(nullable = true)
    private Integer userName;

    @Column(nullable = true)
    private Integer score;

    @Column(nullable = true)
    private Integer Level;


}
