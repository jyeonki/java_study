package codingtest.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class Question07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < testCase; i++) {

            int student = sc.nextInt(); // 각 테스트 케이스마다 학생 수
            int[] score = new int[student]; // 점수들을 저장 할 배열
            
            // 입력받은 점수를 배열에 저장하기
            for (int j = 0; j < student; j++) {
                score[j] = sc.nextInt();
            }

//            System.out.println(Arrays.toString(score));

            // 평균 구하기
            int total = 0;
            for (int x : score) {
                total += x;
            }

            double avg = total / score.length;

            // 평균을 넘는 학생들의 수 구하기
            int count = 0; // 평균을 넘는 학생 수

            for (int x : score) {
                if (x > avg) {
                    count++;
                }
            }

            double rate = (double)(count * 100) / student;

            System.out.printf("%.3f%%", rate);
        }



        /*
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt(); //테스트 케이스 수

        for (int k = 0; k < C; k++) {
            int N = sc.nextInt(); //학생 수

            int[] scoreList = new int[N];

            for (int i = 0; i < N; i++) {
                scoreList[i] = sc.nextInt();
            }

            int total = 0;
            for (int s : scoreList) {
                total += s;
            }
            double avg = (double) total / scoreList.length;

            // 몇명이 평균을 넘었는지 확인
            int high = 0; // 평균 넘은 학생수 체크
            for (int i = 0; i < scoreList.length; i++) {
                if (scoreList[i] > avg) high++;
            }
            // 비율 계산
            double rate = (double) high / scoreList.length * 100;
            // 비율 출력
            System.out.printf("%.3f%%\n", rate);
        }
        sc.close();
        */

    }
}
