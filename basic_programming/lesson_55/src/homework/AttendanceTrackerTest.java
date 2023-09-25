package homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AttendanceTrackerTest {

    private AttendanceTracker attendanceTracker;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        attendanceTracker = new AttendanceTracker();
        System.setOut(new PrintStream(outContent));  // Перенаправляем стандартный вывод в ByteArrayOutputStream для проверки
    }

    @Test
    void addStudent() {
        attendanceTracker.addStudent("Alice");
        attendanceTracker.printStudentAttendance("Alice");
        String expectedOutput = "Student: Alice\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void addLessonDate() {
        attendanceTracker.addStudent("Alice");
        attendanceTracker.addLessonDate(LocalDate.of(2023, 10, 10));
        attendanceTracker.printStudentAttendance("Alice");
        String expectedOutput = "Student: Alice\n2023-10-10: Missed\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void markAttendance() {
        attendanceTracker.addStudent("Alice");
        attendanceTracker.addLessonDate(LocalDate.of(2023, 10, 10));
        attendanceTracker.markAttendance("Alice", LocalDate.of(2023, 10, 10), true);
        attendanceTracker.printStudentAttendance("Alice");
        String expectedOutput = "Student: Alice\n2023-10-10: Attended\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void printAllAttendance() {
        attendanceTracker.addStudent("Alice");
        attendanceTracker.addLessonDate(LocalDate.of(2023, 10, 10));
        attendanceTracker.markAttendance("Alice", LocalDate.of(2023, 10, 10), true);
        attendanceTracker.printAllAttendance();
        String expectedOutput = "Student: Alice\n2023-10-10: Attended\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void printStudentAttendance_noData() {
        attendanceTracker.printStudentAttendance("Bob");
        String expectedOutput = "No data found for student: Bob\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

