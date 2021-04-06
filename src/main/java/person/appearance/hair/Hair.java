package person.appearance.hair;

public class Hair {
    private final String length;
    private final String color;

    public Hair(int i) {
        length = new HairLength(i).option;
        color = new HairColor(i).option;
    }

    @Override
    public String toString() {
        return length + (color.isEmpty() ? "" : ", " + color);
    }
}