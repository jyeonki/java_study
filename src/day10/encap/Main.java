package day10.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");
//        myCar.speed = -9999;
//        myCar.mode = 'R';
        myCar.setSpeed(60);

        System.out.println("현재 속도: " + myCar.getSpeed());

        myCar.setMode('R');
        System.out.println("현재 모드:  " + myCar.getMode());
    }
}
