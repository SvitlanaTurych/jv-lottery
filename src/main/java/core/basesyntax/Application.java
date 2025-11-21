package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        final int count = 3;

        Random rnd = new Random();
        ColorSupplier supplier = new ColorSupplier();
        Lottery lottery = new Lottery(rnd, supplier);

        for (int i = 0; i < count; i++) {
            Ball ball = lottery.getrandomBall();
            System.out.println(ball);
        }
    }
}
