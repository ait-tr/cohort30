package teacher_code;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Consultation2 {
    static final int X = 12;

    public static void main(String[] args) {
        int t = Consultation2.X;

        Scanner scanner = new Scanner(System.in);

        String startTime = null;

        try {
            startTime = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("enter boolean");
        boolean b = scanner.nextBoolean();
        String str2= null;

        if (b) {
            str2 = "true";
        } else {
            System.out.println("false");
        }

        System.out.println(str2);
    }
}
