package termAssigement;

public class LinkedList {
    private Node headNode;

    public void addNodeAt(int index, Node node) {
        if (index == 0) {
            node.next = headNode;
            headNode = node;
        }else {
            Node trav = headNode;
            int count = 0;
            while (trav != null && count < index - 1) {
                trav = trav.next;
                count++;
            }
            node.next = trav.next;
            trav.next = node;
        }
    }

    public void removeNodeAt(int index) {
        Node trav = headNode;
        int count = 0;
        while (count < index - 1) {
            trav = trav.next;
            count++;
        }

        trav.next = trav.next.next;
    }

    public void printList() {
        Node trav = headNode;
        while (trav != null) {
            System.out.println(trav.getData());
            trav = trav.next;
        }
    }

    public class Node{

        private int data;
        private Node next;

        public Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
