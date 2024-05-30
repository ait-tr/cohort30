package de.ait.ec.repository;

import de.ait.ec.model.Course;
import de.ait.ec.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LessonsRepository extends JpaRepository<Lesson,Long> {

    Optional<Lesson> findByCourseAndId(Course course, Long lessonId);
}
