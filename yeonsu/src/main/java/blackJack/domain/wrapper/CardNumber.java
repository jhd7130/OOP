package blackJack.domain.wrapper;

import blackJack.infra.ConsoleOut;
import blackJack.infra.DomainUtil;
import blackJack.infra.exception.CardNumberException;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;

public class CardNumber {
    private String cardNumber;

    public CardNumber(String cardNumber) {
        if (isContains(cardNumber) == false) {
            throw new CardNumberException(ConsoleOut.CARD_NUMBER_EXCEPTION_MESSAGE);
        }
        this.cardNumber = cardNumber;
    }

    private boolean isContains(String cardNumber) {
        return DomainUtil.cardNumbers.contains(cardNumber);
    }

    public String currentCardNumber() {
        return cardNumber;
    }
}
