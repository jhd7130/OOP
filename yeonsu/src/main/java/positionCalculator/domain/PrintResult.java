package positionCalculator.domain;

import positionCalculator.utils.PositionCalculator;
import positionCalculator.utils.PositionCalculatorImpl;

import java.util.List;

public class PrintResult {
    public String report(List<Position> positions) {
        double result = 0;
        if (positions.size() == 2) {
            result = calculateBetweenPosition(positions);
        }
        return String.valueOf(result);
    }

    private double calculateBetweenPosition(List<Position> positions) {
        Position position1 = positions.get(0);
        Position position2 = positions.get(1);
        PositionCalculator calculator = new PositionCalculatorImpl();
        return calculator.calculate(position1, position2);
    }
}
