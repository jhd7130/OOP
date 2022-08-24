package positionCalculator.exception;

public class PositionDuplicationException extends IllegalArgumentException {
    public PositionDuplicationException() {
    }

    public PositionDuplicationException(String s) {
        super(s);
    }
}
