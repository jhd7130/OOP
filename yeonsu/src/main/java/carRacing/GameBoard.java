package carRacing;

import carRacing.domain.Cars;
import carRacing.utils.ConsoleIn;
import carRacing.utils.ConsoleOut;
import carRacing.utils.ConsoleOutMessage;

public class GameBoard {

    public static void GameInit() {
        ConsoleOutMessage.GAME_START_MESSAGE.print();
        String userInputCarNames = ConsoleIn.GameCarNames();
        ConsoleOutMessage.NUMBER_OF_GAME_TIMES_MESSAGE.print();
        Cars cars = new Cars(userInputCarNames, ConsoleIn.GameTimes());
        ConsoleOutMessage.GAME_RESULT_MESSAGE.print();
        cars.play();
    }
}
