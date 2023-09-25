package teacher_code;

import java.util.Stack;

public class TeacherCode {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push - добавляет элемент на вершину стека.
        // вершина стека - конец стека (последний добавленный элемент)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(7);

        // [1, 2, 3, 4, 7], где 7 - вершина стека

        System.out.println(stack);
        // возвращает количство элементов в стеке
        System.out.println(stack.size());
        // возвращает true, если стек пуст и в нем нет ни одного элемента
        System.out.println(stack.isEmpty());
        // возвращает true, если такой элемент есть в стеке
        System.out.println(stack.contains(7));
        // возвращает false, если такого элемента нет в стеке
        System.out.println(stack.contains(70));
        // search - возвращает количество вызвовов метода pop, чтобы добраться до элемента
        System.out.println(stack.search(3));
        // pop - возвращает элемент с вершины стека, удаляя его из стека
        System.out.println(stack.pop()); // получили 7, тк это была вершина стека. Осталось: [1, 2, 3, 4]
        System.out.println(stack.pop()); // получили 4, тк это была вершина стека. Осталось: [1, 2, 3]
        System.out.println(stack.pop()); // получили 3, тк это была вершина стека. Осталось: [1, 2]
        System.out.println(stack);
        // peek - возвращает элемент с вершины стека, не удаляя его из стека
        System.out.println(stack.peek()); // получили 2, тк это была вершина стека, но не удалили из стека. Осталось: [1, 2]
        // тк ничего не изменилось, результат будет аналогичным:
        System.out.println(stack.peek()); // получили 2, тк это была вершина стека, но не удалили из стека. Осталось: [1, 2]
        System.out.println(stack);

        stack.clear(); // удалит все элементы из стека
        System.out.println(stack);
        System.out.println(stack.isEmpty()); // true, тк в стеке нет элементов

        stack.push(17);
        stack.push(34);
        stack.push(76);
        stack.push(14);
        stack.push(90);

        System.out.println(stack);

        // перебор всеъ элементов в стеке:
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();

        // с учетом того, что в основе стека лежит массив, можно получить доступ по индексу:
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();

        // но тк основная задача стека - возвращать элемент с вершины стека, самым логичным кажется следущий цикл:
        while (!stack.isEmpty()) { // пока (!стек.пуст), те пока стек не пустой
            int x = stack.pop();
            System.out.print(stack.pop() + " "); // возвращает вершину стека, удаляя ее из стека.

        }
        System.out.println();
        System.out.println(stack);
    }
}
