package hw_23.array_methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array100RandomTest {

    Array100Random array100Random;
    @BeforeEach
    void setUp() {
        array100Random = new Array100Random();
    }

    @Test
    void zeroCountTest() {
        int[] arr = {100, 0, -50, 200, 0};
        assertEquals(2, array100Random.zeroCount(arr));
    }

    @Test
    void positiveCountTest() {
        int[] arr = {100, -10, -50, 200, 0};
        assertEquals(2, array100Random.positiveCount(arr));
    }

    @Test
    void evenCountTest() {
        int[] arr = {100, -10, 51, 201, 0};
        assertEquals(3, array100Random.evenCount(arr));
    }
}