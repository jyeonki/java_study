package day02;

public class ConditionalOperator {

    public static void main(String[] args) {

        int x = -3;

        int abs = (x >= 0) ? x : -x;
        System.out.println("절대값: " + abs); // 3

    }
}

