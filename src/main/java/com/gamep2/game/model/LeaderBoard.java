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

    @Column(unique = false, nullable = false)
    private String title;

    private Integer score;


}
