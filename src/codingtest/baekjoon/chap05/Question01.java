package codingtest.baekjoon.chap05;

public class Question01 {
    static long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        /*
        for (int n : a) {
            ans += n;
        }
        */
        return ans;
    }

    public static void main(String[] args) {
        
        long sum = sum(new int[] {1, 2, 3});
        System.out.println("sum = " + sum);

    }
}
