package practice;

public class Classwork {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
    }

    /**
     * Задача 1: Создать два потока, один поток должен выводить четные числа от 0 до 10, а другой - нечетные числа от 1 до 9.
     */
    public static void task1() {
        Thread evenThread = null;

        Thread oddThread = null;

        evenThread.start();
        oddThread.start();
    }

    /**
     * Задача 2: Создать поток, который выводит числа от 1 до 5 с интервалом в 1 секунду, после чего главный поток выводит "Завершено".
     */
    public static void task2() {
        Thread thread = null;

        thread.start();



        System.out.println("Завершено");
    }

    /**
     * Задача 3: Создать поток, который ждет 5 секунд перед тем как вывести "Поток завершен", главный поток должен дождаться завершения этого потока.
     */
    public static void task3() {
        Thread thread = null;

        thread.start();


    }

    /**
     * Задача 4: Создать два потока, которые выводят "Поток 1" и "Поток 2" соответственно, каждые 1 и 3 секунды.
     */
    public static void task4() {
        Thread thread1 = null;

        Thread thread2 = null;

        thread1.start();
        thread2.start();
    }

    /**
     * Задача 5: Создать поток, который выводит числа от 10 до 1, после чего главный поток выводит "Старт".
     */
    public static void task5() {
        Thread thread = null;

        thread.start();


        System.out.println("Старт");
    }
}
