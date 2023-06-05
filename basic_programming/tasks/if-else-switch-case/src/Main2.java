import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("IP-address parsing");
//        Программа получает на вход IP-адрес в одну строку:
//        например, 192.168.23.1 (четыре числа, разделённые точками).
//        Каждое число должно быть в диапазоне от 0 до 255.
//        Программа должна вывести четыре числа по отдельности, каждое в новой строке.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input IP - address");
        String ipAddress = scanner.next();
        int firstDot = ipAddress.indexOf('.'); // find first . = 3
        int secondDot = ipAddress.indexOf('.', firstDot + 1); //
        int thirdDot = ipAddress.indexOf('.', secondDot + 1); //
        int extraDot = ipAddress.indexOf('.', thirdDot + 1); //
        // extraDot - это лишняя точка, её быть не должно, и ничего найти indexOf не должен
        // куыгде should be -1
        if (extraDot != -1) {
            // find extra dot
            System.out.println("Wrong input IP-address, a lot of dots");
            return; // exit from application
        }
        // check for emptiness
        String byte1 = ipAddress.substring(0, firstDot); // выкусываем с начала строки до первой точки,
        if (byte1.isEmpty()) {
            System.out.println("Неправильный формат IP-адреса: пустой первый байт");
            return;
        }
        // check for value
        int num1 = Integer.parseInt(byte1);
        if (num1 < 0 || num1 > 255 ) { // 00000000
            System.out.println("Неправильный формат IP-адреса: некорректный первый байт");
            return;
        }

// ___________ Аналогично для byte2, byte3, byte4
        System.out.println("First byte: " + num1);
        System.out.println("This is second line ");

    }
}