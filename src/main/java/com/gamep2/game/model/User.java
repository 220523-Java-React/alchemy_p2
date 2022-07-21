package com.gamep2.game.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity(name="users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

//    @Column(nullable = false)
//    private String firstName;

//    @Column(nullable = false)
//    private String lastName;

    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;


}
