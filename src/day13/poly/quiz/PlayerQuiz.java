package day13.poly.quiz;


import day13.poly.quiz.inherit.Hunter;
import day13.poly.quiz.inherit.Mage;
import day13.poly.quiz.inherit.Warrior;

public class PlayerQuiz {

    public static void main(String[] args) {

        Mage m = new Mage("눈보라왕");
        Warrior w = new Warrior("주차왕파킹");
        Hunter h = new Hunter("멍멍이조아여");

        m.blizzard(w, h);
        m.blizzard(w);
        m.blizzard(h, m, new Mage("마법의제왕"));

        w.rush(m);
        w.rush(h);
        w.rush(new Warrior("짱센전사"));

    }
}
