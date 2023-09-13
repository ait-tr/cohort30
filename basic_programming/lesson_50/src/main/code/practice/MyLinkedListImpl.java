package main.code.practice;

import java.util.List;

public class MyLinkedListImpl implements MyLinkedList {
    private Node head;  // Указатель на первый элемент списка
    private Node tail;  // Указатель на последний элемент списка
    private int size;   // Размер списка

    // Вложенный класс для узла списка
    private static class Node {

        String data;  // Данные, хранящиеся в узле
        Node prev;    // Указатель на предыдущий узел
        Node next;    // Указатель на следующий узел

        // Конструктор для создания нового узла
        public Node(String data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    /**
     * Добавляет элемент в конец списка.
     *
     * @param data данные, которые будут храниться в новом узле.
     * @return true, если добавление прошло успешно.
     */
    @Override
    public boolean add(String data) {
        // Создаем новый узел с данными, установим его предыдущий узел на tail,
        // а следующий узел на null, так как это будет последний элемент.
        Node newNode = new Node(data, tail, null);

        // Если head еще не установлен (список пуст), установим новый узел как head.
        if (head == null) {
            head = newNode;
        } else {
            // Если не пуст, установим новый узел как следующий для текущего tail.
            tail.next = newNode;
        }

        // Сделаем новый узел текущим tail.
        tail = newNode;

        // Увеличим размер списка на 1.
        size++;

        return true;
    }

    /**
     * Добавляет элемент по индексу.
     *
     * @param index индекс, по которому будет добавлен новый элемент.
     * @param data  данные, которые будут храниться в новом узле.
     * @return true, если добавление прошло успешно.
     * @throws IndexOutOfBoundsException если индекс вне диапазона списка.
     */
    @Override
    public boolean add(int index, String data) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node newNode = new Node(data, null, null);

        if (index == 0) {
            // Если добавляем в начало, установим новый узел в качестве head.
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            // Найдем узел, который сейчас находится на нужной позиции.
            Node current = getNode(index - 1);

            // Вставим новый узел после найденного.
            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;
        }

        if (newNode.next == null) {
            // Если новый узел теперь последний, обновим tail.
            tail = newNode;
        }

        // Увеличим размер списка.
        size++;

        return true;
    }

    /**
     * Вставляет (заменяет существующий) элемент по индексу.
     *
     * @param index индекс, по которому будет заменен элемент.
     * @param data  новые данные для узла.
     * @return true, если замена прошла успешно.
     * @throws IndexOutOfBoundsException если индекс вне диапазона списка.
     */
    @Override
    public boolean set(int index, String data) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Получаем узел, который нужно заменить
        Node current = getNode(index);

        // Заменяем данные в этом узле
        current.data = data;

        return true;
    }

    @Override
    public boolean addFirst(String data) {
        // Создаем новый узел, который будет первым
        Node newNode = new Node(data, null, head);

        // Если список не пуст, устанавливаем prev текущего head
        if (head != null) {
            head.prev = newNode;
        }

        // Устанавливаем новый узел как head
        head = newNode;

        // Если это первый элемент, то он же и tail
        if (tail == null) {
            tail = head;
        }

        size++;
        return true;
    }

    @Override
    public boolean addLast(String data) {
        // Метод add() уже реализован так, чтобы добавлять элемент в конец списка.
        // Поэтому, для добавления элемента в конец, мы просто вызываем уже существующий метод add().
        return add(data);
    }

    @Override
    public boolean addAll(List<String> list) {
        // Итерируемся по каждому элементу во входном списке.
        for (String item : list) {
            // Добавляем каждый элемент в наш двусвязный список.
            // Метод add() увеличивает размер и обновляет tail, поэтому он идеально подходит для этой задачи.
            add(item);
        }
        // Возвращаем true, чтобы указать, что все элементы были успешно добавлены.
        return true;
    }

    @Override
    public boolean contains(String data) {
        // Начинаем с первого узла списка.
        Node current = head;
        // Итерируемся по всем узлам.
        while (current != null) {
            // Проверяем, равны ли данные в текущем узле искомым данным.
            if (current.data.equals(data)) {
                // Если да, возвращаем true.
                return true;
            }
            // Если нет, переходим к следующему узлу.
            current = current.next;
        }
        // Если итерация завершилась, и мы не нашли искомый элемент, возвращаем false.
        return false;
    }

    @Override
    public String get(int index) throws IndexOutOfBoundsException {
        // Метод getNode(index) возвращает узел по индексу.
        // Мы просто возвращаем данные этого узла.
        // Если индекс неверный, getNode(index) сам бросит исключение IndexOutOfBoundsException.
        return getNode(index).data;
    }

    @Override
    public String getFirst() {
        // Проверяем, является ли список пустым. В двусвязном списке, если head == null, это значит, что список пуст.
        if (head == null) {
            // Если список пуст, возвращаем null, так как в списке нет элементов для возврата.
            return null;
        }
        // Если список не пуст, возвращаем данные, хранящиеся в первом узле (head).
        return head.data;
    }

    @Override
    public String getLast() {
        // Проверяем, является ли список пустым. В двусвязном списке, если tail == null, это значит, что список пуст.
        if (tail == null) {
            // Если список пуст, возвращаем null, так как в списке нет элементов для возврата.
            return null;
        }
        // Если список не пуст, возвращаем данные, хранящиеся в последнем узле (tail).
        return tail.data;
    }

    @Override
    public int size() {
        // Просто возвращаем значение поля size, которое хранит текущий размер списка.
        // Это поле обновляется каждый раз, когда элемент добавляется или удаляется из списка.
        return size;
    }


    @Override
    public int indexOf(String data) {
        // Инициализация переменной index, которая будет отслеживать текущий индекс во время прохода по списку.
        // Начинаем с 0, так как индексация в списке начинается с нуля.
        int index = 0;

        // Инициализация переменной current, которая будет использоваться для прохода по узлам списка.
        // Начинаем с head, который является первым узлом в списке.
        Node current = head;

        // Цикл для прохода по каждому узлу в списке. Цикл завершится, когда дойдем до конца списка (т.е. current станет null).
        while (current != null) {
            // Проверяем, равны ли данные в текущем узле искомым данным.
            if (current.data.equals(data)) {
                // Если данные совпадают, возвращаем текущий индекс.
                // Этот метод возвращает индекс первого совпадения, поэтому выходит из цикла сразу после нахождения.
                return index;
            }

            // Увеличиваем значение index на 1, так как переходим к следующему узлу.
            index++;

            // Переходим к следующему узлу в списке.
            current = current.next;
        }

        // Если цикл завершился и мы так и не нашли искомые данные, возвращаем -1.
        return -1;
    }


    @Override
    public int firstIndexOf(String data) {
        return indexOf(data);  // Этот метод эквивалентен indexOf, так как они делают одно и то же
    }

    @Override
    public int lastIndexOf(String data) {
        // Инициализируем индекс значением -1, что обозначает отсутствие элемента в списке.
        int index = -1;

        // Создаем переменную currentIndex для отслеживания текущего индекса во время прохода по списку.
        int currentIndex = 0;

        // Начинаем с первого элемента списка (узла head).
        Node current = head;

        // Цикл для прохода по всем узлам списка до тех пор, пока не достигнем конца (null).
        while (current != null) {
            // Сравниваем данные текущего узла с искомыми.
            if (current.data.equals(data)) {
                // Если нашли совпадение, обновляем index значением currentIndex.
                // Так как ищем последний индекс, значение index будет перезаписано при каждом новом совпадении.
                index = currentIndex;
            }

            // Увеличиваем currentIndex для следующей итерации.
            currentIndex++;

            // Переходим к следующему узлу в списке.
            current = current.next;
        }

        // Возвращаем -1, если элемент не найден, или индекс последнего совпадения.
        return index;
    }

    /**
     * Вспомогательный метод для получения узла по индексу
     *
     * @param index индекс узла, который нужно получить.
     * @return узел, находящийся на данном индексе.
     * @throws IndexOutOfBoundsException если индекс вне диапазона списка.
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        // Проверяем, попадает ли индекс в допустимый диапазон
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Начинаем с первого узла
        Node current = head;

        // Проходим через список, пока не дойдем до нужного индекса
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        // Возвращаем найденный узел
        return current;
    }

    // Метод для переворота всего списка
    public MyLinkedList reverseLinkedList() {
        // Создаем новый список, в который будем класть перевернутые элементы
        MyLinkedListImpl reversedList = new MyLinkedListImpl();

        // Начинаем с последнего элемента оригинального списка
        Node current = tail;

        // Проходим по всему списку от конца к началу
        while (current != null) {
            // Добавляем текущий элемент в новый список
            reversedList.add(current.data);
            // Переходим к предыдущему элементу
            current = current.prev;
        }

        return reversedList;
    }

    // Метод для переворота списка начиная с определенного индекса
    public MyLinkedList reverseLinkedList(int startIndex) {
        // Проверяем валидность начального индекса
        if (startIndex < 0 || startIndex >= size) {
            throw new IndexOutOfBoundsException("Invalid startIndex");
        }

        // Создаем новый список для хранения перевернутой части
        MyLinkedListImpl reversedPart = new MyLinkedListImpl();

        // Получаем узел, начиная с которого будем переворачивать список
        Node current = getNode(startIndex);

        // Заполняем новый список элементами начиная с заданного индекса
        while (current != null) {
            reversedPart.add(current.data);
            current = current.next;
        }

        // Переворачиваем новый список
        MyLinkedList reversedList = reverseLinkedList();

        // Заменяем часть оригинального списка на перевернутую
        Node replaceNode = getNode(startIndex - 1);
        replaceNode.next = reversedPart.head;
        reversedPart.tail.next = null;

        return this;
    }

    // Метод для переворота списка между двумя индексами
    public MyLinkedList reverseLinkedList(int startIndex, int endIndex) {
        // Проверяем валидность индексов
        if (startIndex < 0 || endIndex > size || startIndex >= endIndex) {
            throw new IndexOutOfBoundsException("Invalid startIndex or endIndex");
        }

        // Получаем узлы для начала и конца переворота
        Node startNode = getNode(startIndex);
        Node endNode = getNode(endIndex);

        // Сохраняем узел, предшествующий стартовому
        Node prevNode = startNode.prev;

        // Переменная для хранения следующего узла
        Node current = startNode;
        Node next;

        // Переворачиваем узлы между startIndex и endIndex
        while (current != endNode) {
            next = current.next;
            current.next = current.prev;
            current.prev = next;
            current = next;
        }

        // Соединяем перевернутую часть с оригинальным списком
        if (prevNode != null) {
            prevNode.next = endNode.prev;
        } else {
            head = endNode.prev;
        }

        startNode.next = endNode;
        if (endNode != null) {
            endNode.prev = startNode;
        }

        return this;
    }
}
