package person.appearance.hair;

import java.util.HashMap;

public class HairColor extends HairOption {

    HairColor(final int i) {
        super(i);
    }

    @Override
    protected final void roll(final int i) {
        HashMap<Integer, String> hairColorMap = new HashMap<>() {{
            put(1, "чёрные");
            put(2, "каштановые");
            put(3, "рыжие");
            put(4, "светлые");
            put(5, "седые");
            put(6, "розовые");
            put(7, "зелёные");
            put(8, "фиолетовые");
            put(9, "синие");
        }};
        if (i > 0) {
            setOption(hairColorMap.get(i));
            if (getOption() == null) {
                throw new IllegalStateException("Unexpected value: " + i);
            }
        }
    }
}