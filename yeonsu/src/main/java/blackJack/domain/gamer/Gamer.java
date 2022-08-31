package blackJack.domain.gamer;

import blackJack.domain.Card;

import java.util.List;

public interface Gamer {

    String currentName();

    List<Card> currentCard();

    int currentScore();
}
