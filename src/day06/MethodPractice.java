package day06;

import java.util.Arrays;

public class MethodPractice {
    static String[] foods = {"떡볶이", "치킨", "파스타"};

    // 배열에 마지막 위치에 데이터를 추가하는 함수
    static void push(String newFood) {
        // System.out.println(foods); // main 함수내의 지역변수이므로 쓸 수 없다.
        // 쓰려면  static String[] foods = {"떡볶이", "치킨", "파스타"};를 class안으로 옮겨서 전역변수처럼 쓸 수 있다 (전역변수라는 개념은 없음)

        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
    }
    // 배열 내부데이터 출력함수
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 배열의 index가 리턴되는 함수
    static int indexOf(String target) {
        int index = -1; // 찾은 인덱스를 저장할 변수
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 배열에서 데이터를 제거하는 함수
    static void remove(String target) {
        int delIdx = indexOf(target);
        if (delIdx > -1) {
            for (int i = delIdx; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }
        } else {
            System.out.println("존재하지 않는 음식명입니다. ");
            return; // 함수탈출문!!!!!!!!
        }
        String[] temp = new String[foods.length - 1];

        for (int i = 0; i < foods.length - 1; i++) {
            temp[i] = foods[i];
        }
        foods = temp; temp = null;
    }

    // 배열에 데이터가 있는지 확인하는 함수
    static boolean include(String target) {
        int includeIdx = indexOf(target);
        boolean hasFood = includeIdx != -1;
        return hasFood;
    }

    // 배열에 데이터를 추가하는 함수
    static void insert(int targetIdx, String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length + 1; i++) {
            if (i < targetIdx) {
                temp[i] = foods[i];
            } else if (i == targetIdx) {
                temp[i] = newFood;
            } else {
                temp[i] = foods[i - 1];
            }
        }
        foods = temp; temp = null;
    }

    // 배열에 데이터를 수정하는 함수
    static void modify(int targetIdx, String food) {

    }


    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();
        
        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");

        System.out.println("idx = " + idx);
        System.out.println("idx2 = " + idx2);
        System.out.println("idx3 = " + idx3);


        remove("김치찌개"); // foods배열에서 김치찌개 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        printFoods();

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        System.out.println("존재 유무 = " + flag);
        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴
        System.out.println("존재 유무 = " + flag2);


        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        printFoods();


//        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
//        clear();  // foods배열 모든 데이터 삭제


    }
}
