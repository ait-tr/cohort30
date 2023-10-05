package practice;

public class Classwork {

    public static void main(String[] args) {
        Classwork tasks = new Classwork();
//        tasks.task1();
//        tasks.task2();
//        tasks.task3();
//        tasks.task4();
//        tasks.task5();
    }

    // Задача 1: Создание и старт двух потоков
    public void task1() {
        Thread thread1 = null;
        Thread thread2 = null;

        thread1.start();
        thread2.start();
    }

    // Задача 2: Использование метода sleep()
    public void task2() {
        Thread thread = null;
        thread.start();
    }

    // Задача 3: Установка и получение приоритета потока. создайте поток, установите для него максмально возможный
    // приоритет. Выведите на экран "Task 3: Thread Priority: ..."

    public void task3() {
        Thread thread = null;

        thread.start();
    }

    // Задача 4: Использование join() для ожидания завершения потока. Создайте поток, который печатает числа от 1 до 5
    // с интервалом в 1с, главный поток должен дождаться выполнения этого потока
    public void task4() {
        Thread thread = null;

        thread.start();


        System.out.println("Task 4: Thread has finished execution");
    }

    // Задача 5: Использование потока-демона. Создайте демон-поток, который каждые 500 мс печатает в консоль
    // "Task 5: Daemon Thread is running", дайте поработать данному потоку 2 секунды, потом завршите выполнение
    // главного потока
    public void task5() {
        Thread daemonThread = null;

        daemonThread.start();

        // Позволим демону поработать 2 секунды перед завершением основного потока

        System.out.println("Task 5: Main Thread is finishing and daemon will be terminated");
    }

    // Задача 6: создайте 2 потока 1.поток - демон, который 10 раз выводи в консоль "Daemon Thread is running", засыпая
    // на 1 секунду каждый раз. Второй пото должен проделать аналогичную работу, но 5 раз и выводить сообщение
    // "Non Daemon Thread is running" и остановить свое выполнение. В потоке мейн следует проверить, работает ли
    // поток-демон, если да, то остановить его, если нет, то просто закончить работу.

    public void task6() {
        Thread daemonThread = null;
        Thread nonDaemonThread = null;

        daemonThread.start();
        nonDaemonThread.start();
    }
}
