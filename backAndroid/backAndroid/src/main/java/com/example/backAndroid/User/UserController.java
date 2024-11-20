package com.example.backAndroid.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.GetAllUsers();
    }
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.AddUser(user);
    }
}
