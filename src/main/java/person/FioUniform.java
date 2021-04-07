package person;

public class FioUniform {
    private final String uniform;

    public FioUniform(final Fio name) {
        this.uniform = convert(name);
    }

    private String convert(final Fio name) {

        return String.format("%1$s %2$s %3$s", name.getLastName(), name.getFirstName(), name.getMiddleName());
    }

    @Override
    public final String toString() {
        return uniform;
    }
}