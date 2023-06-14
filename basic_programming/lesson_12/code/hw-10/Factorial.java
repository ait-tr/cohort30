public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial calculation");
        int n = 20;
        int f = factorial(n);
        System.out.println("n! = " + f);
    }
    public static int factorial(int n) {
        int res = 1;
        int i = 1;
        while (i < n){
            res = res * i;
            i++;
        }
        return res;
    }
}
