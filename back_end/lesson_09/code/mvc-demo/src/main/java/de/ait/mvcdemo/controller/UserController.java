package de.ait.mvcdemo.controller;

import de.ait.mvcdemo.dto.RegisterDto;
import de.ait.mvcdemo.model.User;
import de.ait.mvcdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
 @PostMapping("/signUp")
 public String addUser(RegisterDto registerDto){
     userService.addUser(registerDto);

    // System.out.println(firstName + ";" + lastName + ";" + email +";" + password);

     return "redirect:/success_signUp.html";
 }




    @GetMapping("/users")
    public String getUsersPage(Model model){
       List<User> users = userService.getAllUsers();
       model.addAttribute("usersList",users);

        return "users_page";
    }
}
