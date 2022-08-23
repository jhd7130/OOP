package positionCalculator;

import positionCalculator.domain.Positions;
import positionCalculator.utils.ConsoleIn;
import positionCalculator.utils.ConsoleOutMessage;
import positionCalculator.utils.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class DistanceCalculator {

    public static void init() {
        ConsoleOutMessage.GAME_START_MESSAGE.print();

        List<Integer> wholePositionList = StringUtils.extractInteger(ConsoleIn.userInput());
        Positions positions = new Positions(wholePositionList);
        positions.calculateBetweenPosition();
    }
}
