package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier colorSupplier;
    public Lottery(Random rnd, ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = rnd;
    }

    public Ball getrandomBall() {
        int randomNumber = random.nextInt(101);
        Color color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);
    }
}
