package carRacing;

import carRacing.utils.ConsoleIn;
import carRacing.utils.ConsoleOut;
import carRacing.utils.ConsoleOutMessage;

public class GameBoard {

    public static void GameInit() {
        ConsoleOutMessage.GAME_START_MESSAGE.print();
        ConsoleIn.GameCarNames();
        ConsoleOutMessage.NUMBER_OF_GAME_TIMES_MESSAGE.print();
        ConsoleIn.GameTimes();

    }
}
