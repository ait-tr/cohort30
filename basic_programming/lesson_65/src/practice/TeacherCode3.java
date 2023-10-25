package practice;

public class TeacherCode3 {
    public static void main(String[] args) {
        four();
    }

    // O (2 + n + n + n) -> O(3 * n) -> O(n)
    public static void one() {
        int n = 100;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    // O(n + k) -> O (2 * n) -> O(n)
    static void two() {
        int n = 10;
        int k = 10;

        int[] arrN = new int[n];
        int[] arrK = new int[k];

        for (int i = 0; i < n; i++) {
            // difficult logic
            System.out.print(arrN[i] + " ");
        }

        for (int i = 0; i < k; i++) {
            System.out.print(arrK[i] + " ");
        }
    }


    // O (n * k) -> O (n^2)
    static void three () {
        int n = 100;
        int k = 100;
        int count = 0;

        int[] arrN = new int[n];
        int[] arrK = new int[k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                count++;
            }
        }
        System.out.println(count);
    }


    // O(n * k + p) ->  O(n^2 + p) -> O(n^2 + n) -> O(n^2)
    static void four () {
        int n = 20000;
        int k = 20000;
        int p = 20000;
        int count = 0;

        int[] arrN = new int[n];
        int[] arrK = new int[k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                count++;
            }
        }

        for (int i = 0; i < p; i++) {
            count++;
        }
        System.out.println(count);
    }
}
