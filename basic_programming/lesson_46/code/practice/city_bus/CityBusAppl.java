package practice.city_bus;

import practice.city_bus.model.Bus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {
        // Создадим список городских маршрутов.
        // Вывести его на печать в отсортированном виде.
        // Подсчитать общее количество перевозимых за день пассажиров.

        List<Bus> cityBuses = new ArrayList<Bus>();

        cityBuses.add(new Bus("Scania", "1000AG", "100", 90 ));
        cityBuses.add(new Bus("MAN", "2000AG", "100A", 100 ));
        cityBuses.add(new Bus("Mercedes", "5000AG", "25", 105 ));
        cityBuses.add(new Bus("Ikarus", "3000AG", "B", 80 ));

        Bus bus1 = new Bus("MANN", "2000AG", "100A", 100);
        cityBuses.add(bus1);
        System.out.println(cityBuses.size());
        System.out.println("==============================");

        for (Bus bus : cityBuses ) {
            System.out.println(bus);
        }

        cityBuses.sort(Bus :: compareTo); // проводим сортировку

        System.out.println("==============================");
        for (Bus bus : cityBuses ) {
            System.out.println(bus);
        }

        System.out.println("=========Total Capacity ==================");
        int totalCapacity = 0;

        for (Bus bus : cityBuses) {
            totalCapacity += bus.getCapacity();
        }

        System.out.println(totalCapacity);

        Bus busToEdit = cityBuses.get(4);
      //  System.out.println(busToEdit);
        busToEdit.setModel("Ykarus");
      //  System.out.println(busToEdit);

        System.out.println("==============================");
        for (Bus bus : cityBuses ) {
            System.out.println(bus);
        }

    }




}
