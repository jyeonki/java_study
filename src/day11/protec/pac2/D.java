package day11.protec.pac2;

import day11.protec.pac1.A;

public class D extends A {

    public D() {

        super(30); // protected
//        super(30.3); // default

        A a = new A();
//        a.f1 = 2;
        this.f1 = 2;

        super.f1 = 2; // protected
//        super.f2 = 2; // default
        super.m1(); // protected
//        super.m2(); // default

    }
}
