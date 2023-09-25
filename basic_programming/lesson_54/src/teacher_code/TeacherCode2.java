package teacher_code;

import java.util.*;

public class TeacherCode2 {
    public static void main(String[] args) {
        //Queue<String> queue = new PriorityQueue<>(); // сама сортирует последовательность объектов
        Queue<String> queue = new ArrayDeque<>(); // сохранит последовательность ввода

        // методы add и offer очень похожи и выполняют одну и ту же логику - добавляют элемент в конец очереди
        // но, если очередь ограничена размером, то метод add может привести к исключениям, а offer - нет
        // добавляем элементы в конец очереди
        queue.add("one");
        queue.add("two");
        queue.add("three");
        // тоже добавляем эелементы в конец очереди
        queue.offer("four");
        queue.offer("five");

        System.out.println(queue);

        //возвращает количство элементов в очереди
        System.out.println(queue.size()); // 5
        // возвращает true, если очередь пуста и в ней нет ни одного элемента
        System.out.println(queue.isEmpty());
        // возвращает true, если такой элемент есть в очереди
        System.out.println(queue.contains("four"));
        // возвращает false, если такого элемента нет в очереди
        System.out.println(queue.contains("fout"));

        // метод poll - аналогичен методу pop в стеке, но предоставит первый элемент:
        // если очередь пуста, получим null
        System.out.println("queue.poll(): " + queue.poll());
        System.out.println(queue);
        // метод remove - аналогичен методу poll, но может привести к Exception, если очередь пуста:
        System.out.println("queue.remove(): " + queue.remove());
        System.out.println(queue);

        // метод peek в очереди аналогичен по логике одноименному методу в стеке,
        // но вернет первый эелемент без его удаления:
        // в пустой очереди вернет null
        System.out.println("queue.peek() " + queue.peek());
        //тк ничего не удалили из очереди, то и результат будет аналогичен:
        System.out.println("queue.peek() " + queue.peek());
        System.out.println(queue);

        //по своей логике абсолютно аналогичен методу peek, но в пустой очереди выбросит Exception
        System.out.println("queue.element() " + queue.element());
        System.out.println(queue);

        // .clear - вернет пустую очередь
        queue.clear();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        System.out.println("queue.peek() with empty queue: " + queue.peek());
        System.out.println("queue.poll() with empty queue: " + queue.poll());

        try {
            System.out.println(queue.element());
        } catch (NoSuchElementException e) {
            System.out.println("Cant make queue.element() with empty queue,\nNoSuchElementException has been throwed");
        }

        try {
            System.out.println(queue.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Cant make queue.remove() with empty queue,\nNoSuchElementException has been throwed");
        }

        // тк очередь пуста, для дальнейшей демонстрации повторно ее заполним значениями:
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.offer("four");
        queue.offer("five");




        // перебор всех элементов в очереди:
        // тк Queue - часть Collection, то мы можем использовать итератор, для перебора всех элементов:
        // порядок элементов сохраниться, ничего из очереди не удаляется
        System.out.println("Queue iteration:");
        for (String s : queue) {
            System.out.print(s + " ");
        }
        System.out.println("\nОчередь после итерации: " + queue);

        // Интерфейс Queue не предусматривает получение к элементу очреди по индексу,
        // но данная возможность есть в отдельно взятых классах

        // самым логически верным перебором очереди будет перебор при помощи метода poll, "вынимая" (удаляя) кажды раз
        // первый элемент в очереди:
        System.out.println("poll every element in queue:");
        while (!queue.isEmpty()) { // пока(!очередь.пуста)  те пока очередь не пуста и в ней есть хотя бы 1 элемент
            System.out.print(queue.poll() + " ");
        }
        System.out.println("\nОчередь после перебора всех элементов при помощи метода poll: " + queue);
    }
}
