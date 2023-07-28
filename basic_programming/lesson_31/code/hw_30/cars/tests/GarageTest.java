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
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");
        //поместить их в массив
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCarTest() {
        assertFalse(garage.addCar(null)); // добавить null нельзя
        assertEquals(4, garage.size()); // размер гаража
        Car car = new Car("Number5", "Model4", "Company2", 2.0, "Green");
        assertTrue(garage.addCar(car)); // добавляем еще одну машину
        assertEquals(5, garage.size()); // проверка размера гаража
        car = new Car("Number6", "Model4", "Company2", 2.0, "Green");
        assertFalse(garage.addCar(car)); // не можем добавить машину сверх capacity
    }


    @Test
    void removeCarTest() {
        assertEquals(cars[0], garage.removeCar("Number1"));
        assertEquals(3, garage.size());
    }

    @Test
    void findCarByRegNumberTest() {
        assertEquals(cars[0], garage.findCarByRegNumber("Number1"));

    }


    @Test
    void findCarsByModel() {

    }

    @Test
    void findCarsByCompany() {

    }

    @Test
    void findCarsByEngine() {
    }

    @Test
    void findCarsByColor() {
    }
}