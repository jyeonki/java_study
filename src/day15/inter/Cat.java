package day15.inter;

// 구현 클래스가 인터페이스를 구현할 때는 implements 키워드 사용
public class Cat extends Animal implements Pet{

    @Override
    public void play() {
        System.out.println("고양이는 캣타워에서 혼자 놀아요~");
    }

    @Override
    public void eat() {

    }
}
