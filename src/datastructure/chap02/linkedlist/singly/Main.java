package datastructure.chap02.linkedlist.singly;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // 연결 리스트 생성
        SimpleLinkedList list = new SimpleLinkedList();

//        System.out.println(list.header);

//        for (int i = 0; i < 6; i++) {
//            list.insert((int) (Math.random() * 45 + 1));
//        }

        list.addFirst(3);
        list.insert(11);
        list.insert(8);
        list.insert(5);
        list.insert(7);
        list.insert(1);
        System.out.println(list.printList());


        list.remove(5);
        System.out.println(list.printList());


        // 연결리스트
        LinkedList linkedList = new LinkedList();

        // 데이터 추가
        linkedList.add(3);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(21);

        // 데이터 삭제
        linkedList.remove(3);

        System.out.println(linkedList);




    }
}
