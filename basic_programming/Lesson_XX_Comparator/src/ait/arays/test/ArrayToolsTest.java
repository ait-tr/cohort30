package ait.arays.test;

import ait.arays.utils.ArrayTools;
import ait.soldier.model.Soldier; // импорт модели Солдат
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayToolsTest {

    Integer[] arrNum;

    Integer[] arrOrigin;

    String[] arrStr;
    Soldier[] soldiers;

    @BeforeEach
    void setup() {
        //массив для ДЗ
        arrOrigin = new Integer[]{5, 8, -2, 25, 0, -10, 77, 11, 17};

        arrNum = new Integer[] {9, 7, 4, 7, 2, 5, 9, 1, 0};
        arrStr = new String[] {"one", "two", "three", "four", "five"};
        soldiers = new Soldier[]{
                new Soldier("John", 182, 85, 91),
                new Soldier("Peter", 172, 75, 75),
                new Soldier("Robin", 162, 69.3, 82),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88),

        };
    }

    @Test
    void testPrintArray(){
        System.out.println("======testPrintArray=======");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testSearch(){
        System.out.println("======testSearch=======");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index = " + index);
    }

    @Test
    void testFindByPredicate(){
        Integer res = ArrayTools.findByPredicat(arrNum, n -> n < 5);
        System.out.println(res);
        res = ArrayTools.findByPredicat(arrNum, n -> n%5 == 0);
        System.out.println(res);
        String str = ArrayTools.findByPredicat(arrStr, s -> s.length() == 4);
        System.out.println(str);
    }

    @Test
    void testBubbleSort(){
        System.out.println("========test Boubble Sort ===========");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
        ArrayTools.printArray(soldiers);
        ArrayTools.bubbleSort(soldiers);
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testSortSoldiresByName(){
        System.out.println("========test SortSoldiresByName ===========");
        // ArrayTools.bubbleSort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName())); // сортировка по именам
        Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName())); // сортировка по именам с помощью Arrays и его метода sort
        ArrayTools.printArray(soldiers); // печать массива после сортировки
    }

}
