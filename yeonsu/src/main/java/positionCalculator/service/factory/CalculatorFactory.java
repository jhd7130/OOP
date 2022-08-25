package positionCalculator.service.factory;

import positionCalculator.domain.PointerStatus;
import positionCalculator.domain.Pointers;
import positionCalculator.exception.ImPossiblePointerSizeException;
import positionCalculator.service.ConsoleOut;

public class CalculatorFactory {

    public static PointersCalculator calculatorComponent(int size) {
        if (size == 2) {
            return new TwoPointerCalculator();
        }
        if (size == 3) {
            return new ThreePointerCalculator();
        }
        if (size == 4) {
            return new FourPointerCalculator();
        }
        throw new ImPossiblePointerSizeException(ConsoleOut.POSITION_SIZE_EXCEPTION_MESSAGE);
    }

}
