package codingtest.chap06;

import java.util.Arrays;

public class Question03 {

    public static void main(String[] args) {

        // 초간단 풀이
        /*
        String s = "baekjoon";
        for (char c = 'a'; c <= 'z'; c++)
            System.out.print(s.indexOf(c) + " ");
        */

        String S = "baekjoon";

        // 알파벳 위치 배열
        int [] alphaPos = new int[26];
        // 배열값을 모두 -1로 초기화
//        Arrays.fill(alphaPos, -1); // 밑에 for문이랑 같음
        for (int i = 0; i < alphaPos.length; i++) {
            alphaPos[i] = -1;
        }


        for (int i = 0; i < S.length(); i++) {
            char c1 = S.charAt(i); // 'b' - 98
            if (alphaPos[(int)c1 - 97] != -1) continue; // (int) 안 적어도 됨. 문자 + 숫자 = int 숫자
            alphaPos[(int)c1 - 97] = i; // (int) 안 적어도 됨
        }


//        System.out.println(Arrays.toString(alphaPos));

        for (int n : alphaPos) {
            System.out.printf("%d ", n);
        }

        /*
        // 'b' -> 문자열에서는 0번 인덱스 -> 알파벳배열에서는 1번인덱스
        // 'a' -> 문자열에서는 1번 인덱스 -> 알파벳배열에서는 0번인덱스
        // 'e' -> 문자열에서는 2번 인덱스 -> 알파벳배열에서는 4번인덱스
        // 'k' -> 문자열에서는 3번 인덱스 -> 알파벳배열에서는 10번인덱스

        char c1 = S.charAt(0); // 'b' - 98(아스키코드)
        alphaPos[1] = 0;

        char c2 = S.charAt(1); // 'a' - 97
        alphaPos[0] = 1;

        char c3 = S.charAt(2); // 'e' - 101
        alphaPos[4] = 2;

        char c4 = S.charAt(3); // 'k' - 107
        alphaPos[10] = 3;

        char c5 = S.charAt(4); // 'j' - 106
        alphaPos[9] = 4;

        char c6 = S.charAt(5); // 'o' - 111
        alphaPos[14] = 5;

        char c7 = S.charAt(6); // 'o' - 111
//        alphaPos[14] = 6; // 중복값은 처음 등장한 숫자를 넣어야하므로

        char c8 = S.charAt(7); // 'n' - 110
        alphaPos[13] = 7;
        */

    }
}
