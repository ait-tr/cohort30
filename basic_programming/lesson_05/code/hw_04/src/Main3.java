public class Main3 {
    public static void main(String[] args) {

//        Пусть цена товара A обычно составляет 1000 евро, и товара B составляет 500 евро.
//        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
//        Выведите на экран стоимость суммы A + B со скидкой.
//        Отдельно выведите на экран абсолютную величину скидки для этой покупки.

        System.out.println("Вычислите cтоимость суммы товара A + B со скидкой  и абсолютную величину скидки для этой покупки." );

        int productA;  // объявили перменную
        productA = 1000; // задаем значение прямо в коде

        int productB; // объявили перменную
        productB = 500; // задаем значение прямо в коде

        int amount = productA + productB; // сумма вместе
        double discount = 0.1; // определяем скидку

        double absoluteDiscountAmount = amount * discount; // вычисляем скидку
        double reducedCosts =  amount - absoluteDiscountAmount;
        System.out.println("Cтоимость суммы  товара A + B со скидкой: " + reducedCosts );
        System.out.println("Абсолютная величина скидки " + absoluteDiscountAmount);

    }
}