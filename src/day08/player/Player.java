package day08.player;

public class Player {

    String name; // 닉네임
    int level;   // 레벨
    int hp;      // 체력

    // 생성자
    Player() {
        this("이름없음"); // this()호출은 생성자 본문의 첫번째 구문이어야 한다
        System.out.println("1번 생성자 호출!");
//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = 50;
        // Player(); 생성자는 객체 생성할 때만 쓴다
    }
    
    // this: 나(객체)
    // this(): 나의 생성자

    Player(String name) {
        this(name, 1, 50);
        System.out.println("2번 생성자 호출!");
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
    }

    Player(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }
    
    void attack(Player target) { // 매개변수앞에 Player this가 숨겨져있다

        if (this == target) {
            System.out.println("스스로는 공격할 수 없습니다");
            return;
        }

        // 출력메시지 x가 y를 공격합니다.
//        System.out.println("target = " + target); // 공격대상인 kim의 주소와 같다
//        System.out.println("this = " + this);     // this의 주소는 park의 주소와 같다
        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);

        // 상대방의 체력을 10 낮추고 나의 체력을 5 회복시키기
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("나의 체력: %d, 상대방 체력: %d\n", this.hp, target.hp);

    }

    // 캐릭터 정보 출력 메서드
    void info() {
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n",name, level, hp);
    }
    
}
