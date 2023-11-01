package teacher_code;

import java.util.*;

public class TeacherCode {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        boolean flag = false;
//
//        // validation process  (если хоть одно значение в процессе валидации, ) flag -> true
//
//        methodOne(map);
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        LinkedList<String> linkedList = new LinkedList<>();
//        Vector<String> vector = new Vector<>();
//
//        newMethod(arrayList);
//        newMethod(linkedList);
//        newMethod(vector);
        Vehicle vehicle1 = Vehicle.init();
        Vehicle vehicle2 = Vehicle.init();
        vehicle2.setWheels(100);

        //vehicle.setWheels(100);
        System.out.println(vehicle1.toString());
    }


    static void newMethod(List<String> list) {
        list.add("hello");
    }

    static void methodOne(Map map) {
        // some logic

    }

    static void methodTwo (Map map) {
        //  other logic
    }

    static void validation(Map map) {
        // some validation processes

        // methodOne
        // MethodTwo
    }





}