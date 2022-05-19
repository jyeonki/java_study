package day02;

public class Practice {

    public static void main(String[] args) {

        int x = 3;
        int y = ++x + 5 * 3;
        int z = 5 * y-- + x++ - --y;

        System.out.println("x = " + x); // 5
        System.out.println("y = " + y); // 17
        System.out.println("z = " + z); // 82


    }
}
