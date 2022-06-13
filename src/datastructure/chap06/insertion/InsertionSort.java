package datastructure.chap06.insertion;

import java.util.Arrays;

public class InsertionSort {

    //insertion sort
    public static void sort(int[] arr) {
        // 삽입할 항목 타겟팅 루프
        for (int i = 1; i < arr.length; i++) {
            // 삽입할 항목 빼놓기
            int temp = arr[i];

            int j = i; // 삽입할 위치 인덱스
            // 삽입할 위치 탐색
            // 삽입할 항목보다 큰 값들은 오른쪽으로 이동
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp; // 삽입할 위치에 삽입
        }
    }

    public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // 삽입정렬

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}