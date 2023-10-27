package teacher_code;


public class TeacherCode {
    static int count;
    public static void main(String[] args) {
        // 5! = 1 * 2 * 3 * 4 * 5
        System.out.println(factorialRec(6L));
        System.out.println(factorial(6L));
    }


    static long factorialRec (long x) {
        if (x <= 0) {
            return -1;
        }
        if (x == 1) {
            return x;
        }

        return x * factorialRec(x - 1);
    }

    static long factorial(long x) {
        if (x <= 0) {
            return -1;
        }
        if (x == 1) {
            return x;
        }

        long result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }
}