package hw_32.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.cats.Cat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car[] cars;

    @BeforeEach
    void setUp() {
    // создать массив cars
//        cars[0] = new hw_30.cars.model.Car("BV 100","Audi", "BVB", 2.0, "Silver");
//        cars[1] = new hw_30.cars.model.Car("BV 101","Mercedes", "BVB",3.5, "Blue");
//        cars[2] = new hw_30.cars.model.Car("BV 102", "Opel", "BSR", 1.8, "White");
//        cars[3] = new hw_30.cars.model.Car("BV 103", "BMW", "RES",2.8, "Blue" );
//        cars[4] = new hw_30.cars.model.Car("BV 104","Audi", "BVB", 1.8, "White");
        cars = new Car[5];
        cars[0] = new Car("BV 105","Audi", "BVB", 2.0, "Silver", 100000);
        cars[1] = new Car("BV 101","Mercedes", "BVB",3.5, "Blue", 120000);
        cars[2] = new Car("BV 110", "Opel", "BSR", 1.8, "White", 300000);
        cars[3] = new Car("BV 106", "BMW", "RES",2.8, "Blue", 200000);
        cars[4] = new Car("BV 103","Audi", "BVB", 1.8, "White", 150000);
    }
    @Test
    void carsSortTest(){
        System.out.println("=========Unsorted=============");
        printArray(cars);
        System.out.println("=========Sorted=============");
        Arrays.sort(cars);
        printArray(cars);

    }

    // сортировка с помощью Comporator по одному полю engine
    @Test
    void carsSortByComparatorEngineTest(){

        System.out.println("=========Unsorted=============");
        printArray(cars);
        Comparator<Car> engineComporator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.getEngine() - o2.getEngine() < 0) {
                    return -1;
                } else if (o1.getEngine() - o2.getEngine() == 0) {
                    return 0;
                } else {return 1;}
            };
    };

        System.out.println("=========Sorted=============");
        Arrays.sort(cars, engineComporator);
        printArray(cars);
    }

    // сортировка с помощью Comporator по одному полю model
    @Test
    void carsSortByComparatorModelTest(){

        System.out.println("=========Unsorted=============");
        printArray(cars);

        Comparator<Car> modelComporator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        };

        System.out.println("=========Sorted=============");
        Arrays.sort(cars, modelComporator);
        printArray(cars);
    }

    @Test
    void carsSortByLambdaTest(){

        System.out.println("=========Unsorted=============");
        printArray(cars);

        System.out.println("=========Sorted=============");
        Arrays.sort(cars, (s1, s2) -> {
            return s1.getModel().compareTo(s2.getModel());
        }
        );
        printArray(cars);
    }

    // несколько полей для сортировки, одно после другого
    @Test
    void carsSortByConditionsTest(){
        System.out.println("=========Unsorted=============");
        printArray(cars);

        Comparator<Car> modelComporator2Fields = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int modelCompare = o1.getModel().compareTo(o2.getModel()); // сортировка по модели
                if (modelCompare !=0){
                    return modelCompare;
                } else {
                    return - (o1.getMilage() - o2.getMilage()); // сортировка по пробегу от большего к меньшему
                }

            }
        };

        System.out.println("=========Sorted=============");
        Arrays.sort(cars, modelComporator2Fields);
        printArray(cars);
    }

    // ______________Methods____________
    public void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}