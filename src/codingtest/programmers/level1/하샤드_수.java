package codingtest.programmers.level1;

public class 하샤드_수 {

    public static boolean solution(int x) {
        boolean answer = true;

        int y = x;
        int z = x;

        // 자릿수 구하기
        int count = 0;
        while (y > 0) {
            y /= 10;
            count++;
        }
        System.out.println(count);

        // 쪼개서 배열안에 넣기
        int[] arr = new int[count];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = z % 10;
            z /= 10;
        }

//        System.out.println(Arrays.toString(arr));

        // 자릿수 합 구하기
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

//        System.out.println(sum);

        if (x % sum != 0) {
            answer = false;
        }

        return answer;



        //풀이
        /*
        int dx = x; // 처음 x값 백업
        int sum = 0; //자리수 총합
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return dx % sum == 0;
        */

    }

    public static void main(String[] args) {

        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

}
