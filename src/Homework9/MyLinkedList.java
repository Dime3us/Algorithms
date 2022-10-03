package Homework9;

public class MyLinkedList {
    private Node head;

    private int size;

    public MyLinkedList(Node head, int size) {
        this.head = null;
        this.size = 0;
    }


    public void pushToHead(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        size++;
    }

    public void pushToTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(node);
    }

    public boolean removeFirst() {
        if (head == null) {
            return false;
        }
        Node curr = head;
        head = curr.getNext();
        curr.setNext(null);
        size--;
        return true;
    }

    public boolean removeLast() {
        if (head == null) {
            return false;
        }

        Node curr = head;
        Node prev = null;
        while (curr.getNext() != null) {
            prev = curr;
            curr = curr.getNext();
        }
        if (prev != null) {
            prev.setNext(null);


        }
        return true;
    }

    public void print() {
        Node curr = head;

        while (curr != null) {
            System.out.println(curr.getData() + " ");
            curr = curr.getNext();
        }
    }

    public void pushToIndex(int index, int data) {
        if (index > size) {
            System.out.println("Index out of bounds exception");
            return;
        }
        Node node = new Node(data);
        Node curr = head;
        if (index == 0) {
            head = node;
            head.setNext(curr);
            size++;
            return;
        }

        int counter = 1;
        while (counter != index) {
            curr = curr.getNext();
            counter++;
        }
        node.setNext(curr.getNext());
        curr.setNext(node);
        size++;
    }

    public int remove(int index) {
        if (index >= size) {
            System.out.println("Index out of bounds exception");
            return 0;
        }
        int result = 0;
        Node curr = head;
        if (index == 0) {
            result = head.getData();
            curr = head.getNext();
            head = curr;
            size--;
            return result;
        }
        int counter = 1;
        while (counter != index) {
            curr = curr.getNext();
            counter++;
        }
        result = curr.getNext().getData();
        curr.setNext(curr.getNext().getNext());
        size--;
        return result;
    }

    public int get(int index) {
        if (index >= size) {
            System.out.println("Index out of bounds exception");
            return 0;
        }
        int result = 0;
        Node curr = head;
        if (index == 0) {
            result = head.getData();
            return result;
        }
        int counter = 0;
        while (counter != index) {
            curr = curr.getNext();
            counter++;
        }
        result = curr.getData();
        return result;
    }
}