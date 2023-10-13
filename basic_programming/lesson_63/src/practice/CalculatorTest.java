package practice;

import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    // Метод, который будет вызываться перед каждым тестовым методом
    @BeforeEach
    void setUp() {
        // Инициализируем объект calculator перед каждым тестом
        calculator = new Calculator();
    }

    // Метод, который будет вызываться после каждого тестового метода
    @AfterEach
    void tearDown() {
        // Освобождаем ресурсы после каждого теста, если это необходимо
        calculator = null;
    }

    // Тестовый метод
    @Test
    @DisplayName("Проверка сложения двух чисел")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 должно быть равно 5");
    }

    // Тестовый метод с исключением
    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
        assertDoesNotThrow(() ->calculator.divide(10, 3));
    }

    // Отключенный тестовый метод
    @Disabled("Тест выключен")
    @Test
    @DisplayName("Пример отключенного теста")
    void disabledTest() {
        assertEquals(4, calculator.multiply(2, 2));
    }


    // Вложенный тестовый класс
    @Nested
    @DisplayName("Тесты умножения")
    class MultiplyTests {

        @Test
        @DisplayName("Проверка умножения двух положительных чисел")
        void testPositiveNumbers() {
            assertEquals(6, calculator.multiply(2, 3), "2 * 3 должно быть равно 6");
        }

        @Test
        @DisplayName("Проверка умножения положительного и отрицательного чисел")
        void testPositiveAndNegativeNumbers() {
            assertEquals(-6, calculator.multiply(2, -3), "2 * (-3) должно быть равно -6");
        }
    }

    // Динамическая генерация тестов
    @TestFactory
    @DisplayName("Динамически созданные тесты для сложения")
    Stream<DynamicTest> dynamicTestsForAddition() {
        // Примеры входных и ожидаемых данных
        Map<List<Integer>, Integer> inputAndExpected = Map.of(
                List.of(1, 2), 3,
                List.of(3, 4), 7,
                List.of(5, 6), 11
        );

        // Возвращаем поток динамически созданных тестов
        return inputAndExpected.entrySet().stream()
                .map(entry -> DynamicTest.dynamicTest("Тест сложения " + entry.getKey().get(0) + " и " + entry.getKey().get(1),
                        () -> assertEquals(entry.getValue(), calculator.add(entry.getKey().get(0), entry.getKey().get(1)))));
    }
}

