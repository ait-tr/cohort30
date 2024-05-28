package de.ait.ec.repository;

import de.ait.ec.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Course,Long> {
}
