package de.ait.controller;

import de.ait.model.User;

import java.util.List;

public interface UserController {
    List<User> getAllUsers();
    User getUserByEmail();
    void inputUser();
}
