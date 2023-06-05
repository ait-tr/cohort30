import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Parsing IP-address");
//        Программа получает на вход IP-адрес в одну строку:
//        например, 192.168.23.1 (четыре числа, разделённые точками).
//        Каждое число должно быть в диапазоне от 0 до 255.
//        Программа должна вывести эти четыре числа по отдельности

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input IP-address");
        String ipAddress = scanner.nextLine();

        ipAddress = ipAddress.trim(); // отсекли случайные пробелы в начале и в конце

        int l = ipAddress.length();

        int firstDotIndex = ipAddress.indexOf('.'); // нашли номер позиции 1-й точки
        System.out.println(firstDotIndex);
        int secondDotIndex = ipAddress.indexOf('.', firstDotIndex + 1); // ищем номер позиции 2-й точки
        System.out.println(secondDotIndex);
        int thirdDotIndex = ipAddress.indexOf('.', secondDotIndex + 1); // ищем номер позиции 2-й точки
        System.out.println(thirdDotIndex);
        int extraDotIndex = ipAddress.indexOf('.', thirdDotIndex + 1); // ищем еще одну точку
        // если этой точки нет, то вернется значение -1

        if (extraDotIndex != -1) {
            System.out.println("Wrong input, a lot of dots.");
        }

            String byte1 = ipAddress.substring(0, firstDotIndex);
            int num1 = Integer.parseInt(byte1); // преобразование строки в число

            // проверка на диапазон от 0 до 255
            if (num1 < 0 || num1 > 255) {
                System.out.println("Wrong format IP-address");
            }

            String byte2 = ipAddress.substring(firstDotIndex + 1, secondDotIndex);
            int num2 = Integer.parseInt(byte2); // преобразование строки в число

        if (num2 < 0 || num2 > 255) {
            System.out.println("Wrong format IP-address");
        }

            String byte3 = ipAddress.substring(secondDotIndex + 1,thirdDotIndex);
            int num3 = Integer.parseInt(byte3); // преобразование строки в число

        if (num3 < 0 || num3 > 255) {
            System.out.println("Wrong format IP-address");
        }

            String byte4 = ipAddress.substring(thirdDotIndex + 1, l);
            int num4 = Integer.parseInt(byte4); // преобразование строки в число

        if (num4 <0 || num4 > 255) {
            System.out.println("Wrong format IP-address");
        }

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);

    }
}

