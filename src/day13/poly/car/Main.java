package day13.poly.car;


public class Main {

    public static void main(String[] args) {

        Granduer g1 = new Granduer();
        Car g2 = new Granduer();
        Granduer g3 = new Granduer();

        Car m1 = new Mustang();
        Mustang m2 = new Mustang();

        Stinger s1 = new Stinger();
        Stinger s2 = new Stinger();



//    Granduer[] granduers = {g1, g2, g3};
//
//    for (Granduer g : granduers) {
//        g.run();
//    }

        Car[] cars = {g1, g2, g3, m1, m2, s1, s2
                      ,new Granduer(), new Mustang(), new Stinger()};

        for (Car c : cars) {
            c.run();
        }

        Object[] oArr = {10, 3.3, "하하호호", new Mustang(), true};
        // 가능하지만 추천은 하지 않는다.

        //
        int a = 1;
        long b = 2L;
        double c = 1.1;

        double[] dArr = {a, b, c};
        //


        System.out.println("================================================================");


        Driver kim = new Driver();
//        kim.driveMustang(new Mustang());
//        kim.driveGranduer(new Granduer());
        kim.drive(new Stinger());
        kim.drive(new Stinger());

    }
}
