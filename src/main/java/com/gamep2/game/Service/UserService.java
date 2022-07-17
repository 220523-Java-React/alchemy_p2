package com.gamep2.game.Service;


import com.gamep2.game.Repository.UserRepository;
import com.gamep2.game.exception.UserNotFoundException;
import com.gamep2.game.model.User;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }



    //Create
    public User createUser(User user){
        return userRepository.save(user);
    }

    //Update


    //Read
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Integer id){
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
    }

    //Delete
}
