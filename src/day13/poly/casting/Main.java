package day13.poly.casting;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1(); // 부모의 1번 메서드
        parent.m2(); // 부모의 2번 메서드
        // 자식은 부모 것을 쓸 수 있어도 부모는 자식 것을 쓸 수 없다.


        System.out.println("====================================================");


        Child child = new Child();
        child.m1(); // 부모의 1번 메서드
        child.m2(); // 오버라이딩이 된 2번 메서드
        child.m3(); // 자식의 3번 메서드


        System.out.println("====================================================");


        Parent child2 = new Child();
        child2.m1(); // 부모의 1번 메서드
        child2.m2(); // 오버라이딩이 된 2번 메서드
//        child2.m3(); // upCasting 되면 child의 오리지널 기능인 m3()를 쓸 수 없다.
        ((Child)child2).m3(); // Child로 돌아가기

    }
}
