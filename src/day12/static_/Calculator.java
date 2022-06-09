package day12.static_;

public class Calculator {

    public String company; //제조사
    public String color; // 색상
    public static double PI; // 원주율

    // static initializer : 정적 초기화자
    // static 데이터의 초기화를 담당
    static {
        System.out.println("정적 초기화자 호출!");
        PI = 3.14159;
    }

    public Calculator(String company, String color) {
        this.company = company;
        this.color = color;
        this.PI = 3.14159;
    }

    public void 색상을_입히다(String color) {
        this.color = color;
    }

    public static double 원의_넓이를_구하다(int r) {
        return PI * r * r;
    }

    public static void main(String[] args) {


        System.out.println("원주율: " + Calculator.PI);

        Calculator.원의_넓이를_구하다(5); // 어떤 계산기든지 상관없을 때, 어떤 계산기든 원주율은 같다

        Calculator sharp = new Calculator("삼성", "회색");
//        Calculator.색상을_입히다("red"); // 어떤 계산기에 색상을 입혀야하나? -> 객체 생성해야함
        sharp.색상을_입히다("red");



    }


}
