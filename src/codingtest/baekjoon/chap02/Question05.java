package codingtest.baekjoon.chap02;

import java.util.Scanner;

public class Question05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        /*
             h, m >= 45 => h, m-45
             h >= 1, m < 45 => h-1, m+15
             h = 0, m < 45 => h=23, m+15
        */

        if (minute >= 45) {
            System.out.printf("%d %d", hour, minute-45);
        } else if (hour >= 1) {
            System.out.printf("%d %d", hour-1, minute+15);
        } else if (hour == 0) {
            System.out.printf("%d %d", 23, minute+15);
        }
        // else if (minute < 45) true니까 지워도 가능

    }
}
