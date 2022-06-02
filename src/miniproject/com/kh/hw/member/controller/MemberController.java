package miniproject.com.kh.hw.member.controller;

import miniproject.com.kh.hw.member.model.vo.Member;

public class MemberController {

    private Member[] m = new Member[SIZE];

    public static final int SIZE = 10;


    // 생성자
    public MemberController() {
        m[0] = new Member("hgd220602","홍길동", "부장", "abc@naver.com", "010-1234-5678", 4);
        m[1] = new Member("kcs220602", "김철수", "대리", "def@naver.com", "010-4567-1234", 5);
    }

    // 메서드


}