package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferTest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split(" ");
        int num1 = Integer.parseInt(sArr[0]);
        int num2 = Integer.parseInt(sArr[1]);
        int num3 = Integer.parseInt(sArr[2]);

//       문자열 => 정수 변환 : Integer.parseInt(변환문자열)
//       문자열 => 실수 변환: Double.parseDouble(변환문자열)
        System.out.println(num1 + num2 + num3);

    }
}
