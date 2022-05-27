package day08.modi.pac1;

public class B {
    
    // 오버로딩 조건: 매개변수의 타입, 순서, 개수가 달라야함, 변수 이름은 중요하지 않음
    public B(String s) {}
    B(int x) {}
    private B(double d) {}

    B b1 = new B("헬로우");
    B b2 = new B(100);
    B b3 = new B(5.5);


    void test() {
        A a = new A(); // 같은 패키지라서 import 안 써도 됨
        a.f1 = 10; // public
        a.f2 = 20; // default : 같은 클래스, 같은 패키지만
        // a.f3 = 30; // private : 같은 클래스만

        a.m1(); // public
        a.m1(); // public
        a.m2(); // default
        // a.m3(); // private

    }
}
