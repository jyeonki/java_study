package day02;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이", cat = "야옹이";

        System.out.print(dog);
        System.out.print(cat);

        System.out.println(dog);
        System.out.println(cat);

        int month = 7;
        int day = 17;
        String anniversary = "제헌절";

        System.out.println(month + "월 " + day + "일은 " + anniversary + "입니다.");
        
        // 포맷 문자 형식
        // %d: 10진수 정수, %f: 실수, %s: 문자열, %c: 단일문자
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anniversary); // souf
        System.out.println(dog);
        
        // %f : 강제로 소수점 6자리를 표현합니다 (25.45면 25.450000)
        double rate = 25.45678901234;
        System.out.printf("비율은 %f입니다.\n", rate);
        System.out.printf("비율은 %.4f입니다.\n", rate); // 소수점 4자리까지
        System.out.printf("비율은 %.2f입니다.\n", rate); // 소수점 2자리까지
        System.out.printf("\\비율은 %.2f%%입니다.\n", rate); // \비율은 25.46%입니다. %쓰려면 %%, \쓰려면 \\

    }
}
