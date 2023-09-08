package practice.lesson_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Classwork47 implements Iterator, Iterable<Classwork47> {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add("one"); // String
        list.add(1L); // Long
        list.add(1.4); // Double

        for (Object o : list) {
            System.out.println(o.getClass());
        }

        Classwork47 cw = new Classwork47();
        while (cw.hasNext()) {
            cw = cw.next();
        }

    }

    // A -> B -> C -> D -> E -> F
    // Iterable дает возможность вызвать foreach и перебрать все элементы от первого до последнего
    // автоматически

    // Iterator позволяет взять любой объект и узнать, есть ли следующий в списке:
    //  F.hasNext() -> false
    //

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Classwork47 next() {
        return null;
    }



    @Override
    public Iterator<Classwork47> iterator() {
        return null;
    }
}

interface A {

    /**
     * Этот метот печатает текщее время
    */
    void print();

}

interface B  {
    /**
     * Этот метот печатает текщюю дату
     */
    void print();
}

interface TypeCCharging {
    void chargeByTypeC();
}

class Work{
    public void print() {
        System.out.println("Hello");
    }

    public void print(String name) {
        System.out.println("Hello " + name);
    }
}
