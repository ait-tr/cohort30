package teacher_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class TeacherCode2 {
    private static ArrayList<Integer> arrayList = new ArrayList<>(100_000);
    private static Vector<Integer> vector = new Vector<>(100_000);
    private static CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    private static int count = 10_000;

    private static void startAdding(List<Integer> list) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                list.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                list.add(i);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(0);

        long startAL = System.nanoTime();
        startAdding(arrayList);
        System.out.println("ArrayList.size: " + arrayList.size() + ", time to fill ArrayList: " + (System.nanoTime() - startAL) + "ns");                  //   4731458ns 5123083ns 4603750ns

        // for ArrayList
        //        thread1.start(); -> add
        //        thread2.start(); -> add
        //        thread3.start(); -> add
        // lastIndex  = 4
        // thread1 -> arraylist.add(lastIndex, 301)
        // thread2 -> arraylist.add(lastIndex, 178)
        // thread3 -> arraylist.add(lastIndex, 97)

        // {1, 2, 3, 4,  ...}

        // for Vector
        //        thread1.start(); -> add
        //        thread2.start(); -> add
        //        thread3.start(); -> add
        // lastIndex  = 4
        // synchronized
        //      thread1 -> arraylist.add(lastIndex, 301)

        // lastIndex  = 5
        // synchronized
        //      thread2 -> arraylist.add(lastIndex, 178)

        // lastIndex  = 6
        // synchronized
        //      thread3 -> arraylist.add(lastIndex, 97)



        // for CopyOnWriteArrayList
        //        thread1.start(); -> add
        //        thread2.start(); -> add
        //        thread3.start(); -> add
        // temp = Arrays.copyOf(copyOnWriteArrayList)
        //      thread1 -> temp.add(301)
        // if(// проверка на корректность изменения CAS)
        //      copyOnWriteArrayList = temp;


        // temp = Arrays.copyOf(copyOnWriteArrayList)
        //      thread2 -> temp.add(178)
        // if(// проверка на корректность изменения CAS)
        //      copyOnWriteArrayList = temp;

        // temp = Arrays.copyOf(copyOnWriteArrayList)
        //      thread3 -> temp.add(97)
        // if(// проверка на корректность изменения CAS)
        //      copyOnWriteArrayList = temp;


        long startV = System.nanoTime();
        startAdding(vector);
        System.out.println("Vector.size: " + vector.size() + ", time to fill Vector: " + (System.nanoTime() - startV) + "ns");                             //   6896959ns 7141209ns 7491916ns

        long startCW = System.nanoTime();
        startAdding(copyOnWriteArrayList);
        System.out.println("CopyOnWriteArrayList.size: " + vector.size() + ", time to fill CopyOnWriteArrayList: " + (System.nanoTime() - startCW) + "ns");  // 201501584ns 175023750ns 191305916ns
    }
}
