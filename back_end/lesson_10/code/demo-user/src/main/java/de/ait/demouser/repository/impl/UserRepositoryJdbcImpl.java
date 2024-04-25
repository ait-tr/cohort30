package de.ait.demouser.repository.impl;

import de.ait.demouser.model.User;
import de.ait.demouser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepositoryJdbcImpl implements UserRepository {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User model) {

    }
}
