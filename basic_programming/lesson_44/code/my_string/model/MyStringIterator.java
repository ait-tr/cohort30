package my_string.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    // поля
    private StringBuilder str;
    private int size;
    private int currPosition;

    //конструктор
    public MyStringIterator(StringBuilder str){
        this.str = str;
        size = str.length();
       // currPosition = 0;
    }

    // метод 1 - проверяет, есть ли следующий
    @Override
    public boolean hasNext() {
        return currPosition < size; // логическое выражение, которое отражает логику наличия
    }

    // метод 2 - возвращает элемент
    @Override
    public Character next() {
        Character curCharacter = str.charAt(currPosition);
        currPosition++;
        return curCharacter;
    }

    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }

}
