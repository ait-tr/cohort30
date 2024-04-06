package de.ait.service;

import de.ait.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void saveUser(List<User> list);
    void saveUser(User user);
    User findUsersByEmail(String email);

}
