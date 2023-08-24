package consultation;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {

        // System.arrayCopy - протестировать
        // заполним массив целыми числами 10, 20, 30, ...

        int[] arrayInt = new int[10]; // объявили массив

        for (int i = 0; i < arrayInt.length; i++) {  //запустили цикл для заполнения массива
            arrayInt[i] = (i + 1) * 10;
            // System.out.println(arrayInt[i]);
        }
        System.out.println(Arrays.toString(arrayInt)); // печатаем массив

        // хотим вставить в массив новый элемент, например, 15 , сохранив при этом порядок сортировки
        // применим BinarySearch для поиска места (индекс), куда вставлять новый элемент массива

        int index = Arrays.binarySearch(arrayInt, 15);
        System.out.println(index);
        // обрабатываем индекс
        index = index >= 0 ? index : - index - 1;
        // увеличиваем массив и копируем исходный массив в новый
        int[] arrayIntCopy = new int[arrayInt.length + 1];
        System.arraycopy(arrayInt, 0, arrayIntCopy, 0, arrayInt.length);
        System.out.println(Arrays.toString(arrayIntCopy));
        // копируем "хвост массива" от элемента с этим индексом вправо на 1 элемент
        System.arraycopy(arrayIntCopy, index, arrayIntCopy, index + 1, arrayIntCopy.length - index - 1);
        System.out.println(Arrays.toString(arrayIntCopy));
        // вставляем новый элемент на освобожденное место
        arrayIntCopy[index] = 15;
        // печатаем новый массив
        System.out.println(Arrays.toString(arrayIntCopy));

    }
}
