package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random rnd = new Random();
        ColorSupplier supplier = new ColorSupplier();
        Lottery lottery = new Lottery(rnd, supplier);

        Ball ball1 = lottery.getrandomBall();
        Ball ball2 = lottery.getrandomBall();
        Ball ball3 = lottery.getrandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
