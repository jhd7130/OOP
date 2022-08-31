package blackJack.domain.wrapper;

import blackJack.exception.PlayerHaveToInputAgainCharYOrN;
import blackJack.util.ConsoleOut;

public class PlayerQuestionnaire {

    public static boolean isRightAnswer(String answer) {
        try {
            if ((answer != "y") && (answer != "n") && (answer != "Y") && (answer != "N")) {
                throw new PlayerHaveToInputAgainCharYOrN();
            }
        } catch (PlayerHaveToInputAgainCharYOrN e) {
            e.getMessage();
            return false;
        }
        return true;
    }
}
