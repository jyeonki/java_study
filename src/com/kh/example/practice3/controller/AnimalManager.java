package com.kh.example.practice3.controller;

import com.kh.example.practice3.model.vo.Animal;
import com.kh.example.practice3.model.vo.Cat;
import com.kh.example.practice3.model.vo.Dog;

public class AnimalManager {

    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        animals[0] = new Dog("뭉뭉이", "시츄", 3);
        animals[1] = new Dog("망망이", "시베리안허스키", 25);
        animals[2] = new Cat("냥냥이", "페르시안", "숲", "흰색");
        animals[3] = new Cat("스핑이", "스핑크스", "길", "살색");
        animals[4] = new Dog("돌돌이", "진돗개", 30);

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
