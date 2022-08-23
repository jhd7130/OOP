package positionCalculator.domain;

import positionCalculator.exception.PositionDuplicationException;
import positionCalculator.utils.ConsoleOut;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Positions {

    private List<Position> positions;

    /*public Positions(List<Position> paramPositions) {
        positionsInjection(paramPositions);

        if (positions.size() != positions.stream().distinct().collect(Collectors.toList()).size()) {
            throw new PositionDuplicationException("중복된 값이 존재합니다.");
        }
    }*/

    public Positions(List<Integer> integers) {
        positionsInjectionIntegerList(integers);

        if (positions.size() != positions.stream().distinct().collect(Collectors.toList()).size()) {
            throw new PositionDuplicationException("중복된 값이 존재합니다.");
        }
    }

    private void positionsInjectionIntegerList(List<Integer> positionsList) {
        positions = new ArrayList<>();
        for (int i = 0; i < (positionsList.size() / 2); i++) {
            positions.add(Position.from(positionsList.get(2 * i), positionsList.get((2 * i) + 1)));
        }
    }

    private void positionsInjection(List<Position> paramPositions) {
        positions = new ArrayList<>();
        for (Position eachPosition : paramPositions) {
            positions.add(eachPosition);
        }
    }

    public void calculateBetweenPosition() {
        PrintResult printResult = new PrintResult();
        String result = printResult.report(positions);
        System.out.println(ConsoleOut.TWO_POSITION_DISTANCE_INTRODUCING_MESSAGE + result);
    }
}
