package programmers.level1;

public class 핸드폰_번호_가리기 {

    public static String solution(String phone_number) {
        String answer = "";

        // 전화번호 맨 뒤 4자리 추출
        String last4 = phone_number.substring(phone_number.length() - 4);
//        System.out.println("last4 = " + last4);

        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += last4;

        return answer; // 리턴값 String

        /*
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
        */

    }

    public static void main(String[] args) {
        System.out.println(solution("01012345678"));
    }


}
