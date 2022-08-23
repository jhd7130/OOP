package positionCalculator.wrapper;

import positionCalculator.exception.PositionNumberException;
import positionCalculator.utils.ConsoleOut;

public class PositionNumber {

    private int number;

    public PositionNumber(int number) {
        if (number <= ConsoleOut.POSITION_MIN_NUMBER || number > ConsoleOut.POSITION_MAX_NUMBER) {
            throw new PositionNumberException(ConsoleOut.POSITION_EXCEPTION_MESSAGE);
        }
        this.number = number;
    }
}
