package blackJack.domain.gamer;

import blackJack.domain.Card;
import blackJack.domain.Deck;
import blackJack.util.CalculateCardScore;
import carRacing.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Gamer {

    private List<Card> dealerCard;

    private Dealer() {
        this.dealerCard = new ArrayList<>();
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
}
