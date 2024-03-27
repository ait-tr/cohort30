package repository.impl;

import model.User;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryListImpl implements UserRepository {

    private List<User> users = new ArrayList<>();
    private int generatedId = 1;

    public UserRepositoryListImpl(List<User> users, int generatedId) {
        this.users = users;
        this.generatedId = generatedId;
    }

    @Override
    public void save(User user) {
        users.add(user);
        user.setId(generatedId);
        generatedId++;
    }

    @Override
    public void deleteById(int id) {
        //

    }

    @Override
    public void update(int id, User user) {
        //

    }

    @Override
    public User findById(int id) {
        return users.stream()
                .filter(user -> user.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return users.stream()
                .toList();
    }

    @Override
    public User findByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}
