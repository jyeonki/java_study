package day07;

import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {

        String str = "hello java";

        // charAt(index) : 문자열 인덱스에 따른 단일문자 반환
        char c = str.charAt(4);
        System.out.println("c = " + c);


        // substring(beginIdx, endIdx) 
        // 문자열의 특정 범위를 추출
        String ss1 = str.substring(0, 5); // 0번이상 5번미만 슬라이싱
        System.out.println("ss1 = " + ss1); // ss1 = hello

        String ss2 = str.substring(6); // 6번부터 끝까지 슬라이싱
        System.out.println("ss2 = " + ss2); // ss2 = java


        // length(): 문자열의 총 길이 반환
        int len = str.length();
        System.out.println("len = " + len); // len = 10


        // indexOf(str)
        // 해당 문자가 존재하지 않으면 -1을 리턴
        int idx1 = str.indexOf("l"); // 앞에서부터 탐색
        System.out.println("idx1 = " + idx1); // idx1 = 2
        
        int idx2 = str.lastIndexOf("l"); // 뒤에서부터 탐색
        System.out.println("idx2 = " + idx2); // idx2 = 3


        // 일괄 대소문자 변경
        String str2 = "HeLLo PORorO";
        String lower = str2.toLowerCase(); // 소문자 변경
        System.out.println("lower = " + lower); // lower = hello pororo

        String upper = str2.toUpperCase(); // 대문자 변경
        System.out.println("upper = " + upper); // upper = HELLO PORORO
        
        
        // replace(old, new) : 문자열 내부에 old문자를 모두 탐색하여 new문자로 변경
        String str3 = "python study, python app, python data";
        String replace = str3.replace("python", "java");

        System.out.println("replace = " + replace); // replace = java study, java app, java data

        // 파일 경로에서 확장자 추출
        String filepath = "D:/local/img/2022/05/26/lalalala.jpg";
        String ext = filepath.substring(filepath.lastIndexOf(".") + 1);

        System.out.println("ext = " + ext);

        // 이미지파일인지 확인하기
        switch (ext.toLowerCase()) { // 이미지파일 확장자가 대문자도 이미지파일이다, 그러므로 받을 때 일괄 소문자로 변경 후 체크
            case "jpg": case "gif": case "png": case "svg":
                System.out.println("이미지 파일입니다");
                break;
            default:
                System.out.println("이미지 파일이 아닙니다.");
        }


        // 문자열의 정수 변환
        String s1 = "100";
        String s2 = "200";

        // 문자열 -> 정수 : Integer.parseInt(str)
        // 문자열 -> 실수 : Integer.parseDouble(str)
        // 문자열이 아닌 것 -> 문자열 : String.valueOf(data)

        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println("sum = " + sum);



    }
}
