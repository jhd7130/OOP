package positionCalculator.domain;

import positionCalculator.service.PositionCalculatorFourPositions;
import positionCalculator.service.PositionCalculatorThreePositions;
import positionCalculator.utils.ConsoleOut;
import positionCalculator.service.PositionCalculator;
import positionCalculator.service.PositionCalculatorTwoPositions;

import java.util.List;

public class PrintResult {

    private static PositionCalculator positionCalculator;

    public void report(List<Position> positions) {
        if (PositionStatus.isTwo(positions.size())) {
            calculatePosition(positions, new PositionCalculatorTwoPositions());
        }
        if (PositionStatus.isThree(positions.size())) {
            calculatePosition(positions, new PositionCalculatorThreePositions());
        }
        if (PositionStatus.isFour(positions.size())) {
            calculatePosition(positions, new PositionCalculatorFourPositions());
        }

    }
    private void calculatePosition(List<Position> positions, PositionCalculator positionCalculator) {
        System.out.println(ConsoleOut.TWO_POSITION_DISTANCE_INTRODUCING_MESSAGE + String.format("%.4f", positionCalculator.calculate(positions)));
    }
}
