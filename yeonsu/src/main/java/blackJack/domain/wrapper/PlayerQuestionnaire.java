package blackJack.domain.wrapper;

import blackJack.exception.PlayerHaveToInputAgainCharYOrN;
import blackJack.util.ConsoleOut;

public class PlayerQuestionnaire {

    public static boolean isRightAnswer(Character answer) {
        try {
            if (isYyOrNn(answer)) {
                throw new PlayerHaveToInputAgainCharYOrN();
            }
        } catch (PlayerHaveToInputAgainCharYOrN e) {
            e.getMessage();
            return false;
        }
        return true;
    }

    private static boolean isYyOrNn(Character answer) {
        return answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n';
    }
}
