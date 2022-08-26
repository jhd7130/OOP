package blackJack.domain;


import blackJack.domain.wrapper.CardNumber;
import blackJack.domain.wrapper.Shape;

public class Card {

    private Shape cardShape;
    private CardNumber cardNumber;

    private Card(Shape cardShape, String cardNumber) {
        this.cardShape = cardShape;
        this.cardNumber = new CardNumber(cardNumber);
    }

    public static Card from(Shape cardShape, String cardNumber) {
        return new Card(cardShape, cardNumber);
    }

    public String currentCard() {
        return cardNumber.currentCardNumber() + " : " + cardShape.currentShape();
    }
}
