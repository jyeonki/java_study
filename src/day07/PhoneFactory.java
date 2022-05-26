package day07;

// main 메서드를 생성
public class PhoneFactory {

    public static void main(String[] args) {

        // Phone 객체 생성
         Phone galaxy = new Phone(); // Phone(); 생성자, 생성자함수

        // 객체의 속성과 기능을 참조( . 연산자)
//        galaxy.model = "갤럭시 S21";
        galaxy.color = "펄 블루";
//        galaxy.price = 1000000;

//        galaxy.powerOn(); // 핸드폰 객체초기화에서 powerOn()을 했기 때문
        galaxy.showSpec();


        System.out.println("=============================================================");


        Phone iPhoneX = new Phone("아이폰X"); // new 한 번 할 때마다 새로운 객체 생성
        iPhoneX.showSpec();


        System.out.println("=============================================================");


        Phone gNote = new Phone("갤럭시 노트", "제니레드");
        gNote.showSpec();


        System.out.println("=============================================================");


        Phone xiaomi = new Phone("샤오미3.0", "화이트", 2000000);
        xiaomi.showSpec();

    }

}
