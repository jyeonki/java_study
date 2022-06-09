package day12.final_;

public class Main {

    public static void main(String[] args) {

        Korean park = new Korean("박철수", "991111-1122334");
        Korean kim = new Korean("김영희", "880212-2572334");

        park.name = "박찬호";
//        park.id = "850503-2751615";
//        kim.nation = "중국";


        System.out.println(park);  // day12.final_.Korean@6a5fc7f7
        System.out.println(kim);   // toString을 Korean.class에 해놓지 않으면 주소값이 뜬다
    }
}
