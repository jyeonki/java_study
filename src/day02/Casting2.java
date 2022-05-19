package day02;

public class Casting2 {

    public static void main(String[] args) {
        
        // downCasting: 하위 타입 변환
        // 다운캐스팅 시 값의 손실이 일어날 수 있음.

        // 0011 1110 1000
        int n = 1000;
        byte m = (byte) n; // 직접 바꾼 다음에 변수 m에 넣는다 

        System.out.println("m = " + m); // m = -24

        double k = 5.556;
        int j = (int) k;

        System.out.println("j = " + j); // j = 5
        
    }
}
