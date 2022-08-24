package positionCalculator.domain;

import positionCalculator.utils.ConsoleOut;
import positionCalculator.utils.PositionCalculator;
import positionCalculator.utils.PositionCalculatorTwoPositions;

import java.util.List;

public class PrintResult {
    public void report(List<Position> positions) {
        if (positions.size() == 2) {
            calculatePosition(positions);
        }
    }
    private void calculatePosition(List<Position> positions) {
        PositionCalculator calculator = new PositionCalculatorTwoPositions();
        System.out.println(ConsoleOut.TWO_POSITION_DISTANCE_INTRODUCING_MESSAGE + String.format("%.4f", calculator.calculate(positions)));
    }
}
