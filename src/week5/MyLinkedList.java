package week5;

public class MyLinkedList {
    private Node head;

    public void addNode(Node n) {
        if (head == null) {
            head = n;
        }else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = n;
        }
    }

    public void printList(){
        Node trav = head;
        while (trav != null) {
            System.out.println(trav.name);
            trav = trav.next;
        }
    }

    public void insertBefore(int index, Node n) {
        if (index == 0) {
            n.next = head;
            head = n;
        } else {
            Node trav = head;
            int count = 0;
            while (trav != null && count < index - 1) {
                trav = trav.next;
                count++;
            }
            n.next = trav.next;
            trav.next = n;
        }


    }

    public void insertAfter(int index, Node n) {
        if (n != null) {
            Node trav = head;
            int count = 0;
            while (count < index) {
                trav = trav.next;
                count++;
            }
            n.next = trav.next;
            trav.next = n;
        }
    }

    public int indexOf(String str) {
        Node trav  = head;
        int index = 0; //index start at 0
        while (trav != null) {
            if (trav.name.equals(str)) {
                return index;
            }
            index++;
            trav = trav.next;
        }
        return -1;

    }

    public void removeNodeat(int index) {
        Node trav = head;
        int count = 0;
        while (count < index - 1) {
            trav = trav.next;
            count++;
        }

        trav.next = trav.next.next;
    }
}
