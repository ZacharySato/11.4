package person.appearance.hair;

public abstract class HairOption {

    protected String option = "";

    HairOption(int i) {
        roll(i);
    }

    protected abstract void roll(int i);

    @Override
    public String toString() {
        return option;
    }
}