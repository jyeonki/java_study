package day15.inter;

// 사냥 가능한 동물들을 규격화
public interface Huntable {

    // interface 의 경우 그냥 변수정의를 해도 자동으로 public static final이 붙는다.
    // 따라서 반드시 초기화를 시켜주어야 한다.


    // 함수들은 자동으로 public이 붙는다.
    void hunt(String target);

}
