package day11.inherit;

// 자식 클래스 (sub class)
public class Warrior extends Player {

    public int rage; // 분노 게이지

    public Warrior(String name) {
//        super(); // Player(); // 숨겨져있다
//        super("전사");
        super(name); // Player();
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
//        System.out.println("Warrior 생성자 호출!");
    }

    public void rush() {
        System.out.println(name + "님이 돌진합니다.");
    }

    @Override // 오버라이딩 룰 체크
    public void showStatus() {
//        System.out.println("\n======== Character's Info ==========");
//        System.out.println("# name : " + name);
//        System.out.println("# level : " + level);
//        System.out.println("# hp : " + hp);
        super.showStatus(); //
        System.out.println("# rage : " + rage);
    }

}