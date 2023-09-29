package teacher_code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherCode {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cherry", null);
        List<Integer> output = new ArrayList<>();

//        for(String s : input) {
//            output.add(s.length());
//        }

        // 1. запускаем поток данных
        input.stream()
                //2. Выбор конвейерной операции. То как будет проиходить перебор элементов в коллекции
                // выполняем конвейерную операцию!! любую подходящую

                // .filter(i -> i != null) // условие прохождения элемента на дальнейшую опбработку, в данном случае элемент не должен быть равен null
                .map(String::length) // ссылка на метод length, то есть будет выполняться метод length из класса String
                                     // для каждого отдельного элемента в потокеб после чего резултат выполнения этого метода пойдет дальше
                //.map(i -> i.length()) // прямой вызов метода .length() класса строк, те мы говорим, что для каждого элемента "i"
                                        // следует вызвать метод .length()

                // мы можем также использовать mapToInt так как мы будем работать в дальнейшем с целыми числами:
                //.mapToInt(String::length)
                //.mapToInt(i -> i.length())


                // после конвейерной операции обязательно должна стоять терминальная, тк без терминальной поток банально не запуститсья
                // .collect(Collectors.toList()); // добавит все результаты в новый лист и вернет его
                // .toArray(Integer[]::new); // добавит все результаты в новый массив и вернет его
                // .forEach(i -> output.add(i)); // выполнит операцию для каждого отдельного элемента, в данном случае операция будет "output.add(i)"
                .forEach(output::add); // выполнит операцию add в output для каждого отдельного элемента


        System.out.println(output);

        List<Integer> inputInt = Arrays.asList(1, 2, 3, 4, 5);

        long x = 0;

        x = inputInt.stream()
                .filter(i -> i % 2 == 0)
                .count();

        System.out.println(x);

    }


}
