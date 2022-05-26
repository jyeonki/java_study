package day07;

public class FieldVariable {

    // 필드랑 변수의 차이
    int[] a; // field // class안에서 생성된 변수
    /*
        - 지역 변수는 반드시 초기화가 되어 있어야 참조가 가능합니다.
        - 필드는 초기화를 하지 않아도 자동으로 각 타입의 기본값을 초기화됩니다.
        - 매개변수는 메서드 호출시 강제로 값이 대입되므로 따로 초기화 할 필요가 없습니다.
    */
    void m1(int c) { // c는 parameter 매개변수
        int b = 1; // local variable 지역변수
        System.out.println("a = " + a);
        System.out.println("b = " + b); // 지역변수 선언만 하고 값을 초기화하지 않으면 Error
        System.out.println("c = " + c);
    }

    // 지역변수랑 매개변수는 stack에 저장된다
    // stack은 좁다. 지역변수를 선언만 하고 초기화하지 않으면 쓸모가 없다. 그러므로 초기화해야한다.
    // b는 m1호출이 끝나면 죽는다. 사용할 수 없다


    public static void main(String[] args) {

        FieldVariable fv = new FieldVariable(); // 객체 생성

        fv.m1(10); // m1을 호출하려면 객체를 생성하여 한다
        // void앞에 static을 적으면 호출이 되긴 하지만 여기선 객체를 설명하기 때문에 static을 쓰지 않겠다

        // 출력
        /*
        a = null; // 필드는 초기화를 하지 않으면 각 타입의 기본값으로 초기화됨 (8개 타입을 빼면 모든 기본값은 null)
        b = 1;
        c = 10;
        */

        System.out.println(fv.a); // null

    }
}
