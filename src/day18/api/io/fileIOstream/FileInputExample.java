package day18.api.io.fileIOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {

        // 파일 읽어들이려면
        /*FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("E:/jy/java_study/java_study/src/datastructure/chap02/linkedlist/singly/Node.java");

            int data = 0;
            while (data != -1) {
                data = fileInputStream.read();
                System.out.write(data); // 아스키를 문자로 출력
//            System.out.println("data = " + (char)data); // 1byte씩 읽는다.
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/



        String path = "E:/jy/java_study/java_study/src/datastructure/chap02/linkedlist/singly/Node.java";
        // try with resource : AutoCloseable 인터페이스가 구현된 객체를 자동 클로즈
        try (FileInputStream fileInputStream = new FileInputStream(path)) {

            int data = 0;
            while (data != -1) {
                data = fileInputStream.read();
                System.out.write(data); // 아스키를 문자로 출력
//                System.out.println("data = " + (char)data); // 1byte씩 읽는다.
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        }
    }
}
