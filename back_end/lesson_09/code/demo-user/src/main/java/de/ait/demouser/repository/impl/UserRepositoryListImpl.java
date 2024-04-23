package de.ait.demouser.repository.impl;


import de.ait.demouser.model.User;
import de.ait.demouser.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryListImpl implements UserRepository {

    private final List<User> users = new ArrayList<>();
    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}
