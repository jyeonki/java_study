package day13.poly.basic;


class A {} // A는 extends Object
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Poly {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        a = b;

        A x1 = b;
        A x2 = new B();
        A x3 = c;
        A x4 = new D();
        A x5 = e;

        B y1 = new D();
        C y2 = new E();

        // B y3 = new E(); // 상속관계가 아니면 다형성이 적용되지 않음
        // D y4 = new E();


        Object z1 = new E();
        // E의 부모인 C
        // C의 부모인 A
        // A의 부모인 Object, 다 가능하다

        // B z2 = new A(); // 부모 객체가 자식타입을 가질 수 없음

        double dd = 3.3;
        int nn = (int)dd; // 큰거를 작은거에 넣으려면 형변환이 필요하다
        dd = nn;


    }
}
