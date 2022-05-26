package day07;

import java.util.Scanner;

public class StringEqual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String str1 = "가나다";
        String str1 = new String("가나다"); // 두 개는 같다
        String str2 = sc.next();
        sc.close();

        // == 은 주소값을 비교한다. String은 char배열, 그래서 .equals를 써야한다
        if (str1.equals(str2)) {
            System.out.println("두 문자열이 일치함");
        } else {
            System.out.println("두 문자열이 일치하지 않음");
        }


    }
}
