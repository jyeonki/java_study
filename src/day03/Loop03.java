package day03;

import java.util.Objects;
import java.util.Scanner;

public class Loop03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("음식명: ");
            String food = sc.nextLine();

            if (food.equals("그만")) break; // 문자열 값 비교시: 문자열1.equals(문자열2)

            System.out.println("food = " + food);
        }
        System.out.println("반복문 종료!");
    }
}
