package teacher_code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.pow;

public class TeacherCode {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ArrayList<Integer> listForLoop = new ArrayList<>();
        List<Integer> listForStream = new LinkedList<>();

        //
        for (int i = 0; i < list.size(); i++) {
            // ожидаем увидеть тут логику
            int y = list.get(i) * list.get(i);
            listForLoop.add(y); // []
        }

        // конвейерные операции не будут выполнены если нет терминальной
        listForStream = list.stream()
                .map(y -> y * y)
                .collect(Collectors.toList());

        System.out.println("listForLoop: " + listForLoop);
        System.out.println("listForStream: " + listForStream);
        System.out.println("listForStream class name: " + listForStream.getClass().getSimpleName());
    }


    static long recursiveExample(long x) {
        if (x == 1) {
            return x;
        }
        return x + recursiveExample(x - 1);
    }


    static long noRec(long x) {
        long result = 1;

        while (x > 1) {
            result = x + result;
            x --;
        }
        return result;
    }
}
