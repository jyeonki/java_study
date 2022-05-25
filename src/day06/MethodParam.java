package day06;

// parameter(매개 변수) : 함숙 외부에서 받아와야 하는 값을 저장하는 공간
public class MethodParam {

    // 2개의 정수를 전달받아 그 합을 돌려주는 함수
    static int add(int n1, int n2) {
        System.out.println("함수 호출!");
        int sum = n1 + n2;
        return sum;
    }

    // n개의 정수를 전달받아 그 총합을 리턴하는 함수
    /*
    static int addAll(int[] numbers) { // static 다음에는 return되는 값의 타입을 적어야함
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
    */

    static int addAll(int... numbers) { // ...은 함수에서만 쓸 수 있다 (호출할 때 값을 콤마로 나열도 가능하다, 물론 배열도 가능)
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 2개의 배열을 전달받아 길이가 더 긴 배열을 리턴하는 함수
    static int[] compareLength(int[] nums1, int[] nums2) { // 여기서는 int...을 쓸 수 없음 (배열을 두 개 이상 받을 때는 [] 이걸 쓸 것)
        return nums1.length > nums2.length ? nums1 : nums2;
    }

    static void hello() {
        System.out.println("안녕하십니까!");
    }


    public static void main(String[] args) {

        System.out.println("함수호출 전!");
//        add(10, 20);
        System.out.println(add(10, 20) + 50); // add 먼저 호출하고 println 호출
        System.out.println("함수호출 후!");

        System.out.println("=========================================");

        short x = 12;
        long y = 12L;
        add(8, x);      // 자동 형변환
        add(8, (int)y); // 수동 형병환

        System.out.println("=========================================");

        int[] arr = {10, 20, 30};
        int sum = addAll(arr);
        System.out.println("sum = " + sum);
        
        int sum2 = addAll(new int[]{3, 6, 9, 12});
        System.out.println("sum2 = " + sum2);
        
        int sum3 = addAll(5, 10, 15, 20, 25, 30);
        System.out.println("sum3 = " + sum3);

        System.out.println("=========================================");

        compareLength(new int[] {1, 3, 5, 7}, new int[] {2, 4, 6, 8});

        for (int i = 0; i < 5; i++) {
            hello();
        }

    }
}
