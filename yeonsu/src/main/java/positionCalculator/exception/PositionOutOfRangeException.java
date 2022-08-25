package positionCalculator.exception;

public class PositionOutOfRangeException extends IllegalArgumentException {


    public PositionOutOfRangeException() {
        super();
    }

    public PositionOutOfRangeException(String s) {
        super(s);
    }
}
