public class MaxElement {
    public static void main(String[] args) {

        int[] num = { 56, 73, 15, -10, 37, -14, 25, 65, 33, 38 };

        int max = num[1];
        int pointer = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                pointer = i;
            }
        }

        System.out.println("Max element is: " + max);
        System.out.println("Index of max element is: " + pointer);
    }
}
