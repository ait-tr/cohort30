package algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountNumberNiceSubarrays {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 7};
        int result = numberOfSubarrays(nums, 3);
        System.out.println("Количество подмассивов с 3 нечетными числами: " + result);
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int left = 0, right = 0;
        int oddCount = 0;
        int ans = 0;
        int count = 0; // Для подсчета подмассивов, которые заканчиваются на том же нечетном числе

        while (right < nums.length) {
            // Увеличиваем счетчик нечетных чисел, если текущий элемент нечетный
            if (nums[right] % 2 != 0) {
                oddCount++;
                count = 0; // Сброс счетчика, так как нашли новое нечетное число
            }

            // Если нашли k нечетных чисел, начнем двигать left
            while (oddCount == k) {
                if (nums[left] % 2 != 0) {
                    oddCount--; // Уменьшаем счетчик нечетных чисел
                }
                count++; // Увеличиваем счетчик подмассивов
                left++; // Двигаем left вправо
            }

            // Добавляем count к итоговому результату
            ans += count;

            // Двигаем right вправо
            right++;
        }

        return ans;
    }
}
