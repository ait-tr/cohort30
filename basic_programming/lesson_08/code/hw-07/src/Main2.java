import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Discount for goods");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input price: ");
        double price = scanner.nextDouble();

        if (price <= 0) {
            System.out.println("Wrong input ");
        } else {
            System.out.println("Good price!");
        }

    }
}