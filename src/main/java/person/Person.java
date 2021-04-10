package person;

import person.appearance.Appearance;

public final class Person {
    private final String id;
    private final FioUniform name;
    private final Physical phys;
    private final Appearance appearance;
    private final Phone phone;

    public static class Builder {
        private final String id;
        // Тут могут/должны быть конкретные дефолтные значения, например Иванов Иван Иванович, 18, и т.д.
        private FioUniform name = null;
        private Physical phys = null;
        private Appearance appearance = null;
        private Phone phone = null;

        public Builder(final String id) {
            this.id = id;
        }

        public final Builder called(final FioUniform o) {
            this.name = o;
            return this;
        }

        public final Builder withPhysical(final Physical o) {
            this.phys = o;
            return this;
        }

        public final Builder withAppearance(final Appearance o) {
            this.appearance = o;
            return this;
        }

        public final Builder withPhone(final Phone o) {
            this.phone = o;
            return this;
        }

        public final Person build() {
            return new Person(this);
        }
    }

    private Person(final Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phys = builder.phys;
        this.appearance = builder.appearance;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder().append(id).append("\n");
        if (name != null) {
            sb.append(name).append("\n");
        } else {
            sb.append("Безымянный").append("\n");
        }
        if (phys != null) {
            sb.append(phys).append("\n");
        } else {
            sb.append("Физические параметры неизвестны").append("\n");
        }
        if (appearance != null) {
            sb.append(appearance).append("\n");
        } else {
            sb.append("Внешность неизвестна").append("\n");
        }
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}