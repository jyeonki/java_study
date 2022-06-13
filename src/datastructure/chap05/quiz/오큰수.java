package datastructure.chap05.quiz;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class 오큰수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {

                arr[stack.pop()] = arr[i];
                System.out.println(Arrays.toString(arr));

            }

            stack.push(i);
            System.out.println(Arrays.toString(arr));

        }

//        System.out.println(Arrays.toString(arr));

        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }



        /*
            A   3 5 2 7
            S   5 7 7

            1:  A[0] < A[1] -  S[0] = A[1]
            2:  A[1] > A[2] -  1번인덱스 스킵
            3:  A[2] < A[3] -  S[2] = A[3]
                A[1] < A[3] -  S[1] = A[3]


            A   9 5 4 8
            S  -1 8 8 -1

            1: A[0] > A[1]  - 0번 스킵
            2: A[1] > A[2]  - 1번 스킵
            3: A[2] < A[3]  - S[2] = A[3]
               A[1] < A[3]  - S[1] = A[3]
               A[0] > A[3]  - 0번 스킵
        */



        /* 풀이1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N]; // 수열 배열
        int[] answer = new int[N]; // 정답 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 처음에는 스택이 비어있으므로 항상 최초값을 추가

        // 3 5 2 7    || 5 7 7 -1
        for (int i = 1; i < N; i++) {

            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                answer[stack.pop()] = A[i]; // 정답 배열에 오큰수를 저장
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : answer) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);
        */



        /* 풀이2

        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int N = in.nextInt();
        int[] seq = new int[N];

        for(int i = 0; i < N; i++) {
            seq[i] = in.nextInt();
        }
        */
        /*
        for(int i = 0; i < N; i++) {


             * 스택이 비어있지 않으면서
             * 현재 원소가 스택의 맨 위 원소가 가리키는 원소보다 큰 경우
             * 해당 조건을 만족할 때 까지 stack의 원소를 pop하면서
             * 해당 인덱스의 값을 현재 원소로 바꿔준다.

            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }

            stack.push(i);
        }


         * 스택의 모든 원소를 pop하면서 해당 인덱스의 value를
         * -1로 초기화한다.

        while(!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(seq[i]).append(' ');
        }

        System.out.println(sb);
        */

    }
}
