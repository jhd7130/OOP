package positionCalculator.wrapper;

import positionCalculator.exception.PositionOutOfRangeException;
import positionCalculator.service.ConsoleOut;

public class PositionNumber {

    private int pos;

    public PositionNumber(int pos) {
        if (isNotInRange(pos)) {
            throw new PositionOutOfRangeException(ConsoleOut.POSITION_OUT_OF_RANGE_EXCEPTION_MESSAGE);
        }
        this.pos = pos;
    }

    private boolean isNotInRange(int pos) {
        return pos < ConsoleOut.POSITION_NUMBER_MIN || pos > ConsoleOut.POSITION_NUMBER_MAX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionNumber)) return false;

        PositionNumber that = (PositionNumber) o;

        return pos == that.pos;
    }

    @Override
    public int hashCode() {
        return pos;
    }
}
