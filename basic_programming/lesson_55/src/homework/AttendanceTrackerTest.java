package homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AttendanceTrackerTest {
    /**
     * ByteArrayOutputStream и PrintStream: ByteArrayOutputStream это класс, который реализует выходной поток, в который
     * данные могут быть записаны. Записанные байты можно затем извлечь в виде массива байтов. PrintStream это класс,
     * который добавляет возможность печати различных данных в другой выходной поток. В данном коде создается новый
     * объект PrintStream, который перенаправляет вывод в объект ByteArrayOutputStream, чтобы тесты могли затем
     * проверить, что было напечатано.
     *
     * System.setOut(new PrintStream(outContent));: Эта строка перенаправляет
     * стандартный вывод в outContent, что позволяет нам затем извлекать и проверять весь текст, который был напечатан в
     * System.out.
     *
     * assertEquals(expectedOutput, outContent.toString());: Эта строка сравнивает ожидаемый вывод с
     * фактическим выводом, который был сохранен в outContent.
     */
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

