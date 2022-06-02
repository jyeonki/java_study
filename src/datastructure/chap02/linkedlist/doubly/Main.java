package datastructure.chap02.linkedlist.doubly;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.add(1);
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(11);
        list.add(-8);
        list.add(2);
        list.add(4);

        System.out.println(list.printList());

        list.remove(-8);
        list.remove(2);
        list.remove(7);

        System.out.println(list.printList());
    }
}
