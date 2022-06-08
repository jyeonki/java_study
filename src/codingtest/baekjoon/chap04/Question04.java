package codingtest.baekjoon.chap04;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // 10개의 수를 저장할 배열
        int[] arr = new int[10];
        
        // 수 10개 입력받아 배열 arr에 저장
        for (int i = 0; i < arr.length ; i++) {
            int N = sc.nextInt();
            arr[i] = N;
        }

        // 나머지를 저장할 배열
        int[] remainder = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; 
        // 나머지로 나올 수 없는 수를 저장하기

        for (int i = 0; i < remainder.length; i++) {
            int N = arr[i] % 42;
            remainder[i] = arr[i] % 42;
        }

        /*
        arr[0] % 42
        arr[1] % 42
                ...
        arr[9] % 42
        */


        /*
        Scanner sc = new Scanner(System.in);

        // 나머지를 중복없이 저장할 배열
        int[] remainders = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

        int count = 0; // 나머지가 중복없이 성공적으로 저장된 횟수
        for (int i = 0; i < remainders.length; i++) {
            int n = sc.nextInt(); // 정수 입력받기
            int rm = n % 42; // 나머지 구하기

            // 지금 구한 나머지가 배열 안에 저장되었는지 체크
            int j;
            for (j = 0; j < remainders.length; j++) {
                if (remainders[j] == rm) break;
            }

            // break당해서 나왔는지? 끝까지 for문이 돌아서 나왔는지
            if (j == remainders.length) {
                // 지금 나머지가 중복된 나머지가 아니다
                // 즉, 배열에 저장되어야 한다.
                remainders[count++] = rm;
            }
        }
        System.out.println(count)
        */

    }
}
