package person;

import person.appearance.Appearance;

public class Person {

    private final String id;
    private FioUniform name;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public Person(final String id) {
        this.id = id;
    }

    public final Person called(final FioUniform fullName) {
        this.name = fullName;
        return this;
    }

    public final Person withPhysical(final Physical physical) {
        this.phys = physical;
        return this;
    }

    public final Person withAppearance(final Appearance look) {
        this.appearance = look;
        return this;
    }

    public final Person withPhone(final Phone contactPhone) {
        this.phone = contactPhone;
        return this;
    }


    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(name).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}