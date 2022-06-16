package day17.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            array.add(i);
            linked.add(i);
        }


        // 배열리스트에서 데이터 제어
        long start, end; // 시작시간, 끝시간
        start = System.currentTimeMillis();
        int len = array.size();
        for (int i = 0; i < len; i++) {
//            array.remove(0); // 배열리스트 소요시간: 668ms
            array.get(i); // 배열리스트 소요시간: 0ms
        }


        end = System.currentTimeMillis();
        System.out.printf("배열리스트 소요시간: %dms\n", end - start);


        // 연결리스트에서 데이터 제어
        start = System.currentTimeMillis();
        len = linked.size();
        for (int i = 0; i < len; i++) {
//            linked.remove(0); // 연결리스트 소요시간: 0ms
            linked.get(i); // 연결리스트 소요시간: 3718ms
        }

        end = System.currentTimeMillis();
        System.out.printf("연결리스트 소요시간: %dms\n", end - start);
    }
}
