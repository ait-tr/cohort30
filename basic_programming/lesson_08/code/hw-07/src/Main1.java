import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Find 3rd angle in triangle");
        // Задача 2
        // Дополнить задачу о сумме углов треугольника контролем,
        // что вводимые углы не больше 90 градусов.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first angle of the triangle:");
        double a = scanner.nextInt();
        System.out.println("Enter the second angle of the triangle:");
        double b = scanner.nextInt();
        // трентий угол не нужен, его можно найти
//         System.out.println("Enter the third angle of the triangle:");
//        double c = scanner.nextInt();

        if (a < 90 && b < 90 ) { // && c <= 90 - это избыточно

            double с = 180 - (a + b);
            System.out.println("3rd angle: " + с);

// далее код не нужен
//            if (sum == 180) {
//                System.out.println("The triangle angles are valid.");

            } else {
                System.out.println("Invalid input! Angles cannot be greater than 90 degrees.");
            }
        }
}