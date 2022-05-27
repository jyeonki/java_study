package day08.player;

public class Main {

    public static void main(String[] args) {

        Player kim = new Player("김철수", 1, 50);
        Player park = new Player("박찬호", 1, 50);

        /*
        kim.name = "김철수";
        park.name = "박찬호";

        kim.level = 1;
        park.level = 1;

        kim.hp = 50;
        park.hp = 50;
        */

        System.out.println("kim = " + kim);
        System.out.println("park = " + park);

        // park.attack(new Player("김뽀삐", 1, 50)); // 매개변수가 Player target이니까
        // 김뽀삐는 변수에 담지 않았으니까 재활용은 불가능하다
        // new Player("멍멍이", 1, 250).attack(kim);

        park.attack(kim);
        park.attack(park);

    }
}
