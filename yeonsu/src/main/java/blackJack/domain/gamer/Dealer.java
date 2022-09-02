package blackJack.domain.gamer;

import blackJack.domain.Card;
import blackJack.domain.Deck;
import blackJack.util.CalculateCardScore;
import blackJack.util.ConsoleOut;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Gamer {

    private List<Card> dealerCard;
    private int money;

    private Dealer() {
        this.dealerCard = new ArrayList<>();
        this.money = 0;
        initTwoCards();
    }

    public static Dealer getInstance() {
        return new Dealer();
    }

    public void initTwoCards() {
        for (int i = 0; i < 2; i++) {
            getCard();
        }
    }
    private void getCard() {
        dealerCard.add(Deck.giveCard());
    }

    public void printCards() {
        System.out.print("Dealer : ");
        dealerCard.stream().forEach(card -> System.out.print(card.toString() + " "));
        System.out.println();
    }

    public void printCardsIncludeResult() {
        System.out.print("Dealer : ");
        dealerCard.stream().forEach(card -> System.out.print(card.toString() + " "));
        System.out.println("- 현재 카드 합 : " + currentScore());

    }

    public void getMoreCardOrNot() {
        if (currentScore() <= ConsoleOut.DEALER_ALLOW_CARD_NUMBER) {
            System.out.println(ConsoleOut.DEALER_SCORE_NOT_OVER_SIXTEEN);
            getCard();
        } else if (currentScore() > ConsoleOut.DEALER_ALLOW_CARD_NUMBER) {
            System.out.println(ConsoleOut.DEALER_SCORE_OVER_SIXTEEN);
        }

    }

    public int currentMoney() {
        return money;
    }

    @Override
    public String currentName() {
        return "Dealer";
    }

    @Override
    public List<Card> currentCard() {
        return dealerCard;
    }

    @Override
    public int currentScore() {
        return CalculateCardScore.cardScore(dealerCard);
    }

    public void getTotalMoney(int playersMoney) {
        System.out.println("Dealer : " + playersMoney);
    }
}
