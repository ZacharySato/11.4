package person.appearance;

import java.util.ArrayList;

public class EyesColor {
    private static final ArrayList<String> COLORS = new ArrayList<String>() {{
        add("голубые");
        add("зеленые");
        add("карие");
        add("серые");
        add("разные");
    }};

    public static String colorByIndex(int i) {
        String color = COLORS.get(i);
        if (color != null) {
            return color;
        } else {
            throw new IllegalStateException("Unexpected value: " + i);
        }
    }
}