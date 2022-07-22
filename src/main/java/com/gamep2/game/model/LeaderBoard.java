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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer leaderBoardId;

    @Column(unique = false, nullable = true)
    private String userName;

    @Column
    private Integer score;


}
