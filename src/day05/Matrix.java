package day05;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        
        // 2차원 배열
        int[] [] scores = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {33, 44, 55}
        };
        System.out.println(Arrays.toString(scores)); // [[I@5594a1b5, [I@6a5fc7f7, [I@3b6eb2ec, [I@1e643faf]
        System.out.println(scores[1]); // [I@6a5fc7f7
        System.out.println(Arrays.deepToString(scores)); // [[10, 20, 30], [40, 50, 60], [70, 80, 90], [33, 44, 55]]

        System.out.println("score.length = " + scores.length);
        System.out.println("score[1].length = " + scores[1].length);
        System.out.println("score[2][1] = " + scores[2][1]);

        System.out.println(Arrays.toString(scores[1]));
        // System.out.println(Arrays.toString(scores[1][2])); // 이건 배열이 아니므로 안됨


        // 데이터 수정
        scores[2][1] = 77;
        // score[0] = 999; // score[0]은 배열
        scores[0] = new int[] {100, 200, 300}; // new int[] 꼭 써야함 (변수 선언시에만 생략 가능)
        System.out.println("==================================================");


        // 반복문 처리
        /*
        for (int[] arr : scores) {
            for (int n : arr) {
                System.out.printf("%3d ", n); // %3d (양수는 오른쪽 정렬) %-3d (음수는 왼쪽 정렬) 자리점유
            }
            System.out.println();
        }
        */
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%-4d ", scores[i][j]);
            }
            System.out.println();
        }
        System.out.println("==================================================");


        // 배열 생성문으로 2차원 배열 만들고 (3 X 5)
        int[][] arr2d = new int[3][5];

        arr2d[1][3] = 50;

        for (int[] ints : arr2d) { // iter적고 enter (for : 구문 만들기)
            for (int anInt : ints) {
                System.out.printf("%-4d ", anInt);
            }
            System.out.println();
        }


        // 3차원
        int[][][] arr3d = {
                {
                        {1, 2},
                        {3, 4},
                        {5, 6}
                },
                {
                        {7, 8},
                        {9, 10},
                        {11, 12}
                }
        };

        // 4 x 5 x 6 - 3차원 배열
        int[][][] arr3d_2 = new int[4][5][6];

    }
}
