package practice.city_bus;

public class BusStopNode {
    String stopName;
    BusStopNode next;

    public BusStopNode(String stopName) {
        this.stopName = stopName;
        this.next = null;
    }
}

