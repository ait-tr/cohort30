package practice.teacher_sandbox;


import practice.city_bus.BusStopNode;

public class TeachersSandbox2 {
    // разбор LinkedList
    public static void main(String[] args) {
        BusStopNode berlin = new BusStopNode("Berlin");
        BusStopNode munich = new BusStopNode("Munich");

        berlin.setNext(munich);

        berlin.getNext();
        munich.getNext();

        munich.setNext(berlin);



    }

    // пример класса не обязательный к применению
    class Node {
        Object data; // данные
        Node next; // ссылка на следующую ноду
    }

    // [0][1][2][3][4]

    // LinkedList.size() -> количество нод в цепи
    //index:         0                  1                  2                    3
    //       <- [Ul Pushkina] <-> [Prospekt Mira] <-> [Ul Lenina]    <->     [Ul N-ya] - >
    //                |                 |                  |                    |
    //            посуда            одежда              книги                техника
    //              head                                                      tail
    //      (начало или голова)                                          (хвост или конец)

    //
}
