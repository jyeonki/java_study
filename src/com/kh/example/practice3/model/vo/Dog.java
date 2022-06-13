package com.kh.example.practice3.model.vo;


public class Dog extends Animal{

    public static String PLACE;
    static {
        PLACE = "애견카페";
    }
    private int weight;


    public Dog() {

    }
    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void speak() {
        System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
//        System.out.printf("%s 몸무게는 %dkg입니다.\n", super.toString(), weight);
        // super.toString(); 부모의 toString() 메서드 호출
    }
}
