package day16.api.string;

import utility.Util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {

    public static void main(String[] args) {

        String s = "라면 떡볶이 보쌈 짜장면";
        // 문자열 쪼개기
        String[] sArr = s.split(" ");
        System.out.println(Arrays.toString(sArr));


        String n = "1 2 3 4";
        // 문자열 쪼개기
        String[] nArr = n.split(" ");

        int[] numbers = new int[nArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(nArr[i]);
        }
        System.out.println(Arrays.toString(numbers));


        Util.line();


        // 문자열 쪼개기 - 2번
        StringTokenizer st = new StringTokenizer(s, " ");

//        st.nextToken();
//        st.nextToken();

//        System.out.println(st.countTokens());

//        while (st.hasMoreTokens()) {
//            System.out.print(st.nextToken() + " ");
//        }
//        System.out.print(st.nextToken() + " ");
//        System.out.print(st.nextToken() + " ");
//        System.out.print(st.nextToken() + " ");
//        System.out.print(st.nextToken() + " ");


        String[] foods = new String[st.countTokens()];
        for (int i = 0; st.hasMoreTokens(); i++) {
            foods[i] = st.nextToken();
        }

        System.out.println(foods.length);
        System.out.println(Arrays.toString(foods));


        Util.line();


        long ss = System.currentTimeMillis();
//        String str = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
//            str += (i+1);
            sb.append(i+1);
        }
        long ee = System.currentTimeMillis();

        System.out.println((ee - ss) + "ms"); // 1000밀리세컨드 = 1초

    }
}
