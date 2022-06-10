package day12.final_;

public class Korean {

    String name;    // 이름
    final String id;// 주민번호

    // 상수: 불변성과 유일성을 모두 만족
    public static final String nation;  // 국적

    static {
        nation = "대한민국";
    }

    public Korean(String name, String id, String nation) {
        this.name = name;
        this.id = id;
//        this.nation = nation;

    }
    // final을 지정하려면 초기화가 되어있어야한다
    // 그래서 nation은 final로 지정이 불가능하다
    // 값을 정해놓으면 final이 가능하다


    /*
    // 상수: 불변성과 유일성을 모두 만족
    final String nation;  // 출신국가

    public Korean(String name, String id, String nation) {
        this.name = name;
        this.id = id;
        this.nation = nation;
    }
    // 이렇게 하면 객체를 생성할 때 말고는 국적을 바꿀 수 없다.
    // 하지만 처음 국적을 입력할 때 한국인인데 다른 나라를 적을 수 있어서 유일성에 문제가 생긴다.
    */

    @Override
    public String toString() {
        return "이름: " + name + ", 주민번호: " + id + ", 국적: " + nation ;
    }
    
    // 주민번호를 바꾸는 메서드
    public void changeId(String id) {
        // this.id = id;
        // id설정이 private이면 가능하지만, final은 같은 클래스 안에서도 값을 바꿀 수 없다

    }

}
