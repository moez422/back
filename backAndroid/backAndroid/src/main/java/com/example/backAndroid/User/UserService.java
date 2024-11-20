package com.example.backAndroid.User;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> GetAllUsers() {
        return userRepository.findAll();
    }

    public User AddUser(User user) {
        return userRepository.save(user);

    }
}
