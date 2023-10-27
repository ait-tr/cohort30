package teacher_code;

import java.util.Scanner;

public class Consultation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 20ms

//        System.out.println("Enter your number:"); // 12ms
//
//        int x = scanner.nextInt(); // 15 ms
//        int y = scanner.nextInt(); // 15 ms
//
//        System.out.println(x * y); // 12 ms

        // 59ms -> const -> O(const) -> O(1)


        // bit -> 0 1
        byte  b = 12;    // 8   bit   00110011  256    -128 0 127
        short s = 12;    // 16  bit
        int   i = 12;    // 32  bit
        long  l = 12L;   // 64  bit  (32 bit по умолчанию приводится к типу int)

        float  f = 1.0f;  // 32 bit
        double d = 1.0d;  // 64 bit

        char c1 = 105;   // 32 bit
        char c2 = 'd';

        boolean bool = true; // 1

        // 0    1
        // 00  01  10  11
        // 000  001  010  100  101 110 011  111
        // 0000
        System.out.println(8l * Integer.MAX_VALUE);
        System.out.println(f / 3);
        System.out.println(d / 3);
        System.out.println(c1);
        System.out.println(c2);

    }
}
