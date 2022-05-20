package day03;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요. ]");
        System.out.print(">> ");
        String season = sc.next();
        sc.close();

        // switch 괄호 안에는 정수, 문자형 변수를 씁니다.
        // 분기를 나눌 데이터가 있는 변수
        switch (season) {
            // case에는 switch에 들어갈 경우의 수 값들을 배치
            // 단 변수는 배치 불가능, 상수나 리터럴만 가능
            case "봄": case "spring":
                // 현재 케이스에서 실행할 코드 작성
                System.out.println("봄에는 여의도로 가보세요~");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "여름": case "summer":
                System.out.println("여름에는 낙산으로 가보세요~");
                break;
            case "가을": case "autumn": case "fall":
                System.out.println("가을에는 춘천으로 가보세요~");
                break;
            case "겨울": case "winter":
                System.out.println("겨울에는 홍천으로 가보세요~");
                break;
            default: // else 기능
                System.out.println("[ 봄, 여름, 가을, 겨울 중 입력하세요! ]");
        }


    }
}
