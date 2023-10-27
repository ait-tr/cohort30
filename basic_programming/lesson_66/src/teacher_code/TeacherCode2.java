package teacher_code;

public class TeacherCode2 {
    static int  recursive(int x) {
        // other logic
        if (x < 0) {
            return x;
        }
        return TeacherCode3.recursive(x - 1);
        // continue other logic
    }
}
