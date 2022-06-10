package day13.poly.car;

import utility.Util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Granduer g1 = new Granduer();
        Car g2 = new Granduer();
        Granduer g3 = new Granduer();

        Car m1 = new Mustang();
        Mustang m2 = new Mustang();

        Stinger s1 = new Stinger();
        Stinger s2 = new Stinger();



//    Granduer[] granduers = {g1, g2, g3};
//
//    for (Granduer g : granduers) {
//        g.run();
//    }

        Car[] cars = {g1, g2, g3, m1, m2, s1, s2
                      ,new Granduer(), new Mustang(), new Stinger()};

        for (Car c : cars) {
            c.run();
        }

        Object[] oArr = {10, 3.3, "하하호호", new Mustang(), true};
        // 가능하지만 추천은 하지 않는다.

        //
        int a = 1;
        long b = 2L;
        double c = 1.1;

        double[] dArr = {a, b, c};
        //


        System.out.println("===================================================================");


        Driver kim = new Driver();
//        kim.driveMustang(new Mustang());
//        kim.driveGranduer(new Granduer());
        kim.drive(new Stinger());
        kim.drive(new Stinger());


        Car myCar = kim.buyCar("그랜져");
        myCar.run();

        kim.buyCar("머스탱").run();

//        new Driver().buyCar("").run(); // null.run(); error
        
        kim.drive(kim.buyCar("스팅어"));


        System.out.println("===================================================================");


        Mustang mm = new Mustang();
        Car cc = mm; // upCasting           // 자식이 부모타입이 되었다가 다시 자기자신으로 돌아오는거
        mm = (Mustang) cc; // downCasting

        System.out.println("mm = " + mm);
        System.out.println("cc = " + cc);
        // 변수의 타입이 다를 뿐 가리키는 주소는 같다
        
        
        // 안되는 문법 - 부모객체를 자식타입으로 변환할 수 없음
//        Car ccc = new Car();
//        Mustang mmm = (Mustang) ccc; // ClassCastException


        System.out.println("===================================================================");


        Car myMs = kim.buyCar("머스탱");
        myMs.run();
//        myMs.joinMustangClub(); // Mustang타입이 아니라  Car타입이므로 joinMustangClub()을 쓸 수 없다.
        // joinMustangClub() - Mustang의 오리지널 기능

        Mustang myMs2 = (Mustang) kim.buyCar("머스탱");
        myMs2.run();
        myMs2.joinMustangClub();
        // 부모기능, 자신의 original 기능 모두 쓸 수 있다.
        
        Util.line();
        
        CarShop shop = new CarShop();
        int money = shop.sellCar(new Car());
        System.out.println("money = " + money);

        Util.line();

        cast(m1);
        
    } // end main

    public static void cast(Object o) {
        
        if (o instanceof  String) { // o가 String인지 확인하기
            String s = (String) o; 
            System.out.println("스트링 변환 성공!");
        } else {
            System.out.println("변환 불가능!");
        }
    }


}
