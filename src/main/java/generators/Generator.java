package generators;

public abstract class Generator<T> {

    protected abstract void generateParams(int code);

    protected abstract T buildResponse();

    public final T castFeature(final int code) {
        generateParams(code);
        return buildResponse();
    }

}