package blackJack.util;

import blackJack.domain.Card;
import blackJack.domain.wrapper.CardNumber;

import java.util.List;

public class CalculateCardScore {

    public static int cardScore(List<Card> cards) {
        int result = cards.stream().mapToInt(card -> card.currentCardNumberToInteger()).sum();

        if (isSwitchCardA(cards, result)) {
            result -= 10;
        }
        return result;
    }

    private static boolean isSwitchCardA(List<Card> cards, int result) {
        return isBiggerThanBlackJack(result) && cardsHaveA(cards);
    }

    private static boolean isBiggerThanBlackJack(int result) {
        return result > ConsoleOut.BLACK_JACK_NUMBER;
    }

    private static boolean cardsHaveA(List<Card> cards) {
        return cards.stream().anyMatch(card -> card.currentCardNumber());
    }
}
