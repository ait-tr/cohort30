package practice.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Peter");
    }

    @Test
    void averageMarkTest() {
        int[] marks = {2, 3, 4, 5, 3}; // 17
        assertEquals(3.4, student.averageMark(marks));
    }
}