package hw_35;

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
        // или так
        // cats[0] = new Cat("Vaska", 7, "yellow", 6.0);
        // ...
    }

    @Test
    void testSort(){
        printArray(cats, "Original array");
        Arrays.sort(cats); // метод sort - сортирует в "естественном" прядке, который определен в классе Cat
        printArray(cats, "Sorting by age");
    }

    public void printArray(Object[] arr, String string){
        System.out.println("=========" + string + "=============");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("====================================");
    }

    @Test
    void testBinarySearch(){
        // бинарный поиск работает ТОЛЬКО с ОТСОРТИРОВАННЫМ МАССИВОМ
     // печать массива как есть
    printArray(cats, "Original array");
    // сортировка компаратором по весу
        Comparator<Cat> catComparator = Comparator.comparing(Cat :: getWeight);
        Arrays.sort(cats,catComparator);
        printArray(cats, "Sorting by weight");
    // поиск BinarySearch существующего элемента
        Cat  pattern = new Cat("", 0, "", 9.0);
        int index = Arrays.binarySearch(cats, pattern, catComparator);
        System.out.println(index);
    // поиск BinarySearch НЕсуществующего элемента
        Cat  pattern1 = new Cat("", 0, "", 5.0);
        int index1 = Arrays.binarySearch(cats, pattern1, catComparator);
        System.out.println(index1);
    }
}