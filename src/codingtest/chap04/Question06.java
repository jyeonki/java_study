package codingtest.chap04;

import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {
        /*
        // String s = "OOXXXOOXX";
        // 문자열 특정 단일문자 취득
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
        // 문자열 길이 구하기
        System.out.println(s.length());
        */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ox;

        for (int i = 0; i < n; i++) {
            ox = sc.next();
            int count = 0;
            int total = 0;

            for (int j = 0; j < ox.length() ; j++) {
                if (ox.charAt(j) == 'O') {
                    count++;
                    total += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(total);
        }


        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 테스트 횟수

        // OX문자열을 저장할 배열
        String[] answerList = new String[N];
        for (int i = 0; i < N; i++) {
            answerList[i] = sc.next();
        }
        sc.close();

        for (String s : answerList) {

            int total = 0; //총점 누적
            int accum = 0; //누적 점수

            // 글자를 한글자마자 순회
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    if (i == 0 || s.charAt(i - 1) == 'X') {
                        accum = 1;
                    } else {
                        accum++;
                    }
                } else { // 글자가 X
                    accum = 0;
                }
                total += accum;
            }
            System.out.println(total);
        }
        */

    }
}
