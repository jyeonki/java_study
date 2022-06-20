package day19.lambda;

import utility.Util;

import java.util.ArrayList;
import java.util.List;

import static day19.lambda.Apple.Color.*;
import static day19.lambda.FilteringApple.*;
import static day19.lambda.FilteringApple.filterApples;

public class Main2 {

    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, GREEN)); // import static
        inventory.add(new Apple(155, RED));
        inventory.add(new Apple(120, RED));
        inventory.add(new Apple(55, RED));
        inventory.add(new Apple(100, GREEN));

        // 녹색사과들만 필터링
        List<Apple> greens = filterGreenApples(inventory);
        for (Apple green : greens) {
            System.out.println(green);
        }

        Util.line();

        // 빨간사과들만 필터링
        for (Apple red : filterApplesByColor(inventory, RED)) {
            System.out.println(red);
        }

        Util.line();

        // 무게가 100g보다 큰 사과들만 필터링
        System.out.println("filter apple weight over 100g");
        for (Apple filterApple : filterApples(inventory, new AppleWeightPredicate())) {
            System.out.println(filterApple);
        }

        Util.line();

        System.out.println("filter with anonymous class");
        System.out.println("weight under 100g");
        List<Apple> lightAppleList = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 100;
            }
        });
        for (Apple apple : lightAppleList) {
            System.out.println(apple);
        }

        Util.line();


        System.out.println("빨간색이면서 100g 이상인 사과들만 필터링");
        List<Apple> filteredList = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED && apple.getWeight() >= 100;
            }
        });
        for (Apple apple : lightAppleList) {
            System.out.println(apple);
        }

    }

}
