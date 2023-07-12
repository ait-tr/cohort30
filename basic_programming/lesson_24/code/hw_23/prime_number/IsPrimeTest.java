package hw_23.prime_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    IsPrime isPrime; // это поле

    @BeforeEach
    void setUp() {
        isPrime = new IsPrime(); // это инициализация объекта, new - это вызов конструктора
    }

    @Test //
    void isPrimeNumberTest1() {
        int n = 17;
        assertTrue(isPrime.isPrimeNumber(n));
    }

    @Test
    void isPrimeNumberTest2() {
        int m =22;
        assertFalse(isPrime.isPrimeNumber(m));
    }


}