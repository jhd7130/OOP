package blackJack.domain;

import blackJack.infra.ConsoleOut;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Gamer {

    private List<Card> dealerCard;
    private int cardResult = 0;

    private Dealer() {
        dealerCard = new ArrayList<>();
    }

    public static Dealer getInstance() {
        return new Dealer();
    }

    @Override
    public String currentName() {
        return ConsoleOut.DEALER;
    }

    public void addCard(Card card) {
        dealerCard.add(card);
    }

    public void dealerCardList() {
        System.out.print(ConsoleOut.DEALER + " : ");
        dealerCard.stream().forEach(card -> System.out.print(card.currentCard() + " "));
        System.out.println();
    }
}
