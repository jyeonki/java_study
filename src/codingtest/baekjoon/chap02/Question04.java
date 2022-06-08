package codingtest.baekjoon.chap02;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (A > 0 & B > 0) {
            System.out.println(1);
        } else if (A < 0 & B > 0) {
            System.out.println(2);
        } else if (A < 0 & B < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

        /*
        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();

        boolean xPos = x >= 0;
        boolean yPos = y >= 0;

        if (xPos && yPos) System.out.println(1);
        else if (!xPos && yPos) System.out.println(2);
        else if (!xPos && !yPos) System.out.println(3);
        else System.out.println(4);
        */
    }
}
