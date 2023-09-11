package practice;

public class MyLinkedListImpl {

    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        String data;
        Node prev;
        Node next;

        public Node(String data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
