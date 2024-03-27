package service.impl;

import model.User;
import repository.UserRepository;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(String email, String password) {
        // email validation
        if(email == null || email == "" || email.equals(" ")) {
            throw new IllegalArgumentException("Email cant' be empty.");
        }
        // password validation
        if(password == null || password == "" || password.equals(" ")) {
            throw new IllegalArgumentException("Email cant' be empty.");
        }
        User existedUser = userRepository.findByEmail(email);
        if(existedUser != null) {
            throw new IllegalArgumentException("User already exists.");
        }

        User user = new User(email, password);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
