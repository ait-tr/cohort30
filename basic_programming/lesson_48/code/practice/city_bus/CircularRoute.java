package practice.city_bus;

public class CircularRoute {
    private BusStopNode head;
    private int size;

    public CircularRoute() {
        head = null;
        size = 0;
    }

    public void addStop(String stopName) {
        BusStopNode newNode = new BusStopNode(stopName);
        if (head == null) {
            head = newNode;
            head.next = head; // кольцевая связь
        } else {
            BusStopNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // кольцевая связь
        }
        size++;
    }

    public boolean removeStop(String stopName) {
        if (head == null) return false;

        BusStopNode current = head;
        BusStopNode prev = null;
        do {
            if (current.stopName.equals(stopName)) {
                if (prev != null) {
                    prev.next = current.next;
                    if (current == head) {
                        head = prev.next;
                    }
                } else {
                    // Если удаляем голову
                    BusStopNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        return false;
    }

    // метод возвращает количство остановок от start до end
    public String whenToGetOff(String start, String end) {
        if (head == null) return "Маршрут пуст";

        BusStopNode temp = head;
        boolean foundStart = false;
        do {
            if (temp.stopName.equals(start)) foundStart = true;
            if (foundStart && temp.stopName.equals(end)) return "Выходите на следующей остановке: " + end;

            temp = temp.next;
        } while (temp != head);

        return "Такой остановки нет в маршруте";
    }

    public int getSize() {
        return size;
    }
}

