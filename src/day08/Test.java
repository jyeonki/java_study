package day08;

import day08.fruit.*;
//import day08.fruit.Apple;
//import day08.fruit.Banana;
//import day08.fruit.Grape;

public class Test {

    public static void main(String[] args) {

       Apple apple2 = new Apple();
       Apple apple3 = new Apple();

       // 다른 패키지에 있는 클래스는 풀네임을 명시해야 한다.
       // day08.fruit.Apple apple = new day08.fruit.Apple();
       // 풀네임을 명시하거나 import를 써주거나

       Banana banana = new Banana();

       Grape grape = new Grape();

    }
}
