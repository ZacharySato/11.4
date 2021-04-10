import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.FioUniform;
import person.Person;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            final int intCode = Integer.parseInt(input);
            final Person.Builder humanBuilder = new Person.Builder(input);
            humanBuilder.called(new FioUniform(new FioGenerator().castFeature(intCode))).
            withPhysical(new PhysGenerator().castFeature(intCode)).
            withAppearance(new AppearanceGenerator().castFeature(intCode));
            // добавляем телефон, только если введённый код не палиндром
            if (!input.equals(new StringBuilder(input).reverse().toString())) {
                humanBuilder.withPhone(new PhoneGenerator().castFeature(intCode));
            }
            result = humanBuilder.build().toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}