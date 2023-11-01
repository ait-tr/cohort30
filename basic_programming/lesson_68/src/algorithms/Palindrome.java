package algorithms;

public class Palindrome {
    public static void main(String[] args) {
        String str = "level";
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Является ли строка палиндромом: " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        // Инициализируем указатели для начала и конца строки
        int left = 0;
        int right = str.length() - 1;

        // Итерация, пока указатели не встретятся
        while (left < right) {
            // Сравниваем символы на позициях указателей
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Сдвигаем указатели
            left++;
            right--;
        }

        // Если все символы совпали, строка является палиндромом
        return true;
    }
}

