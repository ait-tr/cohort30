package practice.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat[] cats; // массив из объектов типа Cat

    @BeforeEach
    void setUp() {
        cats = new Cat[]{
            new Cat("Murzik", 5, "black", 4.8),
                new Cat("Garfild", 12, "gray", 9.0),
                new Cat("Lusy", 3, "white", 4.5),
                new Cat("Ponchik", 6, "red", 6.5)
        };
    }

    @Test
    void catSortTestAge() {
        System.out.println("======== Cats unsorted=============");
        printArray(cats);
        Arrays.sort(cats); // подвергаем сортировке
        System.out.println();// отступил на строку вниз
        System.out.println("======== Cats sorted by age=============");
        printArray(cats);
    }

    @Test
    void catSortName() {
        System.out.println("======== Cats unsorted=============");
        printArray(cats);
        Arrays.sort(cats); // подвергаем сортировке
        System.out.println();// отступил на строку вниз
        System.out.println("======== Cats sorted by name=============");
        printArray(cats);
    }

    @Test
    void catSortComporator(){
        System.out.println("======== Cats unsorted=============");
        printArray(cats);
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return  Double.compare(o1.getWeight(), o2.getWeight());
            }
        };
        Arrays.sort(cats, catComparator); // сортировка с помощью catComporator
        System.out.println("======== Cats sorted by weight=============");
        printArray(cats);

    }



    // ______________Methods____________
    public void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}