package positionCalculator.utils;

import positionCalculator.domain.Position;

import java.util.List;

public interface PositionCalculator {

    double calculate(List<Position> positions);
}
