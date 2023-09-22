package teacher_code;

import java.util.*;

public class Consultation {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(15);
        String[] arr = new String[15];

        list.add("one");
        list.add("two");
        list.add("one");

        arr[0] = "one";
        arr[1] = "two";
        arr[2] = "one";
        // ...
        arr[14] = "qwe";


        // чтобы положить в arr доп элементы, где все ячейки уже заняты
        // надо самому думать, как увеличить размер данного массива, чтобы прибавить к нему
        // пустые ячейки
        String[] arrTemp = new String[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arrTemp[i] = arr[i];
        }
        arr = arrTemp;
        //  arr -       [one, two, one ... qwe]
        //  arrTemp -   [one, two, one ... qwe, null, null, null, , , , , , ]

        String x = "qwe";
        boolean contains = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(x)) {
                contains = true;
                break;
            }
        }

        LinkedList<String> stringLinkedList = new LinkedList<>();
        // [data1]  ->  [data2] -> [data3]
    }
}
