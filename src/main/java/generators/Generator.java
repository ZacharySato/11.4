package generators;

public abstract class Generator<T> {

    abstract void generateParams(int code);

    abstract T buildResponse();

    public final T castFeature(final int code) {
        generateParams(code);
        return buildResponse();
    }

}