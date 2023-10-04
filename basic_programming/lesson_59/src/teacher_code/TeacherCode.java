package teacher_code;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TeacherCode {
    volatile static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        List<String> list = List.of("one", "two", "three", "four", "five"); // 10 млн строк

        List<String> upperCase = new ArrayList<>(); // ["", "", "", "", ""]
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < list.size()) {
                    String temp = list.get(count);
                    count++;
                    upperCase.add(temp.toUpperCase());
                    System.out.println("1 - " + temp);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < list.size()) {
                    String temp = list.get(count);
                    count++;
                    upperCase.add(temp.toUpperCase());
                    System.out.println("2 - " + temp);
                }
            }
        });


        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();

        System.out.println(upperCase);
        System.out.println(list);

    }

}




