package de.ait.ec.service.impl;

import de.ait.ec.dto.NewUserDto;
import de.ait.ec.dto.UserDto;
import de.ait.ec.exceptions.RestException;
import de.ait.ec.model.User;
import de.ait.ec.repository.UsersRepository;
import de.ait.ec.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import org.springframework.security.crypto.password.PasswordEncoder;


import static de.ait.ec.dto.UserDto.from;

@RequiredArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {
    private final UsersRepository usersRepository;

  //  private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    private final PasswordEncoder passwordEncoder;



    @Override
    public UserDto register(NewUserDto newUser) {

        if(usersRepository.existsByEmail(newUser.getEmail())){
            throw new RestException(HttpStatus.CONFLICT,
                    "User with email <" + newUser.getEmail() + "> already exists");
        }

        User user = User.builder()
                .email(newUser.getEmail())
                .password(passwordEncoder.encode(newUser.getPassword()))
               // .password(newUser.getPassword())
                .role(User.Role.ADMIN)
                .build();

        usersRepository.save(user);
        return from(user);
    }
}
