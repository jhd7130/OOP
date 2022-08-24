package positionCalculator.service;

import positionCalculator.domain.Position;

import java.util.List;

public class PositionCalculatorTwoPositions implements PositionCalculator {

    @Override
    public double calculate(List<Position> positions) {
        Position p1 = positions.get(0);
        Position p2 = positions.get(1);
        return sqrt(pow(p1.currentXPos(), p2.currentXPos()) + pow(p1.currentYPos(), p2.currentYPos()));
    }

    private double sqrt(double powedPos) {
        return Math.sqrt(powedPos);
    }

    private double pow(int pos1, int pos2) {
        return Math.pow((pos1 - pos2), 2);
    }

}
