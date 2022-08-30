package blackJack.domain;

import java.util.List;

public class Dealer {

    private Deck deck;
    private Players players;

    private Dealer(Deck deck, Players players) {
        this.deck = deck;
        this.players = players;
        settingInit(deck, players);
    }

    public static Dealer of(Deck deck, Players players) {
        return new Dealer(deck, players);
    }


    /*
    * Stream이 오히려 안티 패턴이 되는 경우
    * */
    private void settingInit(Deck deck, Players players) {
        for (Player player : players.currentPlayers()) {
            for (int i = 0; i < 2; i++) {
                player.getCardFromDealer(deck.gameInitHandOutCards());
            }
        }
    }
}
