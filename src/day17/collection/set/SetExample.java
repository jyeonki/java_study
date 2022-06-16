package day17.collection.set;

import utility.Util;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        // Set: 중복 저장을 허용하지 않는다. 데이터 삽입 속도가 빠름, 순서없이 저장
        Set<String> set = new HashSet<>();


        // add(E e) : 객체 추가
        set.add("김말이");
        set.add("닭꼬치");
        set.add("단무지");
        set.add("김말이");
        set.add("김밥");
        boolean b1 = set.add("김말이");
        boolean b2 = set.add("김밥");


        System.out.println(set.size());
        System.out.println(set);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);


        Util.line();


        // set의 루프처리
        for (String s : set) {
            System.out.println(s);
        }


        // remove(obj) : 객체 삭제
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());


        Util.line();


        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(2,2,2,4,5,5,6,6,6,9,9)
        );
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numbers);
        System.out.println(numberSet);


//        numbers.clear();
//        numbers.addAll(numberSet);
        System.out.println(numbers);
    }
}
