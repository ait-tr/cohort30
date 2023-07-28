package hw_30.cars.tests;

import hw_30.cars.model.Car;
import hw_30.cars.dao.Garage;
import hw_30.cars.dao.GarageImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {
    Garage garage; // объект из класса Garage
    Car[] cars; // массив объектов типа Cars

    @BeforeEach
    void setUp() {
        //создать машины
        garage = new GarageImpl(6);
        cars = new Car[5]; // флот машин = 5 штук
        cars[0] = new Car("BV 100","Audi", "BVB", 2.0, "Silver");
        cars[1] = new Car("BV 101","Mercedes", "BVB",3.5, "Blue");
        cars[2] = new Car("BV 102", "Opel", "BSR", 1.8, "White");
        cars[3] = new Car("BV 103", "BMW", "RES",2.8, "Blue" );
        cars[4] = new Car("BV 104","Audi", "BVB", 1.8, "White");

        //поместить их в массив
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCarTest() {
        assertFalse(garage.addCar(null)); // добавить null нельзя
        assertEquals(5, garage.size()); // размер гаража
        Car car = new Car("BV 105", "Opel", "BVB", 2.0, "Green");
        assertTrue(garage.addCar(car)); // добавляем еще одну машину
        assertEquals(6, garage.size()); // проверка размера гаража
        car = new Car("BV 106", "Mazda", "Company2", 2.0, "Green");
        assertFalse(garage.addCar(car)); // не можем добавить машину сверх capacity
    }


    @Test
    void removeCarTest() {
        assertEquals(5, garage.size());
        assertEquals(cars[0], garage.removeCar("BV 100"));
        assertEquals(4, garage.size());
    }

    @Test
    void findCarByRegNumberTest() {
        assertEquals(cars[0], garage.findCarByRegNumber("BV 100")); // ищем имеющуюся машину
        assertEquals(null, garage.findCarByRegNumber("BV 1000")); // ищем машину, которой нет в гараже
    }


    @Test
    void findCarsByModelTest() {
        Car[] expected = {cars[0], cars[4]};
        assertArrayEquals(expected, garage.findCarsByModel("Audi"));

    }

    @Test
    void findCarsByCompanyTest() {
        Car[] expected = {cars[0], cars[1], cars[4]};
        Car[] actual = garage.findCarsByCompany("BVB");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngine() {
    }

    @Test
    void findCarsByColorTest() {
        Car[] expected = {cars[2], cars[4]};
        Car[] actual = garage.findCarsByColor("White");
        assertArrayEquals(expected, actual);
    }
}