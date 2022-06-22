package datastructure.chap09;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// 백준 1715
public class 그리디_03 {

    public static void main(String[] args) {

        // 우선순위 큐
        PriorityQueue<Integer> cardList = new PriorityQueue<>();
        cardList.offer(10);
        cardList.offer(20);
        cardList.offer(40);

        System.out.println(cardList);

        int total = 0;

        Integer n1 = cardList.poll();
        Integer n2 = cardList.poll();
        int e = n1 + n2;
        total += e;
        cardList.offer(e);
        System.out.println(cardList);

        n1 = cardList.poll();
        n2 = cardList.poll();
        e = n1 + n2;
        total += e;
        cardList.offer(e);
        System.out.println(cardList);

        System.out.println("total = " + total);



        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 카드 묶음 수
        PriorityQueue<Integer> cardList = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            cardList.add(sc.nextInt());
        }

        int total = 0;
        while (cardList.size() != 1) {
            int data1 = cardList.poll();
            int data2 = cardList.poll();
            total += data1 + data2;
            cardList.offer(data1 + data2);
        }
        System.out.println(total);
        */
    }
}