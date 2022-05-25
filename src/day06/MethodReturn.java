package day06;

import java.util.Arrays;

public class MethodReturn {

    static int add(int n1, int n2) {
        return n1 + n2;
        // System.out.println("abc");
    }
    
    // 두 개의 정수의 합을 출력하는 함수
    static void showAddResult(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    static void callName(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어~~");
            return; // 함수 탈출문
        }
        System.out.printf("%s 하이~~\n", name);
    }

    /*
        # 모든 함수의 리턴값은 반드시 1개다

        - 5개의 애완동물 이름목록에서 원하는 숫자를 전달하면
          그 숫자만큼 랜덤으로 애완동물리스트를 뽑아서 리턴하는 함수
    */
    static String[] selectPet(int count) {

        // 매개변수 검증
        if (count < 1 || count > 5) {
            return null;
        }

        String[] petList = {"멍멍이", "짹짹이", "꽥꽥이", "찍찍이", "꾸러긔"};

        // 랜덤선택한 애완동물이 저장될 배열
        String[] selected = new String[count];
        for (int i = 0; i < count; i++) {
            int rn = (int) (Math.random() * petList.length);
            selected[i] = petList[rn];
        }
        return selected;
    }


    public static void main(String[] args) {

        int r1 = add(10, 20);
        System.out.println("r1 = " + r1);

        int r2 = r1 * 3 + r1--;

        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);

        // return이 없는 void타입 함수는 변수에 저장할 수 없다
        showAddResult(3, 8);

        System.out.println(); // String

        double random = Math.random(); // random은 double타입

        int r3 = add(add(10, 20), add(5, 5));
        System.out.println("r3 = " + r3);

        // add(add(10, 20), showAddResult(5, 5);); // showAddResult는 return 값이 없으므로 안에 쓸 수 없다
        showAddResult(add(4, 4), add(1,2)); // 이건 가능

        System.out.println("==========================================================");
        
        callName("짝짝이");
        callName("꾸꾸까까꾜꾜");

        System.out.println("==========================================================");

        String[] selectPet = selectPet(3);
        System.out.println(Arrays.toString(selectPet));


    }
}
