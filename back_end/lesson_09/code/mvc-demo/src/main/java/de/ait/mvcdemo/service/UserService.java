package de.ait.mvcdemo.service;

import de.ait.mvcdemo.dto.RegisterDto;
import de.ait.mvcdemo.model.User;

import java.util.List;

public interface UserService {

  //  User addUser(String firstName, String lastName,String email, String password);
    User addUser(RegisterDto registerDto);

   List<User> getAllUsers();
}
