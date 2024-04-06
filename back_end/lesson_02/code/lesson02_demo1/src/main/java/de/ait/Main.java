package de.ait;

import de.ait.controller.UserController;
import de.ait.controller.UserControllerImpl;
import de.ait.model.User;
import de.ait.repository.CrudRepository;
import de.ait.repository.FileUserRepositoryImpl;
import de.ait.repository.ListUserRepository;
import de.ait.service.UserService;
import de.ait.service.UserServiceImp;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        File FILE_NAME = new File("users.txt");
        //System.out.println("работаем с файлом");
        //CrudRepository<User> repository = new FileUserRepositoryImpl(FILE_NAME);

        System.out.println("работаем с листом");
        CrudRepository<User> repository = new ListUserRepository();

        UserService service = new UserServiceImp(repository);
        UserController controller = new UserControllerImpl(service);



        Scanner scanner = new Scanner(System.in);
        boolean finish=false;
        while (!finish) {
            System.out.println("1. Добавить пользователя");
            System.out.println("2. Список пользователей");
            System.out.println("3. Найти пользователя по email");
            System.out.println("4. Выход");
            int menuSelect = scanner.nextInt();
            switch (menuSelect){
                case 1: controller.inputUser();break;
                case 2: System.out.println(controller.getAllUsers()); break;
                case 3: System.out.println(controller.getUserByEmail()); break;
                default: finish=true;
            }
        }
        scanner.close(); // закрываем сканер
    }




}