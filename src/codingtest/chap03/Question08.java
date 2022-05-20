package codingtest.chap03;

import java.util.Scanner;

public class Question08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a + b;
//            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
            System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, result);
        } // \n쓰는 거 잊지 말기
        sc.close();

    }
}
