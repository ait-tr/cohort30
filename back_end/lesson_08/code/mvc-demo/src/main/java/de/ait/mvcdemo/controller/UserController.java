package de.ait.mvcdemo.controller;

import de.ait.mvcdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/signUp")
    public String addUser(@RequestParam("firstName")String firstName,
                          @RequestParam("lastName")String lastName,
                          @RequestParam("email")String email,
                          @RequestParam("password")String password){
        userService.addUser(firstName,lastName,email,password);

        System.out.println(firstName + ";" + lastName + ";" + email +";" + password);

        return "redirect:/success_signUp.html";
    }


    public String getUsers(){
        return null;
    }
}
