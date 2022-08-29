package blackJack.domain;

import java.util.List;

public class Dealer {

    private Deck deck;
    private Players players;

    private Dealer(Deck deck, Players players) {
        this.deck = deck;
        this.players = players;
    }

    public static Dealer of(Deck deck, Players players) {
        return new Dealer(deck, players);
    }
}
