package day12.static_;

public class Main {

    public static void main(String[] args) {

        System.out.println(Count.y); // static은 객체 생성없이 가능
        System.out.println(Math.PI);


        Count c1 = new Count();
        c1.x = 10;
        c1.x++;

        c1.y = 20;
        c1.y--;

        System.out.printf("c1.x: %d, c1.y: %d\n", c1.x, c1.y);

        Count c2 = new Count();

        c2.x = 100;
        c2.y = 200;

        System.out.printf("c2.x: %d, c2.y: %d\n", c2.x, c2.y);




        /*
        System.out.println(Count.y);
        System.out.println(Math.PI);

        Count c1 = new Count();
        c1.x = 10;
        c1.x++;
        c1.m1();

        Count.y = 20;
        Count.y--;


        Count c2 = new Count();


        c2.x = 100;
        c2.m1();
        Count.y = 200;

        System.out.printf("c1.x: %d, c1.y: %d\n", c1.x, Count.y);
        System.out.printf("c2.x: %d, c2.y: %d\n", c2.x, Count.y);

        System.out.println("====================");

        c1.m1();
        Count.m2();
        */
    }
}
