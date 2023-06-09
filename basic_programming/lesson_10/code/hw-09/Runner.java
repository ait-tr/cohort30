import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Runner");
        // Увеличить число x до y путём постепенного увеличения его на 10%. Считать количество необходимых операций
        // Алгоритм был "подсмотрен" в интернете после долгой, мучительной, не очень плодотворной самостоятельной работы
        // Художественное описание:
        // Спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
        // Определите номер дня, на который пробег спортсмена составит не менее target километров.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите как много километров спортсмен пробежал в первый день: ");
        double distance = scanner.nextDouble(); // s , weg - варианты
        System.out.println("Введите итоговую цель. Как много километров спортсмен хочет пробегать за день?");
        double target = scanner.nextDouble();
        int dayCount = 1; // счетчик дней

        while (distance < target) { // пока пробегаемая дистанция меньше, чем требуется
            distance = distance + distance * 0.1; // distance *= 1.1
            System.out.println(distance);
            dayCount = dayCount + 1; // dayCount++
        //    System.out.println("день " + count + " пробегается " + firstDay);
        }
        System.out.println(dayCount);

       //  System.out.printf("Цель спортсмена займёт %.0f%s", + dayCount, " дней.");
        // спортсмен не защищён от довольно значительного "перебегания" заданной цели
        // e.g. открыть 24 строку, ввести программе цифры 75, 100 и посмотреть на значение пробегаемой дистанции четвёртого-пятого дней
    }
}
