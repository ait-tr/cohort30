package hw_13;

public class SumOfEvenIndexEl {
    public static void main(String[] args) {
        int[] a = {12, 45, 3, 6, 43, 98, 6};
        System.out.println(sumOfEvenIndex(a));
    }

    public static int sumOfEvenIndex (int[] arr) {
        int index = 1;
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index % 2 == 0) {
                evenSum = evenSum * arr[i];
            }
        }
        return evenSum;
    }
}
