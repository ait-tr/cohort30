public class Main3 {
    public static void main(String[] args) {
        System.out.println("Вычислите cтоимость суммы товара A + B со скидкой  и абсолютную величину скидки для этой покупки." );
        int nproductA = 1000;
        int nproductB = 500;
        int namount = nproductA + nproductB;
        int nabsoluteDiscountAmount = namount *10 / 100;
        int nreducedCosts =  namount - nabsoluteDiscountAmount;
        System.out.println("Cтоимость суммы  товара A + B со скидкой: " + nreducedCosts );
        System.out.println("Абсолютная величина скидки " + nabsoluteDiscountAmount);
    }
}