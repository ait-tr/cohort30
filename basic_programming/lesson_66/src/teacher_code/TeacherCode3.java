package teacher_code;

public class TeacherCode3 {
    static int recursive( int x) {
        // another logic
        if (x < 0) {
            return x;
        }
        return TeacherCode2.recursive(x -1 );
        // another logic
    }
}
