package codingtest.chap03;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int result;

        for (int i = 1; i <= 9; i++) {
            result = a * i;
            System.out.printf("%d * %d = %d\n", a, i, result);
        }

    }
}
