package practice.coffee;

import practice.seasons.Season;

import java.util.Scanner;

public class CoffeeMashine {
    public static void main(String[] args) {

        System.out.println("Welcome to our Coffee Shop!");

        // предложить меню
        Coffee[] menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + " - " + menu[i] );
        }
        // понять выбор пользователя
        System.out.println("Input number of your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        // объявить цену и предложить оплатить
        switch (choice) {
            case 1: {
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice - 1].getVolume() + " ml");
                System.out.println("The price is: " + menu[choice - 1].getPrice() + " euro");
                break;
            }
            // раскопировать cases

            default: {
                System.out.println("Wrong choice.");
            }
        }

    }

}
