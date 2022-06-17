package day18.comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> pList = new ArrayList<>();
        pList.add(new Person("송철수", 33));
        pList.add(new Person("박영희", 41));
        pList.add(new Person("차범근", 11));
        pList.add(new Person("김송희", 21));
        
        // 나이 순으로 오름차 정렬 (나이 적은 순)
        pList.sort(new AgeAscendingComparator());

        for (Person p : pList) {
            System.out.println(p);
        }

    }
}
