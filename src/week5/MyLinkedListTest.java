package week5;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList mylinkedList = new MyLinkedList();
        mylinkedList.addNode(new Node("bill"));
        mylinkedList.addNode(new Node("jill"));
        mylinkedList.addNode(new Node("sue"));
        mylinkedList.printList();

        System.out.println("______________________________");
        mylinkedList.insertBefore(1, new Node("dave"));
        mylinkedList.printList();

        System.out.println("______________________________");
        mylinkedList.insertBefore(0, new Node("larry"));
        mylinkedList.printList();
        System.out.println("______________________________");
        mylinkedList.insertBefore(4, new Node("ann"));
        mylinkedList.printList();

        System.out.println("______________________________");
        mylinkedList.insertAfter(0, new Node("alice"));
        mylinkedList.printList();

        //index start at 0
        System.out.println("bill index: " + mylinkedList.indexOf("bill"));

        System.out.println("______________________________");
        mylinkedList.removeNodeat(2);
        mylinkedList.printList();

    }
}
