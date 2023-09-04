package practice;

import java.util.Arrays;

public class Practice {
    // наша реализация ArrayList
    private int[] array; // основное хранилище   null
    private int size;
    private int capacity;

    private boolean isBool; // false

    // какие поля?
    // todo как опредлить сколько элементов в листе храниться и его вместимость (size and capacity)

    public Practice() {
        // что должно быть тут?
        this.array = new int[10];
        this.size = 0;
        this.capacity = 10;
    }

    public Practice(Practice practice) { // что должно быть тут?
        this.array = practice.array;
        this.size = practice.size;
        this.capacity = practice.capacity;
    }

    public Practice(int x) { // 10_000
        array = new int[x];
        this.capacity = x;
        this.size = 0;
    }

    public Practice(String x) {

    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isBool() {
        return isBool;
    }

    public void add(int n) { // 8
        // {1, 3, 4}   size = 3  capacity = 3
        if(size < capacity) {
            array[size] = n;
            size++;
        } else {
            int[] temp = new int[capacity * 2]; // {0, 0, 0, 0, 0, 0}
            temp = Arrays.copyOf(array, capacity * 2); // {1, 3, 4, 0, 0, 0}
            capacity = capacity * 2;
            array[size] = n; //  {1, 3, 4, 8, 0, 0}
            size++; // size = 4;
        }
    }

    //   {1, 2, 3, 4, .f.  n-1, n, n+1} // n
    // x




    // сеттеры геттеры
    public static void main(String[] args) {
        Practice p = new Practice("sdfds");
        System.out.println(p.isBool());
    }
}
