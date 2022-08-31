package blackJack.domain;

import blackJack.domain.wrapper.CardNumber;
import blackJack.domain.wrapper.Shape;

public class Card {

    private Shape shape;
    private CardNumber cardNumber;

    private Card(Shape shape, CardNumber cardNumber) {
        this.shape = shape;
        this.cardNumber = cardNumber;
    }

    public static Card of(Shape shape, CardNumber cardNumber) {
        return new Card(shape, cardNumber);
    }

    public int currentCardNumberToInteger() {
        return cardNumber.getCardNumber();
    }

    public boolean currentCardNumber() {
        return cardNumber == CardNumber.A;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (shape != card.shape) return false;
        return cardNumber == card.cardNumber;
    }

    @Override
    public int hashCode() {
        int result = shape != null ? shape.hashCode() : 0;
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        return result;
    }
}
