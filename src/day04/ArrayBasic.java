package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {

        // 1. 배열 변수 선언
//        int arr[]; // 정수 1개가 들어가는 4byte짜리 배열
        int[] arr; // 정수 여러개가 들어가는 배열
//        int[] arr = 0; // int랑 int배열은 다르다, 이렇게 하면 Error


        // 2. 배열의 생성
        arr = new int[5]; // arr에는 실제 숫자 5개가 들어간 게 아니라 엄밀히 말하면 첫번째 방 주소가 들어있다
        // new : 펜션 heap에 전화 걸어~

        System.out.println(arr); // 자바스크립트는 아무것도 안 담아도 undefined가 뜨지만 자바는 Error


        // 3. 배열값 초기화 (값을 저장)
        arr[0] = 30;
        arr[1] = 99;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        arr[4] = 100;
//        arr[5] = 55; // 런타임 오류(실행은 시켜주지만 에러가 뜬다)


        // 배열의 길이 - 저장 데이터 개수
        System.out.printf("배열의 길이: %d\n", arr.length); // 값을 하나도 안 넣어도 length는 5, 왜냐 이미 방을 5개 만들었으니까


        // 배열 내부 값 확인
        /*
        System.out.printf("%d ", arr[0]);
        System.out.printf("%d ", arr[1]);
        System.out.printf("%d ", arr[2]);
        System.out.printf("%d ", arr[3]);
        System.out.printf("%d ", arr[4]); // 다 드래그하고 alt + enter치고 루프로 축소
        */


        // 배열 내부 값 확인 = 루프 사용
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", arr[i]); // 30 99 50 66 100
        }
        System.out.println(); // 줄바꿈
        System.out.println("==============================================");


        // 배열 전용 반복문 (향상된 for : Enhanced for Loop)
        for (int n : arr) {
            System.out.printf("%d ", n); // 30 99 50 66 100
        }
        System.out.println("\n==============================================");


        // 배열 내부값 출력 함수
        System.out.println(Arrays.toString(arr)); // [30, 99, 50, 66, 100]
        System.out.println("==============================================");


        // 값 목록을 나열하여 배열 생성하기
        int[] numbers = new int[] {10, 20, 30, 40};

        System.out.println(Arrays.toString(numbers)); // [10, 20, 30, 40]
        
        // new String[] 이런 구문은 배열변수 선언시에만 생략가능
        String[] foods = new String[] {"사과", "복숭아", "파인애플"};
        foods[1] = "수박";

        foods = new String[] {"짜장면", "탕수육", "짬뽕"}; // new String[] 안 적으면 Error, 왜냐 변수선언이 아니니까

        System.out.println(Arrays.toString(foods)); // [짜장면, 탕수육, 짬뽕]
        System.out.println("==============================================");


        // 배열을 생성만하고 초기화하지 않는다면?
        // -> 해당 타입의 기본값으로 자동초기화됨.
        double[] dArr = new double[3]; // 빈 배열로 만드려면 3자리에 0을 넣어야함
        // stack위치에 있는 포인터변수는 8byte로 고정, short로 바껴도 포인터변수는 8byte로 고정 (운영체제따라 다름(Window 64bit는 8byte)

        System.out.println("dArr.length = " + dArr.length);
        System.out.println(Arrays.toString(dArr));




    }
}
