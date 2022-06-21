package datastructure.chap09;

import java.util.Scanner;

// 백준 11047
public class 그리디_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int arr[] = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //동전의 가치 입력받기
        }

        while (a != 0) { //돈이 0이 될때까지
            int chk = 0;
            for (int i = arr.length - 1; i >= 0; i--) { //가장 뒤가 제일 가치가 높으니까 거꾸로 돌린다
                if (arr[i] <= a) { // 지금 금액(a)보다 작으면
                    chk = i; //지금 이 돈의 가치가 들어가겠구나! => 값을 넣어준다
                    break;
                }
            }
            answer += a / arr[chk]; // 그 돈의 가치로 나눈 몫을 answer 에 더하기
            a = a % arr[chk]; // 그돈의 가치로 최대한 넣은 뒤 남은 금액 넣기
            // 다시 while문이 돈다
        }
        System.out.println(answer);




        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //동전의 개수
        int K = sc.nextInt(); //목표 액수

        //동전을 담을 자료구조
        Stack<Integer> A = new Stack<>();
        for (int i = 0; i < N; i++) {
            A.push(sc.nextInt());
        }
        sc.close();

        int count = 0; // 동전의 수
        while (!A.isEmpty()) {
            int coinAmt = A.pop(); // 꼭대기 동전부터 추출
            if (coinAmt <= K) {
                count += (K / coinAmt); // 동전 개수 누적
                K %= coinAmt; // 잔액 갱신
            }

            if (K == 0) break;
        }
        System.out.println(count);
        */
    }
}