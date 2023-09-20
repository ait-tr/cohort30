package teacher_code;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class TeachersCode2 implements Comparable<TeachersCode2>{
    private int id;
    private String name;
    private LocalDate date;

    public static void main(String[] args) {
        TeachersCode2 first = new TeachersCode2(1, "a", LocalDate.of(2000, 10, 12));
        TeachersCode2 second = new TeachersCode2(45, "b", LocalDate.of(1999, 12, 30));
    }

    public TeachersCode2(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public int compareTo(TeachersCode2 o) {
        return this.getDate().compareTo(o.getDate());
    }
}
