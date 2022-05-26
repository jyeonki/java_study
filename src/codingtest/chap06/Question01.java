package codingtest.chap06;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String s = sc.next();
//        char c = s.charAt(0);

        // 위에 두 줄을 한 줄로 정리한 코드
        char c = sc.next().charAt(0); // sc.next()는 String

        sc.close();

        System.out.println((int)c);

    }
}
