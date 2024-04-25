package de.ait.demouser.repository;


import de.ait.demouser.model.User;

public interface UserRepository extends CrudRepository<User> {

     // User findByEmail(String email);
}
