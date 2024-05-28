package de.ait.ec.service;

import de.ait.ec.dto.NewUserDto;
import de.ait.ec.dto.UserDto;

public interface UsersService {
    UserDto register(NewUserDto newUser);
}
