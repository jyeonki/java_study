package codingtest.programmers.level1;

public class 콜라츠_추측 {

    public static int solution(int num) {
        long number = num; // 오버플로우 방지
        int answer = 0;

        for (answer = 0; answer < 500; answer++) {
            if (number == 1) return answer;
            else {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = number * 3 + 1;
                }
            }
        }
        return -1;


        /*
        long n = num;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
        }
        return -1;
        */
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
