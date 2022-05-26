package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

// 실행용 class
public class Run {

    public static void main(String[] args) {

        Member kim = new Member();
        kim.changeName("김똘똘");
        kim.printName();

    }
}
