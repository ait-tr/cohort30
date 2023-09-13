package teacher_sandbox;

import practice.House;

import java.util.HashSet;

public class TeacherClasswork {
    public static void main(String[] args) {
        House h1 = new House(2, "123", 50);
        House h2 = new House(2, "345", 50);


        HashSet<House> set = new HashSet<>();
        set.add(h1);
        set.add(h2);

        set.forEach(i -> System.out.println(i));
        System.out.println(h1.equals(h2));
    }


}
