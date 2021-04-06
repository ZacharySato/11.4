package person.appearance.hair;

public class HairLength extends HairOption {

    HairLength(int i) {
        super(i);
    }

    @Override
    protected void roll(int i) {
        if (i > 0) {
            option = (i > 4) ? "длинные" : "короткие";
        } else {
            option = "нет";
        }
    }
}