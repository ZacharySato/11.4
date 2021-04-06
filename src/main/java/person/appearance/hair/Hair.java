package person.appearance.hair;

public class Hair {
    private final String length;
    private final String color;

    public Hair(final int i) {
        length = new HairLength(i).getOption();
        color = new HairColor(i).getOption();
    }

    @Override
    public final String toString() {
        return length + (color.isEmpty() ? "" : ", " + color);
    }
}