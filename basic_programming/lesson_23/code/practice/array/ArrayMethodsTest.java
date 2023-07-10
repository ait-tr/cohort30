package practice.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest extends ArrayMethods {

    ArrayMethods arrayMethods; // создали объект тестируемого класса

    @BeforeEach
    void setUp() {
       arrayMethods = new ArrayMethods();
    }

    @Test
    void sumElOfArrayTest() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(10, arrayMethods.sumElOfArray(arr));
    }

    @Test
    void sumElOfOddIndexTest() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(6, arrayMethods.sumElOfOddIndex(arr));
    }

}