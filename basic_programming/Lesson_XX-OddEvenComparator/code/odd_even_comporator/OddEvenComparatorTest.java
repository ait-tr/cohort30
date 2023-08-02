package odd_even_comporator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenComparatorTest {

    private OddEvenComparator oddEvenComparator;

    @BeforeEach
    void setUp() {

        oddEvenComparator = new OddEvenComparator();

    }

    @Test
    void compareTest() {
        assertEquals(0, oddEvenComparator.compare(2, 2));
        assertEquals(-1, oddEvenComparator.compare(2, 3));
        assertEquals(1, oddEvenComparator.compare(5, 2));
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 8, 3, 6, 5, 4, 7, 2, 9, 0, 11, 10};
        System.out.println("Array before sorting:");
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(arr, new OddEvenComparator());
        System.out.println("Array after sorting:");
        for (Integer num : arr) {
            System.out.print(num + " ");
        }

    }
}