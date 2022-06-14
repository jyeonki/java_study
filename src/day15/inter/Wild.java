package day15.inter;

// 보통 wild한 동물들은 사냥이 가능하고, 사납다
public interface Wild extends Huntable, Violent{
    // 인터페이스와 클래스는 상속이 안된다.
    // 인터페이스끼리는 상속이 가능하다, 다중상속도 가능

}
