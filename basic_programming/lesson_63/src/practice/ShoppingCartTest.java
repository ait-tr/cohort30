package practice;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeAll
    void setup() {
        // Здесь вы можете выполнить инициализацию, которая должна произойти один раз для всего тестового класса
    }

    @BeforeEach
    void init() {
        // TODO: Создайте новый объект ShoppingCart перед каждым тестом
    }

    @AfterEach
    void tearDown() {
        // TODO: Очистите состояние объекта ShoppingCart после каждого теста, если это необходимо
    }

    @Test
    @DisplayName("Тест добавления товара в корзину")
    void testAddItem() {
        // TODO: Проверьте, что после добавления товара в корзину количество товаров и общая стоимость обновляются правильно
    }

    @Test
    @DisplayName("Тест очистки корзины")
    void testEmptyCart() {
        // TODO: Проверьте, что после вызова метода empty() корзина очищается правильно
    }

    @Test
    @DisplayName("Тест расчета общей стоимости")
    void testTotalPriceCalculation() {
        // TODO: Проверьте, что общая стоимость товаров в корзине рассчитывается правильно
    }

    // Добавьте дополнительные тестовые методы по мере необходимости
}

