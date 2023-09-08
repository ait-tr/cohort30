package practice.teacher_sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TeachersSandbox3 {
    // примеры работы LinkedList
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();


        // в LinkedList 2 конструктора - пестой и который принимает экземпляр класса Collections
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        // "one" -> "two" -> "three"

        linkedList.get(1); // возвращеат элемент под указанным индексом
                                                                                //3
        linkedList.add(1, "four"); // "one" -> "four" -> "two" -> "three"
        linkedList.set(1, "five"); // "one" -> "five" -> "two" -> "three"

        linkedList.size(); // вернет количество элементов в листе (число)


        linkedList.add("four"); // "one" -> "five" -> "two" -> "three" -> "four"
        linkedList.add("three"); // "one" -> "five" -> "two" -> "three" -> "four" -> "three"

        //удаляет первое вхождение элемнета в массив:
        linkedList.remove("three"); // "one" -> "five" -> "two" -> "four" -> "three"

        linkedList.add(3, "three"); // "one" -> "five" -> "two" -> "three" -> "four" -> "three"

        // удаляет элемент по индексу:
        linkedList.remove(5); // "one" -> "five" -> "two" -> "three" -> "four"


        linkedList.removeLast(); // удаляет первый элемент
        linkedList.removeLast(); // удаляет последний элемент

        linkedList.removeLastOccurrence("erg"); // удаляет последнее вхождение данного объекта
        linkedList.removeFirstOccurrence("erg"); // удаляет первое вхождение данного объекта

        linkedList.addAll(arrayList); // позволяет добавить коллекцию

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // arrayList  [one][two][three] .add(1, "four") ->
        // [one][two][three][] ->  [one][two][][three] -> [one][][two][three] -> [one][four][two][three]

        // file1 -> ArrayList<FUTURES> -> validation -> Collection<FUTURES> afterValidation -> file2
    }
}
