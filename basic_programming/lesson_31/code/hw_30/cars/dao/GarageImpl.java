package hw_30.cars.dao;

import hw_30.cars.model.Car;

public class GarageImpl implements Garage {


    private Car[] cars;

    private int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null){
            return false;
        }
//        cars[size] = car; // ставим в конец массива
//        size++;

        cars[size++] = car; // постфиксная операция ++ увеличит size после присвоения
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if(regNumber.equals(cars[i].getRegNumber())) {
              Car temp = cars[i];
              cars[i] = cars[--size];// на место удаленного ставим последний
                cars[size] = null;
              return temp;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {

        for (int i = 0; i < size; i++) {
            if(regNumber.equals(cars[i].getRegNumber())){
                Car res = cars[i];
                return res;
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {

        return new Car[0];
    }

    @Override
    public Car[] findCarsByCompany(String company) {

        return new Car[0];
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {

        return new Car[0];
    }

    @Override
    public Car[] findCarsByColor(String color) {

        return new Car[0];
    }

    @Override
    public int size() {
        return size;
    }
}
