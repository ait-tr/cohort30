package practice.city_bus;

public class BusStopNode {
    String stopName;
    BusStopNode next;

    public BusStopNode(String stopName) {
        this.stopName = stopName;
        this.next = null;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public BusStopNode getNext() {
        return next;
    }

    public void setNext(BusStopNode next) {
        this.next = next;
    }
}

