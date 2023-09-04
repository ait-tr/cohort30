package practice.city_bus;

import practice.city_bus.model.Bus;

import java.util.ArrayList;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {
        // Создадим список городских маршрутов.
        // Вывести его на печать в отсортированном виде.
        // Подсчитать общее количество перевозимых за день пассажиров.

        List<Bus> cityBuses = new ArrayList<>();

        CircularRoute route1 = new CircularRoute();
        route1.addStop("A");
        route1.addStop("B");
        route1.addStop("C");

        CircularRoute route2 = new CircularRoute();
        route2.addStop("D");
        route2.addStop("E");
        route2.addStop("F");

        CircularRoute route3 = new CircularRoute();
        route3.addStop("G");
        route3.addStop("H");
        route3.addStop("I");

        cityBuses.add(new Bus("Scania", "1000AG", route1, 90));
        cityBuses.add(new Bus("MAN", "2000AG", route2, 100));
        cityBuses.add(new Bus("Mercedes", "5000AG", route3, 105));
        cityBuses.add(new Bus("Ikarus", "3000AG", route1, 80));

        Bus bus1 = new Bus("MANN", "2000AG", route2, 100);
        cityBuses.add(bus1);

        System.out.println("Number of buses: " + cityBuses.size());
        System.out.println("==============================");

        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }

        cityBuses.sort(Bus::compareTo); // проводим сортировку

        System.out.println("==============================");
        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }

        System.out.println("=========Total Capacity ==================");
        int totalCapacity = 0;

        for (Bus bus : cityBuses) {
            totalCapacity += bus.getCapacity();
        }

        System.out.println("Total Capacity: " + totalCapacity);

        Bus busToEdit = cityBuses.get(4);
        busToEdit.setModel("Ykarus");

        System.out.println("==============================");
        for (Bus bus : cityBuses) {
            System.out.println(bus);
        }
    }
}
