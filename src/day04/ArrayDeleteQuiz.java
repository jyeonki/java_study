package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 우리반 학생들의 별명: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");

        while (true) {
            System.out.println("삭제 할 학생의 별명을 입력하세요!");
            System.out.print("> ");

            String targetName = sc.nextLine();
            int index = -1;

            // 입력받은 값이 존재하는지 확인하고 값이 존재한다면 해당하는 index 찾기
            for (int i = 0; i < students.length ; i++) {
                if (targetName.equals(students[i])) {
                    index = i;
                    break;
                }
            }

            // 존재 유무 확인
            if (index != -1) {
                System.out.printf("%s의 별명을 삭제합니다. \n", targetName);

                // 삭제
                int delIdx = index; // 삭제 할 대상의 인덱스
                for (int i = delIdx; i < students.length - 1; i++) {
                    students[i] = students[i + 1];
                }

                // pop
                String[] temp = new String[students.length - 1];

                for (int i = 0; i < students.length - 1; i++) {
                    temp[i] = students[i];
                }
                students = temp; temp = null;

                System.out.println("* 삭제 후 정보: " + Arrays.toString(students));
                sc.close(); // 이거 위치 잘 설정하기!!!
                break;

            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다. \n", targetName);
            }



            /*
            Scanner sc = new Scanner(System.in);

            String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
            System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(students));

            while (true) {
                System.out.println("- 삭제할 학생의 별명을 입력하세요! ");
                System.out.print("> ");
                String target = sc.next();

                //탐색
                int index = -1;
                for (int i = 0; i < students.length; i++) {
                    if (target.equals(students[i])) {
                        index = i;
                        break;
                    }
                }

                //찾았는지 확인 후 삭제 진행
                if (index != -1) {
                    System.out.println(students[index] + "의 별명을 삭제합니다.");

                    //삭제 알고리즘
                    for (int i = index; i < students.length - 1; i++) {
                        students[i] = students[i + 1];
                    }
                    String[] temp = new String[students.length - 1];
                    for (int i = 0; i < students.length - 1; i++) {
                        temp[i] = students[i];
                    }
                    students = temp;
                    System.out.println("* 삭제 후 정보: " + Arrays.toString(students));
                    sc.close();
                    break;
                } else {
                    System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", target);
                }
            }
            */

        }

    }
}
