package blackJack.domain;

import blackJack.domain.wrapper.Shape;
import blackJack.infra.DomainUtil;

import java.util.*;

public class Deck {

    private static List<Card> deck;
    private int counter = 0;

    private Deck() {
        deck = new ArrayList<>();
        deckSetting();
        deckShuffle();
    }

    public static Deck init() {
        return new Deck();
    }

    private void deckSetting() {
        Iterator<Shape> iterator = Arrays.stream(Shape.values()).iterator();
        while (iterator.hasNext()) {
            Shape next = iterator.next();
            for (int i = 0; i < DomainUtil.cardNumbers.size(); i++) {
                deck.add(Card.from(next, DomainUtil.cardNumbers.get(i)));
            }
        }
    }
    private void deckShuffle() {
        Collections.shuffle(deck);
    }

    public void printDeck() {
        deck.stream().forEach(card -> System.out.println(card.currentCard()));
    }

    public static Card gameInitHandOutCards() {
        Card card = deck.get(0);
        deck.remove(card);
        return card;
    }
}
