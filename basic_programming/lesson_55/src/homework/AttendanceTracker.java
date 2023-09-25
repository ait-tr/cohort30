package homework;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AttendanceTracker {

    private Map<String, Map<LocalDate, Boolean>> attendanceMap;

    public AttendanceTracker() {
        attendanceMap = new HashMap<>();
    }

    public void addStudent(String name) {
        if (!attendanceMap.containsKey(name)) {  // Проверка на наличие ученика в системе
            attendanceMap.put(name, new TreeMap<>());  // TreeMap автоматически сортирует даты
        }
    }

    public void addLessonDate(LocalDate date) {
        for (Map<LocalDate, Boolean> dateMap : attendanceMap.values()) {
            if (!dateMap.containsKey(date)) {  // Проверка на наличие даты в системе для каждого ученика
                dateMap.put(date, false);  // По умолчанию, ученик не посетил урок
            }
        }
    }

    public void markAttendance(String name, LocalDate date, boolean attended) {
        Map<LocalDate, Boolean> dateMap = attendanceMap.get(name);
        if (dateMap != null && dateMap.containsKey(date)) {  // Проверка на наличие ученика и даты в системе
            dateMap.put(date, attended);
        }
    }

    public void printAllAttendance() {
        for (Map.Entry<String, Map<LocalDate, Boolean>> entry : attendanceMap.entrySet()) {
            System.out.println("Student: " + entry.getKey());
            for (Map.Entry<LocalDate, Boolean> dateEntry : entry.getValue().entrySet()) {
                System.out.println(dateEntry.getKey() + ": " + (dateEntry.getValue() ? "Attended" : "Missed"));
            }
        }
    }

    public void printStudentAttendance(String name) {
        Map<LocalDate, Boolean> dateMap = attendanceMap.get(name);
        if (dateMap != null) {
            System.out.println("Student: " + name);
            for (Map.Entry<LocalDate, Boolean> dateEntry : dateMap.entrySet()) {
                System.out.println(dateEntry.getKey() + ": " + (dateEntry.getValue() ? "Attended" : "Missed"));
            }
        } else {
            System.out.println("No data found for student: " + name);
        }
    }
}

