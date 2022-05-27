package day08.car;

public class 자동차 {

    엔진 v6엔진; // defalut를 써야 정비사는 가능하고 운전자는 불가능하게 만든다
    
    자동차() {} // defalut를 써야 딜러는 판매가 가능하고 운전자는 자동차를 만들 수 없다

    public void 시동을걸다() {
        엔진오일을_분사하다();
        엔진의_실린더를_움직이다();
    }

    private void 엔진의_실린더를_움직이다() {} // 운전자가 수동으로 못하게 막기
    private void 엔진오일을_분사하다() {}

}

