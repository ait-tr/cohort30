package practice35.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {
// вызвать тестируемый класс
    City[] cities;

    @BeforeEach
    void setUp() {
        // создать тестовый набор данных

        cities = new City[6]; // создаем массив

        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }
    // метод для печати массива + строка-анонс списка
    private void printArray(Object[] arr, String title) {
        System.out.println("===== " + title + " =====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

        // будем искать город в массиве методом BinarySearch и смотреть, что он нам вернет
        // BinarySearch можно применять ТОЛЬКО к ОТСОРТИРОВАННОМУ массиву
    @Test
    void testBinarySearch(){
        printArray(cities, " Original array");
        Arrays.sort(cities); // сортировка в "естественном" порядке
        printArray(cities, "Natural order (population)");
// теперь можно применять BinarySearch
        City pattern = new City(null, 3_000_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println("Index = " + index);
    }
    // сортировку по имени (по алфавиту), сделаем с помощью Comarator
    @Test
    void testBinarySearch1() {
        printArray(cities, " Original array");
       Comparator<City> cityComparator = (c1, c2) -> c1.getName().compareTo(c2.getName());

//        Comparator<City> cityComparator = new Comparator<City>() {
//            @Override
//            public int compare(City o1, City o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };

  //     Comparator<City> cityComparator = Comparator.comparing(City::getName); // сравниваем объекты класса City по именам
        Arrays.sort(cities, cityComparator); // выполнили сортировку
        printArray(cities, "Sort by name");
        City pattern = new City ("Chicago", 0);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println("Index = " + index);

    }



}