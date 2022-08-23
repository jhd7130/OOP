package positionCalculator.utils;

import positionCalculator.domain.Position;

public class PositionCalculatorImpl implements PositionCalculator {

    @Override
    public double calculate(Position p1, Position p2) {
        return sqrt(pow(p1.currentXPos(), p2.currentXPos()) + pow(p1.currentYPos(), p2.currentYPos()));
    }

    private double sqrt(double powedPos) {
        return Math.sqrt(powedPos);
    }

    private double pow(int pos1, int pos2) {
        return Math.pow((pos1 - pos2), 2);
    }

}
