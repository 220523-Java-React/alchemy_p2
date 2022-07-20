package com.gamep2.game.RepositoryTests;


import com.gamep2.game.repository.UserRepository;
import com.gamep2.game.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUserCreate(){
        User user = new User();
        user.setUserName("TestUser");
        user.setPassword("TestPass");
        user.setFirstName("TestUser");
        user.setLastName("TestUser");

        userRepository.save(user);

     Optional<User> result = userRepository.findById(1);
     User userResult;
     userResult = result.orElse(new User());

     Assertions.assertEquals(user.getUserName(), userResult.getUserName());


    }


}
