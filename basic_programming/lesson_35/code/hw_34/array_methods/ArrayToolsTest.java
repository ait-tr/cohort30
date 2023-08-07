package hw_34.array_methods;

import hw_34.model.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayToolsTest {

    Integer[] arrNum;
    String[] arrStr;
    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 9, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
        soldiers = new Soldier[]{
                new Soldier("John", 182, 82.3, 81),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("Robin", 182, 69.3, 92),
                new Soldier("Mary", 165, 55.0, 91),
                new Soldier("Anna", 160, 55.0, 88)

        };
    }

    @Test
    void testPrintArray() {
        System.out.println("=============testPrintArray===============");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
        ArrayTools.printArray(soldiers);

    }

    @Test
    void testSearch() {
        System.out.println("=============testSearch===============");
        // для целых чисел
        ArrayTools.printArray(arrNum);
        Integer res = ArrayTools.search(arrNum, 7);
        System.out.println(res);
        assertEquals(1, res);
        assertEquals(-1, ArrayTools.search(arrNum, 100));
        // для строки
        ArrayTools.printArray(arrStr);
        int index = ArrayTools.search(arrStr, "four");
        assertEquals(3, index);
        assertEquals(-1, ArrayTools.search(arrStr, "six"));
        // для Soldiers
        ArrayTools.printArray(soldiers);
        int indexOfSoldier = ArrayTools.search(soldiers, soldiers[3]);
        assertEquals(3, indexOfSoldier);

    }

    @Test
    void searchBoolean() {

    }

    @Test
    void testFindByPredicate() {
        System.out.println("=============testFindByPredicate===============");
        // для целых чисел
        ArrayTools.printArray(arrNum);
        Integer res = ArrayTools.findByPredicate(arrNum, n -> n > 5 && n < 10);
        System.out.println(res);
        res = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(res);
        // для строк
        ArrayTools.printArray(arrStr);
        String str = ArrayTools.findByPredicate(arrStr, s -> s == "two");
        System.out.println(str);
        assertEquals("two", str);
        str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 5);
        System.out.println(str);
        // для Soldier
        ArrayTools.printArray(soldiers);
        Soldier soldier = ArrayTools.findByPredicate(soldiers, soldier1 -> soldier1.getHeight() < 180);
        System.out.println(soldier);
        assertEquals(soldiers[1], soldier);
    }

    @Test
    void testBubbleSort() {
        System.out.println("=============testBubbleSort===============");
        ArrayTools.printArray(arrNum); // как было
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        Integer[] expected = new Integer[]{0, 1, 2, 4, 5, 7, 7, 9, 9};
        assertArrayEquals(expected, arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
        ArrayTools.printArray(soldiers);
        ArrayTools.bubbleSort(soldiers);
        ArrayTools.printArray(soldiers);
    }

    @Test
    void testBubbleSortByComparator() {
        System.out.println("===============testSoldierByName===============");
        ArrayTools.printArray(soldiers);
        // Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        Comparator<Soldier> comparator = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        ArrayTools.bubbleSort(soldiers, comparator);
        ArrayTools.printArray(soldiers);
    }

    // ++++++++++++++++++++++++++++++++++++++++
    @Test
    void testBubbleSortByComparatorInteger() {
        System.out.println("===============testArrNum===============");
        ArrayTools.printArray(arrNum);
        Comparator<Integer> comparatorInt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        };
        ArrayTools.bubbleSort(arrNum, comparatorInt);
        ArrayTools.printArray(arrNum);
    }

    @Test
    void testBubbleSortByComparatorString() {
        System.out.println("===============testArrNum===============");
        ArrayTools.printArray(arrStr);
        Comparator<String> comparatorStr = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        ArrayTools.bubbleSort(arrStr, comparatorStr);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testBubbleSortByComparatorSoldiers() {
        System.out.println("===============testArrNum===============");
        ArrayTools.printArray(soldiers);
        Comparator<Soldier> comparatorSoldiers = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = (int) o1.getWeight() - (int) o2.getWeight();
                if (res != 0) {
                    return res;
                } else {
                    return o1.getHeight() - o2.getHeight();
                }
            }
        };
        ArrayTools.bubbleSort(soldiers, comparatorSoldiers);
        ArrayTools.printArray(soldiers);
    }
}