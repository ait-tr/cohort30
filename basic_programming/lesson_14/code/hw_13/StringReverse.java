package hw_13;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        //Задача 3. Пользователь вводит строку.
//Распечатайте эту строку в обратном порядке.
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        char[] array = st.toCharArray(); // что происходит в этой строке?

        for (int i = st.length()-1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}

