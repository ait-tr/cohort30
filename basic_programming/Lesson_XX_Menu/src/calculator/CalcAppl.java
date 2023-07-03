package calculator;

import calculator.model.MathActions;
import calculator.model.Menu;
import java.util.Scanner;

public class CalcAppl {
    public static void main(String[] args) {

        // создаем меню действий
        Menu action = new Menu("+", "-", "*", "/");

        // печатаем меню Actions
        System.out.println(action.toString());

        // получаем выбор Действия из меню
        int choice = action.chooseAction();
        System.out.println("Action: " + choice);
        // запрос чисел
        // если выбрано деление, то просим ввести double
        if (choice == 4) {
            inputDoubleNum();
        } else { // иначе просим ввести int
            inputIntNum();
        }

        // выполняем Действие из меню

        // показываем результат

        // продолжить?


    }

    public static void inputIntNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("Input b: ");
        int b = scanner.nextInt();
    }

    public static void inputDoubleNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
    }
}
