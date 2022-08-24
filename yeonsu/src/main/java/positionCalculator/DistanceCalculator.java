package positionCalculator;

import positionCalculator.domain.Positions;
import positionCalculator.utils.ConsoleIn;
import positionCalculator.utils.ConsoleOutMessage;
import positionCalculator.utils.StringUtils;

import java.util.List;

public class DistanceCalculator {

    public static void init() {
        ConsoleOutMessage.GAME_START_MESSAGE.print();

        List<Integer> wholePositionList = StringUtils.extractInteger(ConsoleIn.userInput());

        Positions positions = new Positions(wholePositionList);
        positions.printResult();
    }
}
