package blackJack.domain;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Gamer {

    private List<Card> dealerCard;

    private Dealer() {
        dealerCard = new ArrayList<>();
    }

    public static Dealer getInstance() {
        return new Dealer();
    }

    public void addCard(Card card) {
        dealerCard.add(card);
    }

    public void dealerCardList() {
        System.out.print("Dealer : ");
        dealerCard.stream().forEach(card -> System.out.print(card.currentCard() + " "));
        System.out.println();
    }
}
