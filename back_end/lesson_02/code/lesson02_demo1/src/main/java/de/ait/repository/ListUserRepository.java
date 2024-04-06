package de.ait.repository;

import de.ait.model.User;

import java.util.ArrayList;
import java.util.List;

public class ListUserRepository implements CrudRepository<User> {
    List<User> list = new ArrayList<>();
    @Override
    public boolean save(User element) {
        return list.add(element);
    }

    @Override
    public boolean save(List<User> list) {
        return this.list.addAll(list);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(list);
    }
}
