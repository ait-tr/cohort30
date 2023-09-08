package practice.teacher_sandbox;

import java.util.ArrayList;

public class TeachersSandbox {
    public static void main(String[] args) {
        // <> - обозначает generic тип данных, если не указать,
        // "ArrayList list" - сможет принимать любые ссылочные объекты (Object)
        // если указать конкретный тип, то только объекты этого типа, напримар:
        // "ArrayList<String> list" - будет хранить исключительно String

        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();

        list1.add("list1-1");
        list1.add("list1-2");
        list1.add("list1-3");

        list2.add("list2-1");
        list2.add("list2-2");
        list2.add("list2-3");


        // "ArrayList<ArrayList<String>> listArrayList " - хранит в себе лист аррей листов,
        // (лист ArrayList<String>) и ничего другого
        ArrayList<ArrayList<String>> listArrayList = new ArrayList<>();

        listArrayList.add(list1);
        listArrayList.add(list2);

        //внешний цикл - перебирает все элементы, которые находятся внутри listArrayList, то есть, перебирает все
        // вложенные в него ArrayList. В нашем примере это list1 и list2
        // (чтобы их получить используем listArrayList.get(i))
        for (int i = 0; i < listArrayList.size(); i++) {
            // при помощи второго вложенного цикла получаем доступ к элементам конкретного ВЛОЖЕННОГО листа,
            // то есть получаем содержимое list1 и list2
            // чтобы их получить listArrayList.get(i).get(i1), где
            // get(i) - вытащит конкретный массив из нашего массива массивов,
            // а get(i).get(i1) - вытащит конкретную строку из массива, который мы вытащили
            for (int i1 = 0; i1 < listArrayList.get(i).size(); i1++) {
                System.out.println(listArrayList.get(i).get(i1));
            }
        }

        // listArrayList(list1, list2)
        listArrayList.get(0).add("hello"); // при помощи listArrayList.get(0) - получили доступ

        // [{1, 2, 3 }, {4, 5, 6}]
        // создали двумерный массив целых чисел (int), то есть массив, который содержит массивы чисел
        int[][] twoDimArrayFullEmptyInit = new int[2][3]; // [{0,0,0}, {0,0,0}]

        int[][] twoDimArrayWithoutInit = new int[2][]; // [null, null]

        int[][] twoDimArrayFullInit = {{1, 2, 3}, {4, 5, 6, 7, 8}}; // проинициализировали двмерный массив значениями


        twoDimArrayFullEmptyInit[0][0] = 5; // [{5,0,0}, {0,0,0}]
        twoDimArrayFullEmptyInit[1][1] = 7; // [{5,0,0}, {0,7,0}]
        twoDimArrayFullEmptyInit[1] = new int[]{15, 16, 17}; // [{5,0,0}, {15, 16, 17}]

        twoDimArrayWithoutInit[1] = new int[]{-17, 0, 17}; // [null, {-17, 0, 17}]
        twoDimArrayWithoutInit[1][1] = 23; // [null, {-17, 23, 17}]

        twoDimArrayFullInit[1]  = new int[]{8, 10, 12}; // {{1, 2, 3}, {8, 10, 12}}
        int x = twoDimArrayFullInit.length; // 2 - сколько массивов храниться в массиве twoDimArrayFullInit

        int y = twoDimArrayFullInit[0].length + twoDimArrayFullInit[1].length; // сколько элементов храниться в массиве [0] + [1]


    }
}
