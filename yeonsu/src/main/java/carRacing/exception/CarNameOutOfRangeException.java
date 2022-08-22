package carRacing.exception;

public class CarNameOutOfRangeException extends IllegalArgumentException {
    public CarNameOutOfRangeException() {
    }

    public CarNameOutOfRangeException(String s) {
        super(s);
    }
}
