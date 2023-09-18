package teacher_code;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TeachersCode2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(34, "Ilyas");
        map.put(21, "Alexandru");
        map.put(309, "Dmitry");
        map.put(45, "Elena");
        map.put(15, "Alla");
        map.put(689, "Natalie");
        map.put(-347, "Radu");
        map.put(0, "Sandor");
        map.put(901, "Sergey");
        map.put(101, "Vyacheslav");

        map.put(null, "AIT");
        map.put(null, "SCHOOL");

        map.put(764, null);
        map.put(876, null);
        map.put(134, null);

        if (!map.containsKey(34)) {
            map.put(34, "Vasya Pupkin");
        }


        Map<Integer, String> anotherMap = new HashMap<>();
        // Map<Integer, String> anotherMap = new HashMap<>(map);
        anotherMap.putAll(map);

//        for (Integer i : anotherMap.keySet()) {
//            System.out.printf("Key %d : value %s\n", i, anotherMap.get(i));
//        }

        if (map.containsKey(689))
            System.out.println("Key 689 " +  map.get(689));
        if (map.containsKey(1_000_000))
            System.out.println("Key 1_000_000 " +  map.get(1_000_000));
        if (map.containsKey(764))
            System.out.println("Key 764 " +  map.get(764));

        System.out.println(map.containsValue("Ilyas"));
        System.out.println(map.containsValue("Vasya Pupkin"));

        System.out.println(map.remove(34));
        System.out.println(map.containsValue("Ilyas"));
        System.out.println(map.get(34));

        System.out.println(map.remove(555));
        System.out.println(map.get(555));

        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println("++++++++++++++++++++++");
        map.values().forEach(i -> System.out.println(i));
    }

}
