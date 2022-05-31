package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Test {

    public static void main(String[] args) {

        MemberController mc = new MemberController();

//        System.out.println(mc.existMemberNum());
//
//        int index = mc.findIndexById("ghj1234"); // 테스트를 위해 private을 public으로 바꿈
//        System.out.println("index = " + index);
//
//        System.out.println(mc.checkId("def11"));

//        mc.insertMember("zzz", "김출수", "1111", "zzz@zzz.zzz", 'M', 33);
//
//        System.out.println(mc.existMemberNum());
//        System.out.println(mc.checkId("zzz"));
//
//        Member member = mc.searchId("abc");
//        System.out.println(member.inform());
//
//        Member[] members = mc.searchName("김철수");
//        for (Member m : members) {
//            System.out.println(m.inform());
//        }
        Member member = mc.searchId("abc");
        System.out.println(member.inform());

        mc.updateName("abc","냥냥이");
        mc.updateEmail("abc", "djskfjsdk@dmsfmd.com");

        member = mc.searchId("abc");
        System.out.println(member.inform());

        mc.delete();
        System.out.println(member.inform());


    }
}
