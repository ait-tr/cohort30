package de.ait.ec.repository;

import de.ait.ec.model.Course;
import de.ait.ec.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface UsersRepository extends JpaRepository<User,Long> {
    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

    Set<User> findAllByCoursesContainsOrderById(Course course);
}
