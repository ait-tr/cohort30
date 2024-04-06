package de.ait.service;

import de.ait.model.User;
import de.ait.repository.CrudRepository;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class UserServiceImp  implements UserService{
    CrudRepository<User> repository;

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public void saveUser(List<User> users) {
        List<User> listToAdd = new ArrayList<>();
        List<User> userListToAdd = users.stream()
                .filter(this::validate)
                .collect(Collectors.toList());
        repository.save(userListToAdd);
    }

    @Override
    public void saveUser(User user) {
        if (validate(user)) {
            repository.save(user);
        }
    }

    @Override
    public User findUsersByEmail(String email) {
        return repository.findAll().stream()
                .filter(u->u.getEmail().equals(email))
                .findAny()
                .orElse(null);
    }

    public boolean validate(User user){
        return !user.getEmail().isEmpty() && user.getEmail().contains("@");
    }
}
