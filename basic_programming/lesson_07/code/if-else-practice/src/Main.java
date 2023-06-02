import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("If - else practice");
//        - Задание 1:
//        Проверка четное или нечетное, положительное или отрицательное введенное пользователем число.
//        Проверка возраста собеседника, возраст запросить у пользователя. Если пользователю нет
//        18 лет, то сообщить "Вам надо получить общее среднее образование", иначе - спросить дату
//        дня рождения и вывести ее на экран.

        Scanner scanner = new Scanner(System.in); // Switch on Scanner

        System.out.println("Input number, pls: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 ) { // check division by 2
            System.out.println("This number " + number + " is even."); // message for user
        } else {
            System.out.println("This number " + number + " is odd."); // message for user
        }

        if (number > 0) { // check negative or positive
            System.out.println("This number " + number + " is positive."); // message for user
        } else {
            System.out.println("This number " + number + " is negative."); // message for user
        }

        // even and positive number
        if (number > 0 & number % 2 == 0) { // check negative or positive
            System.out.println("This number " + number + " is positive and even."); // message for user
        }

        System.out.println("How old are you?"); // question for user
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You have to finish school!");
        } else {
            System.out.println("What is your date of birthday?"); // question for user
            String dayOfBirth = scanner.next();
            System.out.println("Your day of birthday is: " + dayOfBirth);
        }

    }
}