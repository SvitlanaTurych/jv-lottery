package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final int count = 100;
    private final ColorSupplier colorSupplier;

    public Lottery(Random rnd, ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = rnd;
    }

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(count + 1);
        Color color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);
    }
}
