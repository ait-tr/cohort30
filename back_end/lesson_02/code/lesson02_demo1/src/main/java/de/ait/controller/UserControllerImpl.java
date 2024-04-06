package de.ait.controller;

import de.ait.model.User;
import de.ait.service.UserService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Scanner;


public class UserControllerImpl implements UserController{
    Scanner scanner = new Scanner(System.in);
    UserService service;

    public UserControllerImpl(UserService service) {
        this.service = service;
    }

    @Override
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @Override
    public User getUserByEmail() {
        System.out.println("Введите email:");
        String email = scanner.nextLine().trim();
        return service.findUsersByEmail(email);
    }

    @Override
    public void inputUser() {
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine().trim();

        System.out.println("Введите email:");
        String email = scanner.nextLine().trim();

        User user  = new User(name, email);
        service.saveUser(user);
    }
}
