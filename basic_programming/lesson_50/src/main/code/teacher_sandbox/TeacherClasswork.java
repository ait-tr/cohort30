package main.code.teacher_sandbox;

import main.code.practice.House;

import java.util.HashSet;

public class TeacherClasswork {
    public static void main(String[] args) {
        House h1 = new House(2, "123", 50);
        House h2 = new House(2, "3454", 49);


        HashSet<House> set = new HashSet<>();
        set.add(h1);
        set.add(h2);

        set.forEach(i -> System.out.println(i));
        System.out.println(h1.equals(h2));
        System.out.println("h1 hash = " + h1.hashCode());
        System.out.println("h2 hash = " + h2.hashCode());
    }


}
