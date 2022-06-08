package day10.encap;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");
//        myCar.speed = -9999;
//        myCar.mode = 'R';
        myCar.setSpeed(60);

        System.out.println("현재 속도: " + myCar.getSpeed());

        myCar.setMode('R');
        System.out.println("현재 모드:  " + myCar.getMode());

        Car car = new Car("소나타");
        
        // 시동 먼저 걸고 -> 엔진오일 순환 -> 연료를 주입 -> 실린더 작동
        car.engineStart();
//        car.injectOil();
//        car.injectGasolin();
//        car.moveCylinder();

        car.setMode('D');
        car.setSpeed(100);
//        car.setSpeed(0);

        car.engineStop();




    }
}
