package codingtest.baekjoon.chap01;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a * (b % 10);
        int d = a * ((b / 10) % 10);
        int e = a * (b / 100);
        int f = a * b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}

