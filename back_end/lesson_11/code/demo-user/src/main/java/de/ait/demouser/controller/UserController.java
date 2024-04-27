package de.ait.demouser.controller;


import de.ait.demouser.dto.NewUserDto;
import de.ait.demouser.dto.UserDto;
import de.ait.demouser.model.User;
import de.ait.demouser.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tags(value = @Tag(name = "Users"))
//@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;


    @Operation(summary = "Get all users", description = "available for administrator")
    @GetMapping()
  //  @ResponseBody // означает, что метод будет возвращать не название страницы, а JSON-обьект
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }


    @Operation(summary = "add user", description = "available for administrator")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
 //   @ResponseBody
    public UserDto addUser(@RequestBody NewUserDto newUser) { // requestBody - запросить json  а не html
        return userService.addUser(newUser);
    }


    @Operation(summary = "Get user by id",description = "available for everyone")
    @GetMapping("/{user-id}") // path variable если user/5 то id=5
    public UserDto getUser(@PathVariable("user-id")Long id){
        return userService.getUser(id);
    }

    @Operation(summary = "update user",description = "available for administrator")
    @PutMapping("/{user-id}")
    public UserDto updateUser(@PathVariable("user-id")Long id,
                              @RequestBody UpdateUserDto updateUser){
        return userService.updateUser(id,updateUser);
    }


}
