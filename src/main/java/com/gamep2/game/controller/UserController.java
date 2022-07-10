package com.gamep2.game.controller;


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

    @GetMapping //method level annotation that allows retrieval of all users
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping // method level annotation that allows creation of a user object in conjunction with @RequestBody (parameter level)
    public User createUser(@RequestBody User user) {       // similar to body as a class. Allows user entity to be created according to properties mentioned in user model
        return userService.createUser(user);
    }

    @GetMapping("/username/{username}") // using PathVariable (parameter-level) in combination with @GetMapping to narrow down Get retrieval by username
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }


}
