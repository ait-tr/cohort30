import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month number:");
        int month_number = scanner.nextInt();

        if (3 <= month_number & month_number <= 5 ) System.out.println("This is Spring, Maugli. ");
        if (6 <= month_number & month_number <= 8 ) System.out.println("This is Summer, Maugli. ");
        if (9 <= month_number & month_number <= 11 ) System.out.println("This is Autumn, Maugli. ");
        if (month_number == 11 | month_number == 12 | month_number == 1) System.out.println("This is Winter, Maugli ");

    }
}
