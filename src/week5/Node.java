package week5;


public class Node {
    public String name;
    public Node next;

    Node() {}

    Node(String name) {
        this.name = name;
    }

    Node(String name, Node next) {
        this.name = name;
        this.next = next;
    }
}
