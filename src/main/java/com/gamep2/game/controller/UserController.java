package com.gamep2.game.controller;


import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

// the controller handles HTTP requests and responses via annotations. It references operations in the business logic within the service class

@RestController //indicates this is a controller class and applies @ResponseBody annotation on all operation based methods
@RequestMapping("/users") // Handles HTTP requests. names /users the endpoint to leverage HTTP requests r/t users
public class UserController {

    private final UserService userService;

    /**
     * // constructor based dependency injection ?
     * @param userService // userService object is initialized
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping //method level annotation that allows retrieval of all users persisting in the database
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping // method level annotation that allows creation of a user object in conjunction with @RequestBody (parameter level)
    public User createUser(@RequestBody User user) {       // similar to body as a class. Allows user entity to be created according to properties mentioned in user model
        return userService.createUser(user);
    }

    @GetMapping("/users/{username}") // using PathVariable (parameter-level) in combination with @GetMapping to narrow down Get retrieval by inserting username in the path
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @GetMapping("/users/{id}")  //similar to getByUserName except retrieval of user with @GetMapping is by id
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/users/{username}") // similar to get userByUserName except the operation will delete a user by inserting the user's name in the path
    public User deleteUserByUsername(@PathVariable String username) {
        return userService.deleteUserByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public User deleteUserById(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }




}
