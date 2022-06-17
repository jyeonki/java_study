package day18.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("E:/Exercise/자바수업.txt")) {

            String msg = "지금은 자바 입출력 수업중입니다.\n꿀잼이야~";
            fileWriter.write(msg);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


