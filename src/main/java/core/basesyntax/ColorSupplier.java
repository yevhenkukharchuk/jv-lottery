package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random randomIndex = new Random();

    public String getRandomColor() {
        int index = randomIndex.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
