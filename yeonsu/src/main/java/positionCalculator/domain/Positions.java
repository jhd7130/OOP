package positionCalculator.domain;

import positionCalculator.exception.PositionDuplicationException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Positions {

    private List<Position> positions;

    public Positions(List<Position> paramPositions) {
        positionsInjection(paramPositions);

        if (positions.size() != positions.stream().distinct().collect(Collectors.toList()).size()) {
            throw new PositionDuplicationException("중복된 값이 존재합니다.");
        }
    }

    private void positionsInjection(List<Position> paramPositions) {
        positions = new ArrayList<>();
        for (Position eachPosition : paramPositions) {
            positions.add(eachPosition);
        }
    }
}
