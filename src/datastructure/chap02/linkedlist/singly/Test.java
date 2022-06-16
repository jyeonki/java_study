package datastructure.chap02.linkedlist.singly;

public class Test {

    public static void main(String[] args) {

        SimpleLinkedList<String> list = new SimpleLinkedList<>();

        list.addFirst("오징어");
        list.addFirst("문어");
        list.addFirst("쭈꾸미");

        String s = list.printList();
        System.out.println(s);

        SimpleLinkedList<Double> dList = new SimpleLinkedList<>();
        // <> 대문자로 써야함(클래스). double타입을 원하면 Double로 써야한다

        dList.addFirst(3.4);
        dList.addFirst(4.4);
        dList.addFirst(96.5);

        System.out.println(dList.printList());
    }
}
