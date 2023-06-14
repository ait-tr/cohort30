public class Sum {
    public static void main(String[] args) {
        int n = 100000;
        int i = 1;
        int sum = 0;
        // начинаем цикл
        while ( i < n ) {
            sum = sum + 1/i;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}
