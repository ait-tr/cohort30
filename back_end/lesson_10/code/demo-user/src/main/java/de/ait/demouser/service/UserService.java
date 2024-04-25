package de.ait.demouser.service;



import de.ait.demouser.dto.NewUserDto;
import de.ait.demouser.dto.UserDto;
import de.ait.demouser.model.User;

import java.util.List;

public interface UserService {



   List<UserDto> getAllUsers();

   UserDto addUser(NewUserDto newUser);
}
