package hw_25.bus;

public class BusAppl {
    public static void main(String[] args) {

        Bus bus = new Bus( 30);
        System.out.println(bus);

        bus.setRoute("35B");

        bus.displayBus();

        bus.go(40.0);
        bus.displayBus();
        bus.displaySpeed();

        bus.speedUp(10.0);
        bus.displaySpeed();
        bus.speedDown(20.0);
        bus.displaySpeed();

        bus.displayBus();
        bus.stop();
        bus.displaySpeed();

    }
}
