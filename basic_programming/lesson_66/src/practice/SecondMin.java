package practice;

public class SecondMin {
    public static void main(String[] args) {
        int[] nums = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE - 1};

        int min = nums[0];
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                secondMin = min;
                min = nums[i];
            } else if (secondMin > nums[i] && nums[i] != min) {
                secondMin = nums[i];
            }
        }

        System.out.println(min);
        System.out.println(secondMin);
    }
}
