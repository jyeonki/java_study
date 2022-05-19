package day02;

import java.util.Scanner;

public class InputQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");

        System.out.print("- 상품의 가격: ");
        int price = sc.nextInt();

        System.out.print("- 상품의 개수: ");
        int amount = sc.nextInt();

        System.out.println("-------------------------");

        System.out.println("- 상품 재고 총액: " + price * amount);

    }
}
