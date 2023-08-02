package odd_even_comporator;
/*
Напишите OddEvenComparator, реализующий Comparator с методом compare для сортировки массива целых чисел
в следующем порядке: Четные целые числа должны идти перед нечетными числами.
 */
import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {

        if ((num1 % 2 == 0 && num2 % 2 == 0) || (num1 % 2 != 0 && num2 % 2 != 0)) {
            return num1.compareTo(num2);
        }
        if (num1 % 2 == 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
