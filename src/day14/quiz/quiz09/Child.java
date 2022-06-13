package day14.quiz.quiz09;

public class Child extends Parent {
    private String name; public Child() { 
        this("홍길동");
        // this(); super();는 둘 중 하나만 쓸 수 있다
        System.out.println("Child() call");
    }
    public Child(String name) { 
        this.name = name; 
        System.out.println("Child(String) call");
    }
}
