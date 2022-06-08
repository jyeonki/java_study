package codingtest.baekjoon.chap02;

import java.util.Scanner;

public class Question07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        int max = a;

        // 같은 눈 3개 a == b && b == c
        // 10000 + a * 1000

        // 같은 눈 2개 a == b
        // 1000 + a * 100
        // 같은 눈 2개 b == c
        // 1000 + b * 100
        // 같은 눈 2개 c == a
        // 1000 + c * 100

        // 모두 다른 눈
        // a가 가장 크다고 가정
        // if a < b
        // b
        // if b < c
        // c

        if (a == b && b == c) {
            result = 10000 + a * 1000;
        } else if (a == b) {
            result = 1000 + a * 100;
        } else if (b == c) {
            result = 1000 + b * 100;
        } else if (c == a) {
            result = 1000 + c * 100;
        } else {
            if (a < b) {
                max = b;
            }
            if (b > c) {
                max = b;
            }
            if (c > a) {
                max = c;
            }
            if (c > b) {
                max = c;
            }
            if (a > b) {
                max = a;
            }
            if (a > c) {
                max = a;
            }
            result = max * 100;
        }

        System.out.println(result);

        /*
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        // 가장 큰 눈 찾기
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;

        // 3개가 모두 같은 경우
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        }
        // 2개가 같은 경우
        else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        }
        // 모두 다른 경우
        else {
            System.out.println(max * 100);
        }
        */
    }
}
