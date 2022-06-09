package codingtest.programmers.level1;

public class 부족한_금액_계산하기 {

    public static long solution(int price, int money, int count) {

        long sum = 0; // 오버플로우 방지
        for(int i = 1; i <= count; i++){
            sum += price * i; 
        }

        if(sum > money) return sum - money;
        else return 0;


        /*
        // 놀이기구 탑승 총액
        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice += (price * i);
        }
        // 내가 가진돈 - 내야할 총액
        // 결과 양수: 부족한 돈 0원
        // 결과 음수: 부족한 돈 -restMoney
        long restMoney = money - totalPrice;
        return (restMoney >= 0) ? 0 : -restMoney;
        */

    }

    public static void main(String[] args) {

        System.out.println(solution(3, 20, 4));
    }
}
