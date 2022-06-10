package day12.final_;

public class Main {

    public static void main(String[] args) {

//        Korean park = new Korean("박철수", "991111-1122334");
//        Korean kim = new Korean("김영희", "880212-2572334");

        Korean park = new Korean("박철수", "991111-1122334", "중국");
        Korean kim = new Korean("김영희", "880202-2233441", "대한민국");
        Korean kim2 = new Korean("김일희", "880202-2233441", "미국");
        Korean kim3 = new Korean("김이희", "880202-2233441", "미국");
        // 이렇게 되면 Korean이 의미가 없어진다.

        park.name = "박찬호";
//        park.id = "850503-2751615";
//        kim.nation = "중국";


        System.out.println(park);  // day12.final_.Korean@6a5fc7f7
        System.out.println(kim);   // toString을 Korean.class에 해놓지 않으면 주소값이 뜬다
    }
}
