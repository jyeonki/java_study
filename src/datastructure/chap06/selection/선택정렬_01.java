package datastructure.chap06.selection;

import java.util.Scanner;

// 백준 1427
public class 선택정렬_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] A = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt("" + str.charAt(i));
        }

        for (int i = 0; i < A.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            int temp = A[i];
            A[i] = A[max];
            A[max] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }


    }
}