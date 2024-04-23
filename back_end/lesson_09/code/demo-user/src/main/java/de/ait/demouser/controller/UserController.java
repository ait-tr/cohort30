package de.ait.demouser.controller;


import de.ait.demouser.model.User;
import de.ait.demouser.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

 /*   @PostMapping("/signUp")
    public String addUser(@RequestParam("inputFirstName")String firstName,
                          @RequestParam("inputLastName")String lastName,
                          @RequestParam("inputEmail")String email,
                          @RequestParam("inputPassword")String password){
        userService.addUser(firstName,lastName,email,password);

        System.out.println(firstName + ";" + lastName + ";" + email +";" + password);

        return "redirect:/success_signUp.html";
    }

  */
        // после добавления DTO:

    @GetMapping("/users")
    @ResponseBody // означает, что метод будет возвращать не название страницы, а JSON-обьект
    public List<User> getAllUsers(){
       return userService.getAllUsers();



    }
}
