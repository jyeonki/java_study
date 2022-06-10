package com.kh.practice.chap01_poly;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;
import utility.Util;

public class Test {

    public static void main(String[] args) {

        LibraryController libraryController = new LibraryController();

        // 회원 생성 후 가입
        libraryController.insertMember(new Member("김철수", 15, 'M'));

        // 회원 조회
        System.out.println(libraryController.myInfo());


        Util.line();


        // 도서 목록 전체 조회
        for (Book book : libraryController.selectAll()) {
            System.out.println(book);
        }


        Util.line();


        // 도서 검색
        for (Book book : libraryController.searchBook("의")) {
            System.out.println(book);
        }

//        Book[] books = libraryController.searchBook("의");
//
//        for (Book book : books) {
//            System.out.println(book);
//        }
    }
}
