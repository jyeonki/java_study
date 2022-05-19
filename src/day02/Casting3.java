package day02;

public class Casting3 {

    public static void main(String[] args) {
        
        // 타입이 다른 데이터의 연산에서는
        // 작은 쪽을 큰 쪽으로 변환한 후 연산을 진행
        int a = 10;
        short b = 30;
        int c = a + b;


        // 문자열 + 숫자 = 문자열
        // 단일문자 + 숫자 = 숫자
        char d = 'A'; // 65
        int e = 2;
        System.out.println(d + e); // 컴퓨터는 d를 char에서 int로 변환한다

        char f = (char) (d + e); // (char) (65+2)
//        char f = (char) d + e; // 이렇게 쓰면 d한테만 붙음(근데 이미 d는 char타입)
        System.out.println("f = " + f); // C

        System.out.println(3.0 + 5); // 8.0 (*주의 데이터가 작은 int를 double로 변환한 후 계산)

        
        /*
            int보다 작은 데이터 (byte, short, char)끼리의 연산은
            결과가 자동으로 int로 변환되어 처리
            (데이터 오버플로우, 언더플로우 방지)
        */
        byte b1 = 100;
        byte b2 = 20;
        int result = b1 + b2;

        System.out.println('A' + 'B'); // 131 char
        System.out.println("A" + "B"); // AB string

    }
}
