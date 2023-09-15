package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> arrayList = new ArrayList<>();

        long startTimeHashSet = System.nanoTime();

        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            int num = rand.nextInt(1000);// числа от 0 до 999
            if (hashSet.contains(num))
                hashSet.add(num);
        }

        long endTimeHashSet = System.nanoTime();
        System.out.println("Time taken with HashSet: " + (endTimeHashSet - startTimeHashSet) + " ns");


        // Добавляем только уникальные числа в лист
        long startTimeArrayList = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {
            int num = rand.nextInt(1000);// числа от 0 до 999
            if(!arrayList.contains(num))
                arrayList.add(num);
        }
        long endTimeArrayList = System.nanoTime();
        System.out.println("Time taken with ArrayList: " + (endTimeArrayList - startTimeArrayList) + " ns");
    }
}

