import java.util.Scanner;

public class absNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();
        int abs_num = (num > 0) ? num : -num;
        System.out.println("Absolute value of number is :" + abs_num);
    }
}
