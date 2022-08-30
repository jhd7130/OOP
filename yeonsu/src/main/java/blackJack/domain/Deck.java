package blackJack.domain;

import blackJack.domain.wrapper.CardNumber;
import blackJack.domain.wrapper.Shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {

    private static List<Card> deck;

    private Deck() {
        this.deck = new ArrayList<>();
        setting();
        shuffleCards();
    }

    private void shuffleCards() {
        Collections.shuffle(deck);
    }

    public static Deck getInstance() {
        return new Deck();
    }

    private void setting() {
        shapeSetting(Shape.values(), CardNumber.values());
    }

    private void shapeSetting(Shape[] shapes, CardNumber[] cardNumbers) {
        for (Shape shape : shapes) {
            cardNumberSetting(cardNumbers, shape);
        }
    }

    private void cardNumberSetting(CardNumber[] cardNumbers, Shape shape) {
        for (CardNumber cardNumber : cardNumbers){
            deck.add(Card.of(shape, cardNumber));
        }
    }

    public List<Card> currentDeck() {
        return deck;
    }

    public static Card giveCard() {
        Card card = deck.get(0);
        deck.remove(card);
        return card;
    }
}
