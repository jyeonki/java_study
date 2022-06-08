package codingtest.baekjoon.chap04;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 9개짜리 배열만들기
        int[] arr = new int[9];

        // 입력 받은 수를 배열에 저장
        for (int i = 0; i < arr.length; i++) {
            int N = sc.nextInt();
            arr[i] = N;
        }

        // 최대값 구하기
        int max = arr[0];
        for (int x : arr) {
            max = x > max ? x : max;
        }
        
        // 최대값이 몇 번째 수인지 찾기
        int index = -1;
        for (int i = 0; i < arr.length ; i++) {
            if (max == arr[i]) {
                index = i;
                break;
            }
        }
//        System.out.println(Arrays.toString(arr));

        System.out.println(max);
        System.out.println(index + 1); // index는 0부터 시작하니까 +1



        /*
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9]; // 입력받은 정수들을 저장할 배열

        // 9만큼 반복해서 입력받은 정수를 순차적으로 배열에 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // 최대값을 저장할 변수
        int max = arr[0];
        // 위치를 저장할 변수
        int pos = 1;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i]; //최대값 갱신
                pos = i + 1; //위치값 갱신
            }
        }
        System.out.printf("%d\n%d", max, pos);
        */
    }
}
