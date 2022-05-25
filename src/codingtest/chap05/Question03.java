package codingtest.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Question03 {

    // 등차수열 : 연속된 두 개의 수의 차이가 일정한 수열
    /*
        a = {1, 3, 5, 7, 9, 11, 13};
        gap = 2;
        a_1 = 1;
        a_2 = 1 + gap;
        a_3 = 1 + gap*2;
        a_4 = 1 + gap*3;

        => a_n = a_1 + gap(n-1)

        // 입력: 1 <= n <= 1000



        // 입력받은 숫자가 1자리 숫자일 때
        입력받은 숫자가 한수

        // 입력받은 숫자가 2자리 숫자일 때
        입력받은 숫자가 한수

        // 입력받은 숫자가 3자리 숫자일 때
        135
        1 3 5
        1 -> 135 / 100
        3 -> (135 / 10) % 10
        5 -> 135 % 10

        a_2 = a_1 + gap(n-1)

        246
        2 4 6
        2 -> 246 / 100
        4 -> (246 / 10) % 10
        6 -> 246 % 10

        abc
        a b c
        a = abc / 100
        b = abc / 10 % 10
        c = abc % 10

        // 입력받은 숫자가 1000일 때
        1000은 한수가 아니다

        // 예시
        입력받은 수가 123일 때
        한수의 개수 1 - 99 = 99개
        100-123

        abc
        a b c
        a = abc % 100
        b = abc / 10 % 10
        c = abc % 10

        c-b = b-a 한수
        
        // 1-입력받은 숫자까지 배열에 넣기        
        
        만약, 배열.length <= 2
        count++;

        배열.length > 2
        if( 배열[loop] < 배열[loop+1])
        한수인지 체크해서 한수가 맞으면 카운트 증가
        else
        카운트 안함


    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // 1. 1-입력받은 숫자까지 배열에 넣기
        int[] arr = new int[number];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i + 1;
        }

//        System.out.println(Arrays.toString(arr));

        // 2. 배열 안에 저장된 숫자들을 쪼개서 변수안에 넣기

        int count = 0;

        int[] sep1 = new int[99];
        for (int i = 0; i < sep1.length; i++) {
            sep1[i] = arr[i];
            count++;
        }

        int[] sep3 = new int[3];
        for (int i = 99; i < arr.length; i++) {
            sep3[0] = arr[i] / 100;
            sep3[1] = (arr[i] / 10) % 10;
            sep3[2] = arr[i] % 10;

            if (sep3[1] - sep3[0] == sep3[2] - sep3[1]) {
                count++;
            }
        }

        int[] sep4 = new int[4];


        System.out.println("count = " + count);
        /*
        sep[0] = arr[0] % 100;
        sep[1] = arr[0] / 10 % 10;
        sep[2] = arr[0] % 10;
        */
       



    }
}
