package day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {
//        loadTextFile();
        loadObject();

        for (Human h : humanList) {
            System.out.println(h);
        }
        System.out.println(humanList); // Human class에 toString을 만들지 않으면 내용이 아니라 주소값이 출력된다.
    }

    // 세이브 파일 불러와서 리스트에 넣기
    static void loadObject() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Exercise/human.sav"))) {

            humanList = (List<Human>) ois.readObject(); // down casting

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    // 텍스트 파일 불러와서 리스트에 넣기
    static void loadTextFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("E:/Exercise/human.txt"))) {

//            String s = br.readLine();
//            System.out.println("s = " + s);

            String s = "";
            while ((s = br.readLine()) != null) {
//                System.out.println(s);

                StringTokenizer st = new StringTokenizer(s,",");
                Human human = new Human(st.nextToken(), Integer.parseInt(st.nextToken()), st.nextToken());
                humanList.add(human);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
       } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
