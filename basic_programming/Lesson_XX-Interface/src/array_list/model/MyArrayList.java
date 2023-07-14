package array_list.model;

import array_list.interfaces.IList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements IList<E> {
    // поля
    private Object[] elements;

    private int size;

    // методы
    // конструктор дефолтный
    public MyArrayList() {
        // elements = new Object[10]; // создаем стартовый массив из объектов
        this(10); // вызвал
    }

    // конструктор перегруженный
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0 ){
            throw new IllegalArgumentException("Illegal capacity = " + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }

    // вычисл. сложность константа
    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    // вычисл. сложность O(1) - константа через некоторое время
    @Override
    public boolean add(E element) {
        encureCapacity();
        elements[size] = element;
        size++;
        return true;
    }

    private void encureCapacity(){
        if(size == elements.length){
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError();
            }
            int newCapacity = elements.length + elements.length / 2; // увеличиваем размер
            if (newCapacity < 0 ){ // если зашли за MAX_VALUE, то получили отрицательное число
                newCapacity = Integer.MAX_VALUE; // даем максимальное значение длине массива
            }
            elements = Arrays.copyOf(elements, newCapacity);  // копируем массив в массив с новым размером
        }
    }

    @Override
    public boolean add(int index, E element) {
        //TODO
        return false;
    }

    // O(1)
    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) { // если подали несуществующий индекс
            throw new IndexOutOfBoundsException(index); //
        }
    }

    // O(1)
    @Override
    public int indexOf(Object o) {
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if(o.equals(elements[i])){
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o == (elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        //TODO
        return 0;
    }

    @Override
    public E remove(int index) {
        // TODO
        return null;
    }

    @Override
    public E set(int index, E element) {
        // TODO
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        };
    }
}
