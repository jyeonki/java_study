package com.kh.example.practice1.model.vo;

public class Member {

    // field
    String memberId;
    String memberPwd;
    String memberName;
    int age;
    char gender;
    String phone;
    String email;


    // 생성자
    public Member() {}


    // method
    // 이름을 바꾸는 기능
    public void changeName(String name) { // 변수는 일시적, 필드는 영원하다
        memberName = name;
    }

    // 이름을 출력하는 기능
    public void printName() {
        System.out.printf("이름: %s\n", memberName);
    }

}
