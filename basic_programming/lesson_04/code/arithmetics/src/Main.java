public class Main {
    public static void main(String[] args) {
        System.out.println("Арифметические действия и класс Math");
        // примеры использования Math

        int x, y;
        x = 135;
        y = 213;

        int z = Math.max(x, y);
        System.out.println("Максимальное из " + x + " и " + y + " = " + z);

        int z1 = Math.min(x, y);
        System.out.println("Минимальное из " + x + " и " + y + " = " + z1);

        int a = -321;
        System.out.println(Math.abs(a)); // модуль числа a

        int b = 512;
        System.out.println(Math.abs(b)); // модуль числа b

        int n = 2;
        int k = 10;
        int pow2 = (int) Math.pow(n, k); // возведение в степень
        System.out.println(pow2);// целое число
        double pow2d = Math.pow(n, k);
        System.out.println(pow2d); // дробное число

        System.out.println(Math.PI); // число Пи

        double s = Math.sqrt(10000.0d); // извлечение квадратного корня
        System.out.println(s);

    }
}

/*
     //   x = x + 1;
        x++; // увеличение значения на 1
        System.out.println(x);

        y--;
        System.out.println(y);

        x += 10; // увеличение переменной на 10
        System.out.println("X = " + x);

        y -= 4; // уменьшение переменной на 4
        System.out.println(y);

        // x = 2 * x;
        x *= 2; //увеличение переменной в 2 раза
        System.out.println("X = " + x);

        ____________________________
        int x = 57;
        int y = 10;

        int z;
        z = x / y;
        System.out.println("Частное " + x + " и " + y + " = " + z);

        int zz;
        zz = x % y; // получаем остаток от деления
        System.out.println("Остаток от деления " + x + " на " + y + " = " + zz);

        int x1 = 3;
        int y1 = 10;

        int z1;
        z1 = x1 / y1;
        System.out.println("Частное " + x1 + " и " + y1 + " = " + z1);

        int zz1;
        zz1 = x1 % y1;
        System.out.println("Остаток от деления " + x1 + " на " + y1 + " = " + zz1);

        int a = 12;
        System.out.println(a % 4); // деление с остатком
        System.out.println(a % 6); // деление с остатком
        // когда число разделилось нацело, то остаток от деления = 0
        ___________
        // операции с числами с плавающей запятой, с десятичным разделителем
        double a = 10.0d;
        double b = 7.0d;

        double c;
        c = a / b;
        System.out.println(c);

        System.out.printf("Результат деления: %f2", c); // форматированный вывод
 */