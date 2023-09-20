package teacher_code;

import java.util.ArrayList;
import java.util.LinkedList;

public class TechersCode3 {
    public static void main(String[] args) {
        int capacity = 16;
        ArrayList<LinkedList<String>> buckets = new ArrayList<>(capacity);
        for (int i = 0; i < 16; i++) {
            buckets.add(new LinkedList<String>());
        }

        String str1 = "one";
        int hash1 = str1.hashCode();
        int indexOfBucket1 = hash1 % capacity;
        System.out.println(str1 + " hashCode = " + hash1 + " bucket number = hashCode % 16 = " + (hash1 % capacity));

        String str2 = "two";
        int hash2 = str2.hashCode();
        int indexOfBucket2 = hash2 % capacity;
        System.out.println(str2 + " hashCode = " + hash2 + " bucket number = hashCode % 16 = " + (hash2 % capacity));

        String str3 = "three";
        int hash3 = str3.hashCode();
        int indexOfBucket3 = hash3 % capacity;
        System.out.println(str3 + " hashCode = " + hash3 + " bucket number = hashCode % 16 = " + (hash3 % capacity));

        String str4 = "four";
        int hash4 = str4.hashCode();
        int indexOfBucket4 = hash4 % capacity;
        System.out.println(str4 + " hashCode = " + hash4 + " bucket number = hashCode % 16 = " + (hash4 % capacity));

        String str5 = "five";
        int hash5 = str5.hashCode();
        int indexOfBucket5 = hash5 % capacity;
        System.out.println(str5 + " hashCode = " + hash5 + " bucket number = hashCode % 16 = " + (hash5 % capacity));

        if (!buckets.get(indexOfBucket1).contains(str1)) // если в данной корзине, в данном линкед листе нет такого объекта, то только в этом случае я его туда добавлю
            buckets.get(indexOfBucket1).add(str1); // = LinkedList<String> list1 = buckets.get(indexOfBucket1);   list.add(str1);

        if (!buckets.get(indexOfBucket2).contains(str2))
            buckets.get(indexOfBucket2).add(str2); // = LinkedList<String> list2 = buckets.get(indexOfBucket2);   list.add(str2);

        if(!buckets.get(indexOfBucket3).contains(str3))
            buckets.get(indexOfBucket3).add(str3); // = LinkedList<String> list3 = buckets.get(indexOfBucket2);   list.add(str2);

        // тк indexOfBucket1 == indexOfBucket4 = 6, получается, что str1 и str4 будут находиться в одной ячейке и в одном LinkedList
        if(!buckets.get(indexOfBucket4).contains(str4))
            buckets.get(indexOfBucket4).add(str4); // = LinkedList<String> list1 = buckets.get(indexOfBucket4);   list.add(str4);

        System.out.println("=============================");
        for (LinkedList<String> bucket : buckets) {
            System.out.println(bucket);
        }
    }
}
