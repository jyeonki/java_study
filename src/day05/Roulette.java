package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("게임 인원 (2 ~ 4명) ==> ");
        int headCount = sc.nextInt(); // 게임 인원 수를 입력받을 변수
//        int headCount = 3;

        System.out.println("\n플레이어 이름을 등록합니다.");

        // 플레이어 이름을 저장할 배열 players
        String[] players = new String[headCount];
        // 배열에 플레이어 이름을 저장
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%d번 플레이어 이름: ", i + 1);
            players[i] = sc.next();
        }
        System.out.println(Arrays.toString(players) + " 참가!\n");

        System.out.printf("실탄 개수 (1 ~ 5개) ==> ");
        int bullet = sc.nextInt(); // 실탄 개수를 입력받을 변수
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        int bulletPos = (int)(Math.random() * bullet) + 1 ;
        int randomPos = (int)(Math.random() * 6) + 1; // 탄창 실린더 최대값은 6

        // 총을 돌릴 첫 번째 순서 정하기
        int turn = (int)(Math.random() * players.length - 1);

        // 게임이 끝나는 케이스
        // 실탄 개수가 게임인원수 - 1이면 생존자가 최후 1명이면 게임이 끝나는 케이스
        // 나머지 케이스는 총알이 소진되면 게임이 끝나는 케이스
        
        // 생존자가 1명만 남아야 게임이 끝나는 케이스
        int survivor = players.length;
        while (true) {
            System.out.println("총을 돌렸습니다. " + players[turn] + "부터 시작합니다.\n");

            System.out.printf("[%s님의 턴!] 탄창 실린더를 무작위로 돌립니다.\n", players[turn]);
            System.out.println("# 엔터를 누르면 격발합니다.");

            if (bulletPos == randomPos) {
                System.out.println("빵!!" + players[turn] + "님 사망...");
                survivor--;
            } else {
                System.out.println("휴... 살았습니다.");
            }

            if (survivor == 1) break;

//            if (bullet == players.length - 1) {
//            }
        }

//        System.out.println("총을 돌렸습니다. " + players[0] + "부터 시작합니다.");
//        System.out.printf("[%s님의 턴!] 탄창 실린더를 무작위로 돌립니다.\n", players[0]);
//        System.out.println("# 엔터를 누르면 격발합니다.");

    }
}
