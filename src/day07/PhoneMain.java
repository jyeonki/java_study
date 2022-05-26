package day07;

public class PhoneMain {

    public static void main(String[] args) {

        Phone galaxy = new Phone("갤럭시21");
        Phone note = new Phone("갤노트");
        Phone iphone = new Phone("아이폰13 Pro");

        // 객체부터 생성하고 객체.powerOn();을 해야한다!!!
        
//        p1.powerOff(); // 일단 Phone() 실행하고, powerOff() 실행

        // p1.showSpec();
//        p2.showSpec();

//        System.out.println("p1의 주소: " + p1);
//        System.out.printf("p1의 주소: %s\n", p1);
//
//        System.out.println("p2의 주소: " + p2);
//        System.out.printf("p2의 주소: %s\n", p2);
        
        note.showSpec();
        galaxy.sendMessage(iphone, "안녕 나는 갤럭시~");
        galaxy.sendMessage(iphone, "메롱멜롱 ~~!");
        note.sendMessage(iphone, "나는 갤럭시 노트야~~ 하이~");
//        note.sendMessage(iphone, "나는 갤럭시 노트야~~ 하이루 방가방가~");

        iphone.sendMessage(note, "나는 애플폰이야");
        galaxy.sendMessage(note, "나는 갤럭시^^");

        iphone.sendMessage(galaxy, "마이네임이즈 아이폰");

        iphone.checkMessage();
        galaxy.checkMessage();
        note.checkMessage();




    }
}
