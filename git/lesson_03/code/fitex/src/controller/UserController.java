package controller;

import model.User;
import service.impl.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class UserController {

    private final UserServiceImpl userService;
    private final Scanner scanner;

    public UserController(UserServiceImpl userService, Scanner scanner) {
        this.userService = userService;
        this.scanner = scanner;
    }

    public void addUser(){

        System.out.println("Input name: ");
        String name = scanner.nextLine();

        System.out.println("Input email: ");
        String email = scanner.nextLine();

        System.out.println("Input password: ");
        String password = scanner.nextLine();

        User user = userService.addUser(name, email, password);

    }

    public void getAllUsers(){
        List<User> users = userService.getAllUsers();
        System.out.println(users);
    }

    public void updateUser(){
        System.out.println("Input User ID: ");
        int idForUpdate = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Input password: ");
        String password = scanner.nextLine();

        userService.updateUser(idForUpdate, email, password);
    }
}
