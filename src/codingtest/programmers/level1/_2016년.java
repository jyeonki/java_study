package codingtest.programmers.level1;

public class _2016년 {

    public static String solution(int a, int b) {
        String answer = "";
        int[] dateOfTheMonth = {31, 29, 30, 31, 30, 31, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheWeek = {"SUN", "MON", "TUE","WED","THU","FRI","SAT"};

        // 5월 24일이 1년중 몇 번째 날인지 찾기
        int count = 0;
        for (int i = 0; i < a-1; i++) {
            count += dateOfTheMonth[i];
        }
//        System.out.println(dateOfMonth[1]);

        count += b;
        System.out.println(count); // 145, 화요일
        // count % 7 == 0 , 목요일

        return answer;

        /*
        String[] weekDays = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        // 월별 총 일수
        int[] totalDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayCount = 0; // 누적 총 일수
        for (int i = 0; i < a - 1; i++) {
            dayCount += totalDays[i];
        }
        dayCount += b;
        return weekDays[dayCount % 7];
        */
    }

    public static void main(String[] args) {

        System.out.println(solution(5, 24));
    }
}
