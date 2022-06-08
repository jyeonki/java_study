package codingtest.baekjoon.chap03;

import java.util.Scanner;

public class Question09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String star = "";

        for (int i = 1; i <= a; i++) {
            star += "*";
            System.out.println(star);
        }

        /*
        for (int i = 0; i < 5; i++) {
            //별을 반복해서 찍는코드
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");

        for (int i = 0; i < 5; i++) {
            //별을 반복해서 찍는코드
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================");

        for (int i = 0; i < 5; i++) {
            //공백을 반복해서 찍고
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            //별을 반복해서 찍는코드
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========================");

        for (int i = 0; i < 5; i++) {
            //공백을 반복해서 찍고
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            //별을 반복해서 찍는코드
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        */
    }
}
