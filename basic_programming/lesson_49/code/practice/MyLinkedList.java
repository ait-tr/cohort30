package practice;

import java.util.List;

public interface MyLinkedList {

    // добавляет элемент в конец списка
    boolean add(String data);

    // добавляет элемент по индексу
    boolean add(int index, String data) throws IndexOutOfBoundsException;

    // вставляет (заменяет существующий) элемент в конец списка
    boolean set(int index, String data) throws IndexOutOfBoundsException;

    // добавляет элемент в начало списка
    boolean addFirst(String data);

    // добавляет элемент в конец списка
    boolean addLast(String data);

    // добавляет все элементы листа в конец списка
    boolean addAll(List<String> list);

    // проверяет наличие данного элемента в списке
    boolean contains(String data);

    // возвращает данные ноды по конкретному индексу
    String get(int index) throws IndexOutOfBoundsException;

    // возвращает данные первой ноды
    String getFirst();

    // возвращает данные последней ноды
    String getLast();

    // возвращает количество элементов
    int size();

    // возвращает индекс первого вхождения данных, либо -1, если такого нет
    int indexOf(String data);

    // возвращает индекс первого вхождения данных, либо -1, если такого нет
    int firstIndexOf(String data);

    // возвращает индекс последнего вхождения данных, либо -1, если такого нет
    int lastIndexOf(String data);
}
