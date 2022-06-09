package day12.final_;

class Child extends Parent{
//    void m1() {} // final

    @Override
    void m2() {}

    @Override
    void m3() {}
}
/*
// 상속제한
public final class Parent { // public은 파일명과 똑같은 class에만 붙일 수 있다
    // final -> 이 class는 최종본이야 수정하거나 추가하지마!
    // final이 붙여진 class는 상속 받을 수 없다
    void m1() {}
    void m2() {}
    void m3() {}
}
*/

public class Parent {
    final void m1() {} // 오버라이딩 제한
    void m2() {}
    void m3() {}
}