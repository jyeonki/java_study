package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

import java.util.Arrays;

public class StudentMenu {

    private StudentController ssm;

    public StudentMenu() {
        ssm = new StudentController();
        // 학생정보와 성적, 결과출력하는 기본생성자

        System.out.println("========== 학생 정보 출력 ==========");

        Student[] students = ssm.printStudent();
        for (Student s : students) {
            System.out.println(s.inform());
        }

        System.out.println("========== 학생 성적 출력 ==========");

        double[] scores = ssm.avgScore();
        System.out.printf("학생 점수 합계: %d\n", (int)scores[0]);
        System.out.printf("학생 점수 평균: %.2f\n", scores[1]);

        System.out.println("========== 성적 결과 출력 ==========");

        for (Student s : students) {
            if (s.getScore() >= ssm.CUT_LINE) { // 학생 점수가 커트라인보다 높으면
                System.out.printf("%s학생은 통과입니다.\n", s.getName() );
            } else {
                System.out.printf("%s학생은 재시험 대상입니다.\n", s.getName());
            }
        }

    }
}
