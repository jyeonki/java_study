import java.util.Scanner;

// 백준 1517
public class 버블_소트 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    count++;
                }
            }
        }

//        for (int i = 0; i < N; i++) {
//            System.out.println(A[i]);
//        }
        System.out.println(count);
    }
}
