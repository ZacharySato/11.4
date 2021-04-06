package person.appearance.hair;

public abstract class HairOption {

    private String option = "";

    HairOption(final int i) {
        roll(i);
    }

    protected abstract void roll(int i);

    public final String getOption() {
        return option;
    }

    public final void setOption(final String option) {
        this.option = option;
    }

    @Override
    public final String toString() {
        return option;
    }
}