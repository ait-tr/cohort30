package de.ait.demouser.controller;


import de.ait.demouser.dto.NewUserDto;
import de.ait.demouser.dto.UserDto;
import de.ait.demouser.model.User;
import de.ait.demouser.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tags(value = @Tag(name = "Users"))
@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

  /*  public UserController(UserService userService){
        this.userService = userService;
    }

   */


        // после добавления DTO:

    @Operation(summary = "Get all users",description = "available for administrator")
    @GetMapping("/users")
    @ResponseBody // означает, что метод будет возвращать не название страницы, а JSON-обьект
    public List<UserDto> getAllUsers(){
       return userService.getAllUsers();
    }


    @Operation(summary = "add user",description = "available for administrator")
    @PostMapping("/users")
    @ResponseBody
    public UserDto addUser(@RequestBody NewUserDto newUser){ // requestBody - запросить json  а не html
       return userService.addUser(newUser);
    }
}
