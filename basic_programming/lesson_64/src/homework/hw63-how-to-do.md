```java
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeAll
    void setup() {
        System.out.println("Setting up the entire test class...");
    }

    @BeforeEach
    void init() {
        // Создаем новый объект ShoppingCart перед каждым тестом
        cart = new ShoppingCart();
    }

    @AfterEach
    void tearDown() {
        // Очищаем состояние объекта ShoppingCart после каждого теста, если это необходимо
        cart.empty();
    }

    @Test
    @DisplayName("Тест добавления товара в корзину")
    void testAddItem() {
        // Добавляем товар стоимостью 10.0 в корзину
        cart.addItem(10.0);

        // Проверяем, что количество товаров стало равным 1 и общая стоимость равна 10.0
        assertEquals(1, cart.getItemCount(), "Количество товаров должно быть равно 1");
        assertEquals(10.0, cart.getTotalPrice(), "Общая стоимость должна быть равна 10.0");
    }

    @Test
    @DisplayName("Тест очистки корзины")
    void testEmptyCart() {
        // Добавляем товар стоимостью 10.0 в корзину
        cart.addItem(10.0);

        // Очищаем корзину
        cart.empty();

        // Проверяем, что корзина пуста
        assertEquals(0, cart.getItemCount(), "Количество товаров должно быть равно 0");
        assertEquals(0.0, cart.getTotalPrice(), "Общая стоимость должна быть равна 0.0");
    }

    @Test
    @DisplayName("Тест расчета общей стоимости")
    void testTotalPriceCalculation() {
        // Добавляем несколько товаров в корзину
        cart.addItem(10.0);
        cart.addItem(15.0);
        cart.addItem(25.0);

        // Проверяем, что общая стоимость рассчитывается правильно
        assertEquals(50.0, cart.getTotalPrice(), "Общая стоимость должна быть равна 50.0");
    }
}

```

В этих тестах:

- `testAddItem`: Мы проверяем, что после добавления одного товара в корзину количество товаров и общая стоимость
  обновляются соответственно.
- `testEmptyCart`: Мы проверяем, что метод `empty()` действительно очищает корзину.
- `testTotalPriceCalculation`: Мы проверяем, что общая стоимость корзины рассчитывается правильно при добавлении
  нескольких товаров.