package de.ait.mvcdemo.repository;

import de.ait.mvcdemo.model.User;

public interface UserRepository extends CrudRepository<User> {

     // User findByEmail(String email);
}
