package generators;

import person.appearance.Appearance;
import person.appearance.EyesColor;
import person.appearance.hair.Hair;

import java.util.HashMap;

public class AppearanceGenerator implements Generator<Appearance> {

    private String eyes;
    private Hair hair;

    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */
    @Override
    public final void generateParams(final int code) {
        final int i = code % 100 / 10;
        eyes = EyesColor.colorByIndex(i/2);
        hair = new Hair(i);
    }

    @Override
    public final Appearance buildResponse() {
        return new Appearance(eyes, hair);
    }
}