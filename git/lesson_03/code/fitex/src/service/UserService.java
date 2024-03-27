package service;

import model.User;

import java.util.List;

public interface UserService {
    User addUser(String email, String password);
    List<User> getAllUsers();

}
