import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи на вычисления");
//        Написать программу для вычисления средней стомости поездки по транспортному проездному.
//        Попросить пользователя ввести стоимость проездного на месяц
//        и количество рабочих дней в месяце. Считая, что в рабочий день в среднем две поездки,
//        и 1.5 поездки в выходной, посчитать и округлить общее число поездок в месяц
//        и посчитать среднюю стоимость одной поездки по проездному.
        // Рассчитать для мая.

        Scanner scanner = new Scanner(System.in); // включили Scanner

        System.out.println("Input cost of City ticket per Month: ");
        double priceMonatKarte = scanner.nextDouble(); // считываем от пользователя стоимсость проездного билета
        System.out.println("Input number of working das in current month: ");
        int workingDays = scanner.nextInt();

        int trip = workingDays * 2; // количество поездок в рабочие дни
        int holydays = 31 - workingDays;

        int holydayTrip = (int)Math.round(1.5 * holydays); // количество поездок в выходные дни

        // trip = trip + holydayTrip; // так не очень хорошо, но можно
        int trips = 0; // общее количество поездок
        trips = trip + holydayTrip;

        System.out.println("Number of trips in May: " + trips);

        double averageTripPrice = priceMonatKarte/trips; // вычисляем среднюю стоимость

        System.out.println("Average price = " + averageTripPrice); // выводим на печать
        System.out.println();
        System.out.printf("Average price = %.2f", averageTripPrice); // выводим на печать
        System.out.println(); // переход на новую строку
        System.out.print("\n"); // переход на новую строку тоже
        System.out.println("This is new line");

    }
}


/*
// Перевод радианы в градусы
        System.out.println("Переводим радианы в градусы");
        double rad = 3.14 ; // 'nj число мы задаем или спрашиваем у пользователя (например, через Scanner)
        double k = 57.296d; // этот коэффициент ищется в справочнике
        double grad = rad * k;
        System.out.println("Получены данные в градусах " + grad);

    ___________________

    System.out.println("Вычисление угла треугольника по двум другим:");
        System.out.println("Input 1st angle: "); // запрос величины 1-го угла
        int a1 = scanner.nextInt(); // считываем значение угла с клавиатуры

        System.out.println("Input 2nd angle: "); // запрос величины 1-го угла
        int a2 = scanner.nextInt(); // считываем значение угла с клавиатуры

        int a3 = 180 - a1 - a2; // сумма углов в треугольнике 180 градусов

        System.out.println("3rd angle in triangle is: " + a3);

    _____________________
        System.out.println("Calculate length and area of circle.");

        System.out.println("Input radius of circle: ");
        double radius = scanner.nextDouble();

        double l = 2 * Math.PI * radius; // вычислили длину окружности
        double s = Math.PI * radius * radius; // вычислили площадь
        float s1 = (float) (Math.PI * Math.pow(radius, 2)); // вычислили площадь другим способом

        System.out.println("Length of circle: " + l);
        System.out.println("Area of circle: " + s);
        System.out.println("Area of circle: " + s1);


 */