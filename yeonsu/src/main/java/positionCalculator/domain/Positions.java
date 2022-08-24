package positionCalculator.domain;

import positionCalculator.exception.AmountOfPointersException;
import positionCalculator.exception.PositionDuplicationException;
import positionCalculator.utils.ConsoleOut;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Positions {

    private List<Position> positions;

    public Positions(List<Integer> numbers) {


        if (isNotAmountOfPointers(numbers)) {
            throw new AmountOfPointersException(ConsoleOut.AMOUNT_OF_POINTERS_EXCEPTION_MESSAGE);
        }

        positionsInjectionIntegerList(numbers);

        if (isSamePositions()) {
            throw new PositionDuplicationException(ConsoleOut.POSITION_DUPLICATION_EXCEPTION_MESSAGE);
        }
    }

    public void printResult() {
        PrintResult printResult = new PrintResult();
        printResult.report(positions);
    }

    private void positionsInjectionIntegerList(List<Integer> positionsList) {
        positions = new ArrayList<>();
        for (int i = 0; i < (positionsList.size() / 2); i++) {
            positions.add(Position.from(positionsList.get(2 * i), positionsList.get((2 * i) + 1)));
        }
    }

    private boolean isSamePositions() {
        return positions.size() != positions.stream().distinct().collect(Collectors.toList()).size();
    }

    private boolean isNotAmountOfPointers(List<Integer> numbers) {
        return numbers.size() < ConsoleOut.AMOUNT_OF_POINTER_MIN || numbers.size() > ConsoleOut.AMOUNT_OF_POINTER_MAX;
    }
}
