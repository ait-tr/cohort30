public class Sum {
    public static void main(String[] args) {
        // sum = 1 + 1/2 + 1/3 + ... + 1/10

        long n = 10000; // начальное данное к задаче
        // задаем данные
        // double i = 1;
        System.out.println("Sum is: " + sumOfFraction(n));
    }
    //___________Methods__________

    public static double sumOfFraction(long n) {
        // начинаем цикл
        double sum = 0, i = 1;
        while ( i <= n ) { // пока параметр цикла i меньше или равен n
            sum = sum + 1/i;// накапливаем сумму
            i++; // увеличиваем параметр цикла
        }
        return sum;
    }

    //________ end of Methods______
}
