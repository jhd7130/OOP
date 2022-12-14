package blackJack.domain.gamer;

import blackJack.domain.Card;
import blackJack.domain.Deck;
import blackJack.domain.wrapper.PlayerQuestionnaire;
import blackJack.exception.PlayerHaveToInputAgainCharYOrN;
import blackJack.util.CalculateCardScore;
import blackJack.util.ConsoleIn;
import blackJack.util.ConsoleOut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements Gamer {


    private String playerName;
    private List<Card> playerCards;
    private int Money;

    private Player(String playerName) {
        this.playerName = playerName;
        playerCards = new ArrayList<>();
        playerMoneySetting();
        initTwoCards();
    }

    private void playerMoneySetting() {
        System.out.println(playerName + ConsoleOut.PLAYER_BATTING_MESSAGE);
        Money = ConsoleIn.PlayerMoneyInput();
    }

    public static Player from(String playerName) {
        return new Player(playerName);
    }

    private void initTwoCards() {
        for (int i = 0; i < 2; i++) {
            getCard();
        }
    }

    public void printCards() {
        System.out.print(playerName + " : ");
        playerCards.stream().forEach(card -> System.out.print(card.toString() + " "));
        System.out.println();
    }

    public void printCardsIncludeResult() {
        System.out.print(playerName + " : ");
        playerCards.stream().forEach(card -> System.out.print(card.toString() + " "));
        System.out.println("- 현재 카드 합 : " + currentScore());
    }

    public void printMoney() {
        System.out.println(playerName + " : " + Money);
    }

    public void getMoreCardOrNot() {
        while (true) {
            System.out.println(playerName + ConsoleOut.PLAYER_MORE_CARD_OR_NOT);
            Character answer = ConsoleIn.MoreCardOrNot();
            if (PlayerQuestionnaire.isRightAnswer(answer)) { // return true or false
                if (answer == 'Y' || answer == 'y') {
                    getCard();
                    printCards();
                    continue;
                } else {
                    break;
                }
            }
            throw new PlayerHaveToInputAgainCharYOrN(ConsoleOut.PLAYER_INPUT_AGAIN_MESSAGE_EXCEPTION);
        }
    }

    private void getCard() {
        playerCards.add(Deck.giveCard());
    }

    @Override
    public String currentName() {
        return playerName;
    }

    @Override
    public List<Card> currentCard() {
        return playerCards;
    }

    @Override
    public int currentScore() {
        return CalculateCardScore.cardScore(playerCards);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        return playerName != null ? playerName.equals(player.playerName) : player.playerName == null;
    }

    @Override
    public int hashCode() {
        return playerName != null ? playerName.hashCode() : 0;
    }

    public int currentMoney() {
        return Money;
    }

    public void winGame() {
        this.Money = (int) (Money * (1.5));
    }

    public void looseGame() {
        this.Money = (-1) * Money;
    }

}
