package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.Scanner;

import static com.kh.practice.chap01_poly.controller.LibraryController.*;


public class LibraryMenu {

    private LibraryController lc;
    private Scanner sc;

    public LibraryMenu() {
        lc = new LibraryController();
        sc = new Scanner(System.in);
    }

    public void mainMenu() {

        // add on demand static import (import static)
        // System 생략이 가능하다. import static을 쓰고 System을 써도 상관은 없지만,그러면 import static을 쓴 의미가 없다
        System.out.println("# 회원 정보를 입력해주세요.");  
        System.out.printf("이름: ");
        String name = sc.next();

        System.out.printf("나이: ");
        int age = sc.nextInt();

        System.out.printf("성별(M/F): ");
        char gender = sc.next().charAt(0);

        lc.insertMember(new Member(name, age, gender));

        while (true) {
            System.out.println("\n============= 도서 메뉴 ==============");
            System.out.println("# 1. 마이페이지");
            System.out.println("# 2. 도서 전체 조회");
            System.out.println("# 3. 도서 검색");
            System.out.println("# 4. 도서 대여하기");
            System.out.println("# 9. 프로그램 종료하기");
            System.out.printf("- 메뉴 번호: ");
            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.println(lc.myInfo().toString()); // toString() 생략가능
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로세스 종료
                default:
                    System.out.println("# 메뉴 번호를 잘못 입력했습니다.");
            }

        }
    }

    private void rentBook() {

        System.out.println("\n================ 대여 도서 목록 ==================");
        selectAll();

        System.out.printf("# 대여할 도서 번호 입력: ");
        int bookNo = sc.nextInt();

        int result = lc.rentBook(bookNo - 1);

        switch (result) {
            case RENT_SUCCESS: // LibraryController.RENT_SUCCESS // add on demand static import (import static)
                System.out.println("# 성공적으로 대여 되었습니다.");
                break;
            case RENT_SUCCESS_WITH_COUPON:
                System.out.println("# 성공적으로 대여되었습니다. " +
                        "요리학원 쿠폰이 발급되었으니 " +
                        "마이페이지에서 확인하세요");
                break;
            case RENT_FAIL:
                System.out.println("# 나이 제한으로 대여할 수 없습니다.");
                break;

        }
    }

    private void searchBook() {

        System.out.print("\n# 검색어: ");
        String keyword = sc.next();

        Book[] books = lc.searchBook(keyword);

        if (books.length == 0) {
            System.out.println("# 검색된 도서가 없습니다.");
        } else {
            System.out.printf("\n================= 검색 결과(검색어: %s) ==================\n", keyword);
            for (Book b : books) {
                System.out.println(b.toString()); // toString() 생략가능
            }
        }

    }

    private void selectAll() {
        Book[] books = lc.selectAll();
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d번째 도서: %s\n", i+1, books[i].toString());
        }
    }
}