package de.ait.demouser.service.impl;


import de.ait.demouser.model.User;
import de.ait.demouser.repository.UserRepository;
import de.ait.demouser.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository; // зависимость от базы данных

    public UserServiceImpl(@Qualifier("userRepositoryFileImpl") UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll(); // просто запрашиваем у репозитория
    }
}
