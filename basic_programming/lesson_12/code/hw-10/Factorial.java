public class Factorial {

  //___________________

    public static void main(String[] args) {
        System.out.println("Factorial calculation");
        int n = 16; // это до каакого числа будем вычислять факториал
        int f = factorial(n); // вызов метода с параметром n
        System.out.println("n! = " + f);
    }

//_____________________

    public static int factorial(int n) {
        int res = 1; // переменная для накопления результата
        int i = 1; // начальное значени
        while ( i <= n ){ // пока i растет до n - 1
            res = res * i; // вычисление факториала
            i++; // увеличение параметра цикла
        }
        return res;
    }

}
