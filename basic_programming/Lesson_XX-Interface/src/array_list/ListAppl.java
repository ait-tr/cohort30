package array_list;

import array_list.interfaces.IList;
import array_list.model.MyArrayList;

public class ListAppl {
    public static void main(String[] args) {
        IList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(20);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(null);
        list.add(7);
        System.out.println(list.get(0));
        System.out.println(list.get(4));
  //       System.out.println(list.get(10));
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(9));
        System.out.println(list.contains(19));
        System.out.println(list.contains(null));
        System.out.println(list.indexOf(null));

        System.out.println("=============Test HW=============");

    }
}
