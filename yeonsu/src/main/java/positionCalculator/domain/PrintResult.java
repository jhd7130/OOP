package positionCalculator.domain;

import positionCalculator.utils.ConsoleOut;
import positionCalculator.utils.PositionCalculator;
import positionCalculator.utils.PositionCalculatorImpl;

import java.util.List;

public class PrintResult {

    private static double result = 0;
    public void report(List<Position> positions) {
        if (isTwoPoints(positions)) {
            result = calculateBetweenPosition(positions);
        }
        System.out.println(ConsoleOut.TWO_POSITION_DISTANCE_INTRODUCING_MESSAGE + String.format("%.4f", result));
    }

    private boolean isTwoPoints(List<Position> positions) {
        return positions.size() == 2;
    }

    private double calculateBetweenPosition(List<Position> positions) {
        PositionCalculator calculator = new PositionCalculatorImpl();
        return calculator.calculate(positions);
    }
}
