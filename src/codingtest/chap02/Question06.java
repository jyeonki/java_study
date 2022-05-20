package codingtest.chap02;

import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {

        // 시간 + (요리시간 / 60), 분 + (요리시간 % 60)
        // 시간이 24이상이 될 경우
        // 분이 60이상이 될 경우

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int timer = sc.nextInt();
        sc.close();

        hour = hour + (timer / 60);
        minute = minute + (timer % 60);

        if (minute >= 60) {
            hour = hour + 1;
            minute = minute - 60;
        }
        if (hour >= 24) {
            hour = hour -24;
        }

        System.out.printf("%d %d", hour, minute);

    }
}
