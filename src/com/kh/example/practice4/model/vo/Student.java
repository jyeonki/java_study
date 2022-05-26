package com.kh.example.practice4.model.vo;

public class Student {

    // field
    int grade;
    int classroom; // class는 예약어라 쓸 수 없음
    String name;
    double height;
    char gender;


    // constructor
    public Student() {

    }

    public Student (int stGrade, int stClassroom, String stName, double stHeight, char stGender) {
        grade = stGrade;
        classroom = stClassroom;
        name = stName;
        height = stHeight;
        gender = stGender;
    }


    // method
    public void information() {
        System.out.printf("%d학년 %d반 %s 정보:\n키 - %.2fCM, 성별 - %s\n", grade, classroom, name, height, gender );
    }

}
