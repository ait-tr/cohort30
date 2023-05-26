import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("сторона квадрата: ");
        String num1 = br.readLine();
        System.out.println("сторона ровна: " + num1 );
        int n1 = Integer.parseInt(num1);
        System.out.println("площадь квадрата ровна: " +  n1  + " умноженное на " +  n1 );
        System.out.println("площадь квадрата ровна: " + n1 * n1);

        System.out.println("а объем куба: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("сторона куба: ");
        String num2 = br.readLine();
        System.out.println("сторона ровна: " + num2 );
        int n2 = Integer.parseInt(num2);
        System.out.println("объем куба равен: " + n2 + " умноженное на " + n2 + " и " + " умноженное на " + n2 );
        System.out.println("объем куба равен: " + n2 * n2 * n2);
    }
}
