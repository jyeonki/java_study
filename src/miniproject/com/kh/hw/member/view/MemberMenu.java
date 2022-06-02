package miniproject.com.kh.hw.member.view;

import miniproject.com.kh.hw.member.controller.MemberController;

import java.util.Scanner;

public class MemberMenu {

    Scanner sc = new Scanner(System.in);

    private MemberController mc = new MemberController();


    // 메서드
    public void mainMenu() {
        while (true) {
            System.out.println("======================== 직원 월급 관리 프로그램 ========================");
            System.out.println("# 1. 직원 등록");
            System.out.println("# 2. 직원 정보 조회");
            System.out.println("# 3. 직원 정보 수정");
            System.out.println("# 4. 직원 삭제");
            System.out.println("# 9. 끝내기");
            System.out.print("메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 1. 신규 직원 등록
//                    insertMember();
                    break;
                case 2:
                    // 2. 직원 정보 조회
//                    searchMember();
                    break;
                case 3:
                    // 3. 직원 정보 수정
//                    updateMember();
                    break;
                case 4:
                    // 4. 직원 삭제
//                    deleteMember();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로세스 종료
                    break;
                default:
                    System.out.println("잘못된 메뉴를 입력하였습니다.");
            }
        } // end while

    } // end mainMenu

} // end class