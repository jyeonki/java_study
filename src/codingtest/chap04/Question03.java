package codingtest.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int value = a * b * c;

        // 0부터 9까지 몇 번 쓰였는지 저장할 변수
        int[] arr = new int[10];

        /*
        arr[0] = value % 10;
        value = value / 10;
        arr[1] = value % 10;
        value = value / 10;
        arr[2] = value % 10;
        */

//        System.out.println(Arrays.toString(arr));

        while (value > 0) { // value값이 0보다 작아지면 루프는 멈춰야함
            arr[value % 10]++;
            value = value / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
        150 * 266 * 427
        17037300
        %10        0
        1703730 % 10 = 0 // 왼쪽 값은 계속 10으로 나누기
        170373  % 10 = 3
        17037   % 10 = 7
        1703    % 10 = 3
        170     % 10 = 0
        17      % 10 = 7
        1       % 10 = 1
        */


        /*
        Scanner sc = new Scanner(System.in);

        // 세 개의 정수 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        // 세 수의 곱
        int multi = A * B * C;

        // 0부터 9까지의 등장 횟수를 카운팅해서 저장할 배열
        int[] countArr = new int[10];

        // 자리수 별로 숫자를 쪼개서 배열에 넣기

        while (multi > 0) {
            // 1의 자리수를 구하기 ex) 3645853
            int lastPosNum = multi % 10;
            countArr[lastPosNum]++; // 1의자리 숫자에 해당하는 배열카운트 증가

            // 한자리수 줄이기
            multi /= 10;
        }
//        System.out.println(Arrays.toString(countArr));

        for (int x : countArr) {
            System.out.println(x);
        }
        */
    }
}
