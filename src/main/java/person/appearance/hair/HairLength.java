package person.appearance.hair;

public class HairLength extends HairOption {

    HairLength(final int i) {
        super(i);
    }

    @Override
    protected final void roll(final int i) {
        if (i > 0) {
            setOption((i > 4) ? "длинные" : "короткие");
        } else {
            setOption("нет");
        }
    }
}