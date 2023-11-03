package algorithms;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println("Максимальная сумма подмассива: " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        // Инициализируем переменные для хранения максимальной и текущей суммы
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Итерация по массиву начиная со второго элемента
        for (int i = 1; i < nums.length; i++) {
            // Обновляем текущую сумму
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Обновляем максимальную сумму
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

