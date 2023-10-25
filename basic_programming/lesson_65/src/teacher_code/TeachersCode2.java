package teacher_code;

import java.util.Arrays;

public class TeachersCode2 {
    // bubble sort O(n^2)
    public static void main(String[] args) {
        int[] arr = {-1, 87, 6, -15, 92, 22, 31, -48, 54, 6};
        //int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            boolean sorted  = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            System.out.println("i = " + (i + 1)+ " : "+ Arrays.toString(arr));
            if (sorted)
                break;
        }
    }
}
