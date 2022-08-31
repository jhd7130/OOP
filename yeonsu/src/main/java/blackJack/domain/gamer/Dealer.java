package blackJack.domain.gamer;

import blackJack.domain.Card;
import blackJack.util.CalculateCardScore;
import carRacing.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Gamer {

    private List<Card> dealerCard;

    private Dealer() {
        this.dealerCard = new ArrayList<>();
    }

    public Dealer getInstance() {
        return new Dealer();
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
