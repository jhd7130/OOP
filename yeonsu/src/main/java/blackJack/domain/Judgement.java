package blackJack.domain;

import blackJack.infra.ConsoleOut;

public class Judgement {

    private Deck deck;
    private Dealer dealer;
    private Players players;

    private Judgement(Deck deck, Dealer dealer, Players players) {
        this.deck = deck;
        this.dealer = dealer;
        this.players = players;
        settingInit();
        print();
    }

    public static Judgement of(Deck deck, Dealer dealer, Players players) {
        return new Judgement(deck, dealer, players);
    }

    public void print() {
        System.out.println(ConsoleOut.DEALER_NAME + players.playerNameMessage() + ConsoleOut.GIVE_TWO_CARDS_MESSAGE);
        dealer.dealerCardList();
        players.currentPlayers().stream().forEach(Player::playerCardsPrint);
    }

    private void settingInit() {
        for (int i = 0; i < ConsoleOut.INIT_CARD_AMOUNT; i++) {
            dealer.addCard(deck.gameInitHandOutCards());
            playersGameInitCardSetting();
        }
    }

    private void playersGameInitCardSetting() {
        for (Player player : players.currentPlayers()) {
            player.getCard(deck.gameInitHandOutCards());
        }
    }
}
