package teacher_code;


// реализация односвязного списка
public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean add(String data) {
        Node newInformation = new Node(data, null);

        if(head == null) {
            head = newInformation;
            size++;
            return true;
        } else {
            if (size == 1) {
                this.head.next = newInformation;
                this.tail = newInformation;
                size++;
                return true;
            } else {
                this.tail.next = newInformation;
                this.tail = newInformation;
                size++;
                return true;
            }
        }
    }

    public boolean add(int index, String data) {
        Node newInformation = new Node(data, null);

        if (index > size) {
            throw new IllegalArgumentException("index is bigger than size " + size);
        }

        Node temp = this.head;
        for (int i = 0; i <= index; i++) {
            if (i != index) {
                temp = temp.next;
            } else {
                newInformation.next = temp.next;
                temp.next = newInformation;
                size++;
                return true;
            }
        }
        return false;
    }

    private static class Node {
        String data;
        // ссылки на предыдущий элемент нет, тк это односвязный список
        Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
