package repository;

import model.User;

public interface UserRepository extends CrudRepository<User>{
    User findByEmail(String email);
}
