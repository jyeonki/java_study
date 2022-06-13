package day14.quiz.quiz08;

public class Child extends Parent {

    public Child(String name) {
        super(); // 부모클래스에 기본 생성자 생성하면 컴파일 에러가 해결된다.
        this.name = name;
    }
}
